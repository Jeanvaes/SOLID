package bd;

import logica.BDguardarCoche;
import modelo.Carro;

public class DatabaseMysql implements BDguardarCoche {

    public void guardarCocheDB(Carro carro) {
        System.out.println("Creo conexion a la base de datos");
        System.out.println("Guarde en la base de datos");
    }


}
