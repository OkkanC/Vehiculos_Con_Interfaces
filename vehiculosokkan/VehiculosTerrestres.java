
package vehiculosokkan;


public class VehiculosTerrestres implements Ruedas,Asientos,Sonido {
    
    public String carro(){
    System.out.print("El carro: ");
        return " ";
    }
    public String moto(){
    System.out.print("La moto: ");
    return " ";
    }
    public String bicicleta(){
    System.out.print("La bicicleta: ");
    return " ";
    }
    public String bus(){
    System.out.print("El bus:");
    return " ";
    }

    @Override
    public String avanzar() {
        System.out.print("está avanzando");
        return " ";
    }

    @Override
    public String detenerse() {
        System.out.print("está deteniéndose");
        return " ";
    }

    @Override
    public String comodos() {
    System.out.print("Sus asientos son cómodos");
        return " ";
    }

    @Override
    public String noUtilizandose() {
    System.out.print("No está utilizando sus asientos");
        return " ";
    }

    @Override
    public String incomodos() {
    System.out.print("Sus asientos son muy incómodos");
        return " ";
    }

    @Override
    public String claxon() {
    System.out.print("Toca el claxón");
        return " ";
    }

    @Override
    public String timbre() {
    System.out.print("Toca el timbre");
        return " ";
    }

    @Override
    public String noTiene() {
    return "";
            }
    
}
