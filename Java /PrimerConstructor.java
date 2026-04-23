class Constructor{

String texto;
int datos;


    Constructor Este_si_es_un_constructor(String texto_de_mi_constructor,int datos_cosntructor){
        this.texto=texto_de_mi_constructor;
        this.datos=datos_cosntructor;
        
    }

}


public class PrimerConstructor {
    public static void main(String[] args) {
        
    

    //Este es solo un objeto no tiene valor 
    Constructor Objetoo=new Constructor();

    Objetoo.texto="Podemops ver que aqui se guarda los valores de mi objeto osea por afuer";
    Objetoo.datos=15;

    System.out.println("Datos de mi objeto"+Objetoo.texto+""+Objetoo.datos);
    System.out.println("Valores de mi consttrructor");
    
}
}
