
class datosCoche{
    String modelo;
    String placas;

    public void textox(){
    System.out.println("esta es la clase model");
    }
}
    class añoCoche extends datosCoche{
        int añoc;
        public void textoxx(){
        System.out.println("Clase año");
    }
}

    class soberbia extends añoCoche{
        String sooberbia;
        public void textoxxx(){
        System.out.println("Soberbia");
        }
    }
    
public class Coche{
    public static void main(String[] args) {

        soberbia objeto = new soberbia();

        objeto.modelo="Mazda";
        objeto.añoc=2009;
        objeto.placas="LOl";
        objeto.sooberbia="Mucha confianza ";

        System.out.println("Hi"+objeto.modelo+objeto.añoc+objeto.placas+objeto.sooberbia);
   }
}

