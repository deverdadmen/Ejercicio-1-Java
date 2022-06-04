public class Main {
    public static void main(String[] args) {

        suma(20,6,97);

        Coche miCoche = new Coche();
        miCoche.PlusPuerta();
        miCoche.PlusPuerta();
        miCoche.PlusPuerta();
        miCoche.PlusPuerta();
        System.out.println(miCoche.puertas);

    }

    public static void suma(int a,int b,int c){
        int resultado = a + b + c;
        System.out.println(resultado);
    }

    static class Coche {

       public int puertas = 0;

       public void PlusPuerta(){
           this.puertas++;
       }

    }
}