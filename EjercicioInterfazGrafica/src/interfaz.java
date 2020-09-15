import javax.naming.ldap.Control;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz extends JFrame implements ActionListener {

    private int carCount =1;
    private JLabel numberOne;
    private JTextField textOne;
    private JLabel numberTwo;
    private JTextField textTwo;
    private JButton button;


    public static void main (String[]args) {
        interfaz frame = new interfaz();
        frame.setSize(190,200);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container windows = getContentPane();
        windows.setLayout(new FlowLayout());
        numberOne = new JLabel("Numero 1");
        textOne = new JTextField(10);
        numberTwo = new JLabel("Numbero 2");
        textTwo = new JTextField(10);
        button = new JButton("Car Entering");
        windows.add(numberOne);
        windows.add(textOne);
        windows.add(numberTwo);
        windows.add(textTwo);
        windows.add(button);
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int valorUno = Integer.parseInt(textOne.getText());
        int valorDos = Integer.parseInt(textTwo.getText());
        if(valorUno==valorDos)
            JOptionPane.showMessageDialog(null, "Los numeros son iguales");
        else if (valorUno>valorDos)
            JOptionPane.showMessageDialog(null, "El numero "+valorUno+ " es mayor que "+valorDos);
        else
            JOptionPane.showMessageDialog(null, "El numero "+valorDos+ " es mayor que "+valorUno);
    }
}
