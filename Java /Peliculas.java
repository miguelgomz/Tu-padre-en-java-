class Pelicula{
    String titulo;
    int año;
    int duracion;

    String tituloo;
    int añoo;
    int duracioon;
}
public class Peliculas {
    public static void main(String[] args) {

        Pelicula mi_pelicula = new Pelicula();

        mi_pelicula.titulo="Transformers ";
        mi_pelicula.año=2002;
        mi_pelicula.duracion=90;

        Pelicula mi_peliculaa = new Pelicula();

        mi_peliculaa.tituloo="Transformers 2  ";
        mi_peliculaa.añoo=2007;
        mi_peliculaa.duracioon=95;

        System.out.println("Hola esto son lo sdato s"+mi_pelicula.titulo);
        System.out.println("Hola esto son lo sdato s"+mi_pelicula.año);
        System.out.println("Hola esto son lo sdato s"+mi_pelicula.duracion);

        System.out.println("Hola esto son lo sdato s"+mi_peliculaa.tituloo);
        System.out.println("Hola esto son lo sdato s"+mi_peliculaa.añoo);
        System.out.println("Hola esto son lo sdato s"+mi_peliculaa.duracioon);

        int duracion_ambas=mi_pelicula.duracion +mi_peliculaa.duracioon;

         System.out.println("Hola esta es la duracion de ambas"+ duracion_ambas);

        
    }
    
}
