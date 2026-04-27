class temmp {
    private double temperatura = 20;

    // EL GUARDIA DE SEGURIDAD (Solo usamos un método Setter, no dos)
    public void setcalor(double intentoDeValor) {
        
        // 1. PRIMERO VERIFICAMOS
        if (intentoDeValor > 45) {
            System.out.println("Hola, valor muy alto (" + intentoDeValor + "). Acceso denegado.");
            // No hacemos nada más, así this.temperatura se queda con su valor original
            
        } else if (intentoDeValor <= 0) {
            System.out.println("Valor muy bajo (" + intentoDeValor + "). Acceso denegado.");
            // Tampoco hacemos nada
            
        } else {
            // 2. SI TODO ESTÁ BIEN, ENTONCES SÍ CAMBIAMOS LA VARIABLE
            this.temperatura = intentoDeValor;
        }
    }

    // EL LECTOR (Getter)
    public double getcaloorr() {
        return this.temperatura;
    }
}

public class Termometro_mejor {
    public static void main(String[] args) {
        temmp obbjeto = new temmp();

        System.out.println("Temp inicial: " + obbjeto.getcaloorr()); // Imprime 20.0

        // Intentamos meter un 60
        obbjeto.setcalor(60); 
        // Imprime el mensaje de error, pero como el Setter lo bloqueó, 
        // el 60 NUNCA llegó a guardarse. La temperatura sigue intacta.
        System.out.println("Temp después del intento malo: " + obbjeto.getcaloorr()); // Sigue imprimiendo 20.0

        // Intentamos meter un 22
        obbjeto.setcalor(22);
        // Como 22 es correcto, pasa al "else" y se guarda.
        System.out.println("Temp después del intento bueno: " + obbjeto.getcaloorr()); // Ahora imprime 22.0
    }
}
