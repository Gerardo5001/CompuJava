public class cicloDoWhile {

    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void ciclo(){
        do{
            System.out.println("El numero "+ numero + " es menor a 10");
            numero++;
        }while (numero<10);
    }
}
