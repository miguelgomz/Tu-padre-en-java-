import java.util.Scanner;

class Metodos{

Scanner terminal=new Scanner(System.in);

public void pregunta(){
System.out.println("Dame tu numero ");  

}
public int numeroooo( ){
   int a=terminal.nextInt();
   terminal.nextLine();
    int triple=a*3;
    return triple;
}

   //Metodo de strings
public String nombre_completo(){
   System.out.println("Ingrese su nombre ");
   String a=terminal.nextLine();

   System.out.println("Ingrese su apellido ");
   String b=terminal.nextLine();
  
String nombre_comp=a+""+b;


return nombre_comp;


   }
}