package main;

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

        //Guardar carro en la BD.
        CarroService service = new CarroService();
        service.guardarCocheDB(new Renault());

    }

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            carro.Precio();
            }
        }
}
