import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        cicloIf cicloUno = new cicloIf();
        cicloUno.setNumero(1);
        cicloUno.validarNumero();

        cicloWhile cicloDos = new cicloWhile();
        cicloDos.correr();

        cicloDoWhile cicloTres = new cicloDoWhile();
        cicloTres.setNumero(1);
        cicloTres.ciclo();

        cicloFor cicloCuatro = new cicloFor();
        cicloCuatro.setNumero(5);
        cicloCuatro.ciclo();

        cicloSwitch cicloCinco = new cicloSwitch();
        cicloCinco.setNumero(2);
        cicloCinco.validarCaso();

    }
}
