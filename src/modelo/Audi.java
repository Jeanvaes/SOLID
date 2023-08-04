package modelo;

public class Audi extends Carro{

    private BDguardarCoche guardarCoche;
    @Override
    public void Precio() {
        System.out.println("25000");
    }

    public void guardarCocheDB() { System.out.println("Guarde Audi en BD"); }
}
