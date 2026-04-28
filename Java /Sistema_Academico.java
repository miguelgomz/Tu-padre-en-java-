
class Datos_alumnos{
    String nombres;
    int edad;
    int salon;
    public void texto1(){
    System.out.println("Hola estos son mis datos"+nombres+" "+salon+" "+edad);
    }
}
class id_alumno extends Datos_alumnos{
    int id_alum;
    public void texto2(){
        System.out.println("Enseñar mis datos "+id_alum);
    }
}
class constructor extends id_alumno{

    constructor (int edadd,int salonn,int id_alumnoo){ 
        this.edad=edadd;
        this.salon=salonn;
        this.id_alum=id_alumnoo;
    
    }
}




public class Sistema_Academico {
    
}
