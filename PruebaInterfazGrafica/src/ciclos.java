import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ciclos extends JFrame implements ActionListener {

    private JLabel greetingLabel;
    private JTextField ageField;
    private JButton button;
    private JTextField desicionField;
    private JTextField comentaryField;
    private JTextField singOffField;
    private JTextField prueba;

    public static void main(String[]args){
        ciclos demo = new ciclos();
        demo.setSize(100,300);
        demo.createGUI();
        demo.setVisible(true);
    }

    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container windows = getContentPane();
        windows.setLayout(new FlowLayout());
        greetingLabel = new JLabel("Enter you age");
        windows.add(greetingLabel);
        ageField = new JTextField(5);
        windows.add(ageField);
        button = new JButton("check");
        windows.add(button);
        button.addActionListener(this);
        desicionField = new JTextField(10);
        windows.add(desicionField);
        comentaryField = new JTextField(10);
        windows.add(comentaryField);
        prueba = new JTextField(20);
        windows.add(prueba);
        singOffField = new JTextField(10);
        windows.add(singOffField);
    }
    @Override
    public void actionPerformed(ActionEvent event) {
        int age;
        age = Integer.parseInt(ageField.getText());
        if(age>17){
            desicionField.setText("You may not vote");
            comentaryField.setText("Congratulations");
        }
        else{
            desicionField.setText("You may not vote");
            comentaryField.setText("Sorry");
        }
        singOffField.setText("You may vote");
        comentaryField.setText("Congratulations");
    }
}