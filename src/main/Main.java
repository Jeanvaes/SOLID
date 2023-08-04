package main;

import bd.DatabaseMysql;
import logica.CarroService;
import modelo.Audi;
import modelo.Carro;
import modelo.Renault;

public class Main {
    public static void main(String[] args) {
        Carro[] arrayCoches = {
                new Renault(),
                new Audi()
        };
        imprimirPrecioMedioCoche(arrayCoches);

        CarroService service = new CarroService(new DatabaseMysql());
        service.guardarCocheDB(new Audi());
        

    }


    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            carro.Precio();
            }
        }
}
