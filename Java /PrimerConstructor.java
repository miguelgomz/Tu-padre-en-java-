class Constructor{

String texto;
int datos;


    Constructor (String texto_de_mi_constructor,int datos_cosntructor){
        this.texto=texto_de_mi_constructor;
        this.datos=datos_cosntructor;
        
    }

}


public class PrimerConstructor {
    public static void main(String[] args) {
        
    

    //Este es solo un objeto no tiene valor 
    Constructor Objetoo=new Constructor("Podemops ver que aqui se guarda los valores de mi objeto osea por afuer",15);


    System.out.println("Datos de mi objeto"+Objetoo.texto+""+Objetoo.datos);
    System.out.println("Valores de mi consttrructor");
    
}
}
