package modelo;

public class Renault extends Carro{

    private BDguardarCoche guardarCoche;
    @Override
    public void Precio() {
        System.out.println("18000");
    }

    public void guardarCocheDB() { System.out.println("Guarde Renault en BD"); }
}
