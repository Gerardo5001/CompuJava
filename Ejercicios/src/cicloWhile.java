public class cicloWhile {

    private int numero;

    public cicloWhile(){
        numero=0;
    }

    public void correr(){

        while ( numero<10){
            System.out.println("El ciclo va en "+numero);
            numero++;
        }
    }
}
