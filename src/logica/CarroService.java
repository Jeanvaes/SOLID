package logica;

import bd.DatabaseMysql;
import modelo.BDguardarCoche;
import modelo.Carro;

public class CarroService {

    private BDguardarCoche guardarCoche;

    public void guardarCocheDB(Carro carro) {
        DatabaseMysql db = new DatabaseMysql();
        db.guardar();
        guardarCoche.guardarCocheDB();
    }
    public CarroService(BDguardarCoche carro) {
        this.guardarCoche = carro;
    }
}
