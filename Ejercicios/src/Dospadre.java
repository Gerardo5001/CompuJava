public class Dospadre {

    private int base;
    private int altura;
    private int dividendo;

    public void calcular(int base){
        this.base=base;
        System.out.println("El area del cuadrado es: "+base*base);
    }

    public void calcular(int base, int altura){
        this.base = base;
        this.altura = altura;

        System.out.println("El area del  rectangulo es: "+ altura*base);
    }
    public void calcular(int base, int altura, int dividendo){
        this.base = base;
        this.base = altura;
        System.out.println("El area del triangulo es: "+ (base*altura) / dividendo);
    }

}


