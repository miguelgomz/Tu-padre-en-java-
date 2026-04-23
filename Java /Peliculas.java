class Pelicula{
    String titulo;
    int año;
    int duracion;
}

public class Peliculas {
    public static void main(String[] args) {

        Pelicula mi_pelicula = new Pelicula();

        mi_pelicula.titulo="Transformers ";
        mi_pelicula.año=2002;
        mi_pelicula.duracion=90;

        Pelicula mi_peliculaa = new Pelicula();

        mi_peliculaa.titulo="Transformers 2  ";
        mi_peliculaa.año=2007;
        mi_peliculaa.duracion=95;

        System.out.println("Hola esto son lo sdato s"+mi_pelicula.titulo);
        System.out.println("Hola esto son lo sdato s"+mi_pelicula.año);
        System.out.println("Hola esto son lo sdato s"+mi_pelicula.duracion);

        System.out.println("Hola esto son lo sdato s"+mi_peliculaa.titulo);
        System.out.println("Hola esto son lo sdato s"+mi_peliculaa.año);
        System.out.println("Hola esto son lo sdato s"+mi_peliculaa.duracion);

        int duracion_ambas=mi_pelicula.duracion +mi_peliculaa.duracion;

         System.out.println("Hola esta es la duracion de ambas"+ duracion_ambas);

        
    }
    
}
