class Datos_guerreros{
    String nombres_personajes;
    int vida;
 
    public int daño_modificar(int n){
      this.vida=this.vida-n;
      return this.vida;
    }
    public boolean estaVivo(int n ){
        
        if(n>0){
            return true;
        }else {
            return false;
        }
 }
 public void estatus_personaje(){


    if (this.estaVivo(this.vida)){
        System.out.println("Tu personaje sigue vivo "+this.nombres_personajes+""+this.vida);
 }else{
    System.out.println("Tu personaje esta mas que dead "+this.nombres_personajes+""+this.vida);
 }


}
}
 
 public class Guerrero {
    public static void main(String[] args) {


        Datos_guerreros Personaje=new Datos_guerreros();
        Datos_guerreros Personajee=new Datos_guerreros();
        Personaje.nombres_personajes="Ragnar";
        Personajee.nombres_personajes="Luis";
        Personaje.vida=100;
        Personajee.vida=200;
        Personaje.daño_modificar(40);

        Personaje.estaVivo(Personaje.vida);
        Personajee.estaVivo(Personajee.vida);

        Personaje.daño_modificar(70);
        Personajee.daño_modificar(100);
        Personaje.estatus_personaje();
        Personajee.estatus_personaje();
 
    }
 }

