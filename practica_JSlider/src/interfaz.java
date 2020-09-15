import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz extends JFrame implements ChangeListener, ActionListener {

    private JSlider deslizante;
    private JTextField campoTexto;
    private JButton boton;
    int max = 0;

    public static void main(String [] args){
        interfaz demo = new interfaz();
        demo.setSize(200,300);
        demo.createGUI();
        demo.setVisible(true);

    }
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        deslizante = new JSlider(JSlider.VERTICAL,0,100,0);
        deslizante.setMajorTickSpacing(10);
        deslizante.setPaintTicks(true);
        deslizante.addChangeListener(this);
        ventana.add(deslizante);
        campoTexto = new JTextField(12);
        ventana.add(campoTexto);
        boton = new JButton("Restablecer");
        ventana.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        campoTexto.setText("");
        max=0;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int temp;
        temp = deslizante.getValue();
        if(temp>max)
            max = temp;
    mostrar();
    }
    private void mostrar(){
        campoTexto.setText("EL valor maximmo es: "+max);
    }

}
