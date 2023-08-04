package modelo;

public abstract class Carro  {

    private final String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }


    public abstract void Precio();



}
