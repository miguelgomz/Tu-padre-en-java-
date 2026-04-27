class temmp {
    private double temperatura=20;


    public double setcalor(double segun){
        this.temperatura=segun;
        return this.temperatura;
    }


    public double setcaalor(double verificacion){


        if(this.temperatura>45){
            System.out.println("Hola valor muy alto no se puede la regresare a su valor inicial  ");
            this.temperatura=20;
            return temperatura;
           
            }else if (this.temperatura<=0){
            System.out.println("Valor muy bajo no se puede ");
            this.temperatura=20;
            return temperatura;
           
           
        } else{
                return this.temperatura;
        }


    }
        public double getcaloorr(){
            return this.temperatura;
        }


    }


public class Termometro{
    public static void main(String[] args) {
        temmp obbjeto= new temmp();


        System.out.println("Hola esta es la temp inicial"+" "+obbjeto.getcaloorr());


        obbjeto.setcalor(60);
        obbjeto.setcaalor(1);


        System.out.println("Hola esta es la temp 1s"+" "+obbjeto.getcaloorr());


        obbjeto.setcalor(22);
        obbjeto.setcaalor(1);
        System.out.println("Hola esta es la temp 2s"+" "+obbjeto.getcaloorr());
       
    }
}
