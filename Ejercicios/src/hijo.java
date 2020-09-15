public class hijo extends padre{

    private int numeroLlantas;
    private String conbustible;

    void impromirCaracteristicas(String marca, String modelo, String color, int numeroLlantas, String conbustible){
        super.setMarca(marca);
        super.setModelo(modelo);
        super.setColor(color);
        setNumeroLlantas(numeroLlantas);
        setConbustible(conbustible);
        System.out.println(super.getMarca());
        System.out.println(super.getModelo());
        System.out.println(super.getColor());
        System.out.println(getNumeroLlantas());
        System.out.println(getConbustible());
    }

    //get y set de numeroLlantas
    public int getNumeroLlantas() {
        return numeroLlantas;
    }
    public void setNumeroLlantas(int numeroLlantas){
        this.numeroLlantas = numeroLlantas;
    }
    //get y set de conbustible
    public String getConbustible() {
        return conbustible;
    }
    public void setConbustible(String conbustible){
        this.conbustible = conbustible;
    }
}
