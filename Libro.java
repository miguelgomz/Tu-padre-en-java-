class Libros{
    String titulo;
    int paginas;


    Libros (String Referencia_libro,int  Referencia_paginas){
        this.titulo=Referencia_libro;
        this.paginas=Referencia_paginas;
    }
    Libros (String Refrenciaa_titulo ){
        this.titulo=Refrenciaa_titulo;
        this.paginas=100;
    }
}


public class Libro {
    public static void main(String[] args) {


        Libros Objeto_creado_constructor=new Libros("el payasito",355);
        Libros Objetoo_creado_constructor=new Libros("amor la peli");


        System.out.println("valores primer constructor "+Objeto_creado_constructor.titulo+""+Objeto_creado_constructor.paginas);
        System.out.println("valores primer constructor "+Objetoo_creado_constructor.titulo+""+Objetoo_creado_constructor.paginas);
    }    
}
