public class cicloIf {

    private int numero;


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void validarNumero(){
        if(numero==5)
            System.out.println("El numero es mayor a 10");
        else
            System.out.println("Numero menor a 10");
    }


}
