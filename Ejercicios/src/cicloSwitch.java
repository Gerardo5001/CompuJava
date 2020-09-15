public class cicloSwitch {

    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void validarCaso(){
        switch (numero){
            case 1:
                System.out.println("Entro al caso 1");
                break;
            case 2:
                System.out.println("Entro al caso 2");
                break;
            default:
                System.out.println("No entro a ningun caso");
                break;
        }
    }
}
