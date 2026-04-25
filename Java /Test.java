class teeest{
    private String contraseña;


    //Tenemos que crear un metodo igual que los otros pero le garegas el set alado del nombre
    public void setContraseña(String nueva_Contraseña){
        this.contraseña=nueva_Contraseña;
    }

    public String getcontraseñaa(){
        return this.contraseña;
    }
}
public class Test{
    public static void main(String[] args) {

        teeest objeto=new teeest();

        objeto.setContraseña("Esa sera mi contraseña lololo");
    

        System.out.println("Hola"+objeto.getcontraseñaa());
}
}
