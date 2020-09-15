import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class operaciones extends JFrame implements ActionListener {

    private JLabel labelUno;
    private JTextField textUno;
    private JLabel labelDos;
    private JTextField textDos;
    private JButton boton;
    private JLabel resultado;


    public static void main(String [] args){
        operaciones frame = new operaciones();
        frame.setSize(600,250);
        frame.createGUI();
        frame.setVisible(true);


    }
    private void createGUI(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container ventana = getContentPane();
        ventana.setLayout(new FlowLayout());
        labelUno = new JLabel("Ingresa el primer valor:");
        textUno = new JTextField(10);
        labelDos = new JLabel("Ingresa el segundo valor: ");
        textDos = new JTextField(10);
        boton = new JButton("Calcular");
        resultado = new JLabel("Presiona cacular...");
        ventana.add(labelUno);
        ventana.add(textUno);
        ventana.add(labelDos);
        ventana.add(textDos);
        ventana.add(resultado);
        boton.addActionListener(this);
        ventana.add(boton);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int valorUno = Integer.parseInt(textUno.getText());
        int valorDos = Integer.parseInt(textDos.getText());
        resultado.setText("X= " + valorUno +" Y= " + valorDos + " Suma: " + sumar(valorUno,valorDos) + " Resta: " + resta(valorUno,valorDos) + " Multiplicacion: "+ multiplicar(valorUno,valorDos)+
                " Division: " + dividir(valorUno,valorDos)+" Modulo: "+modulo(valorUno,valorDos));

    }
    public int sumar(int numeroUno, int numeroDos){
        return numeroUno+numeroDos;
    }
    public int resta(int numeroUno, int numeroDos){
        return numeroUno-numeroDos;
    }
    public int multiplicar(int numeroUno, int numeroDos){
        return numeroUno*numeroDos;
    }
    public int dividir(int numeroUno, int numeroDos){
        return numeroUno/numeroDos;
    }
    public int modulo(int numeroUno, int numeroDos){
        return numeroUno%numeroDos;
    }
}
