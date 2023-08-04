package logica;


import modelo.Carro;


public class CarroService {
    private BDguardarCoche guardar;

    public CarroService(BDguardarCoche guardar) {
        this.guardar = guardar;
    }

    public void guardarCocheDB(Carro carro)
    {
        BDguardarCoche db = guardar;
        db.guardarCocheDB(carro);

        System.out.println("Se guardo el carro de marca: "+carro.getMarca() + " en la BD");



    }



}
