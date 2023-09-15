package vehiculosokkan;

public class VehiculosOkkan {

    public static void main(String[] args) {

    VehiculosTerrestres vh = new VehiculosTerrestres();
    
        
    System.out.println("---Vehéiculos Terrestres---");
    System.out.println("");
    System.out.println(vh.carro()+ vh.avanzar()); System.out.println(vh.comodos());
    System.out.print("Pero luego de unos kilómetros. ");System.out.println(vh.carro()+ vh.detenerse());
    System.out.println(vh.claxon());System.out.println("");
    
    System.out.println(vh.moto()+ vh.avanzar()); System.out.println(vh.incomodos());
    System.out.print("Pero luego de unos kilómetros. ");System.out.println(vh.moto()+ vh.detenerse());
    System.out.println(vh.claxon()); System.out.println("");
    
    System.out.println(vh.bicicleta()+ vh.avanzar());
    System.out.print("Pero... ");System.out.println(vh.bicicleta()+ vh.detenerse()); System.out.println(vh.noUtilizandose());
    System.out.println(vh.claxon()); System.out.println("");
    
    VehiculosAereos vha = new VehiculosAereos();
    
    System.out.println("---Vehéiculos Aéreos---");
    System.out.println("");
    System.out.println(vha.avion() + vha.detenerse()); System.out.print(vha.comodos() + vha.dosAlas());
    System.out.println("");System.out.println("");
    System.out.println(vha.helicoptero()+ vha.noTiene()); System.out.print(vha.comodos() + vha.multiplesAlas());
    System.out.println("");System.out.println("");
    System.out.println(vha.avioneta()+ vha.noTiene()); System.out.print(vha.incomodos()); System.out.println(vha.multiplesAlas());
    
    
    }
    
}
