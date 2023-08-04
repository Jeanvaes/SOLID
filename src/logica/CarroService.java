package logica;

import bd.DatabaseMysql;
import modelo.Carro;

public class CarroService {
    private BDguardarCoche guardar;

    public CarroService(BDguardarCoche guardar) {
        this.guardar = guardar;
    }

    public void guardarCocheDB(Carro carro) {
        BDguardarCoche db = new DatabaseMysql();
        db.guardarCocheDB(carro);
    }



}
