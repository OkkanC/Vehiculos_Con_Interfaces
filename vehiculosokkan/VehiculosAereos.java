
package vehiculosokkan;


public class VehiculosAereos implements Ruedas,Asientos,Alas{

    public String avion(){
    System.out.print("El Avión ");
        return " ";
    }
    
    public String helicoptero(){
    System.out.print("El Helicóptero ");
        return " ";
    }
    
    public String avioneta(){
    System.out.print("La Avioneta ");
        return " ";
    }
    
    @Override
    public String detenerse() {
    System.out.print("Utiliza Ruedas para detenerse");
        return " ";
    }

    @Override
    public String comodos() {
    System.out.println("Sus asientos son comodos");
        return " ";
    }

    @Override
    public String incomodos() {
    System.out.print("Sus asientos son incómodos");
        return " ";
    }

    @Override
    public String noUtilizandose() {
    System.out.print("A veces no se utilizan asientos");
        return " ";
    }

    @Override
    public String avanzar() {
    return "";
    }

    @Override
    public String dosAlas() {
    System.out.print("Únicamente tiene dos alas");
        return " "; 
    }

    @Override
    public String multiplesAlas() {
    System.out.print("Tiene múltiples alas");
        return " ";
    }

    @Override
    public String noTiene() {
    System.out.print("no utiliza ruedas");
    return "";
    }
    
}
