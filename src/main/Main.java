package main;

import logica.CarroService;
import modelo.Audi;
import modelo.Carro;
import modelo.Renault;

public class Main {
    public static void main(String[] args) {
        Carro[] arrayCoches = hacerListaCarros();
        imprimirPrecioMedioCoche(arrayCoches);
        guardarCoche(arrayCoches);

    }

    public static void guardarCoche(Carro[] arrayCoches){
        for (Carro carro : arrayCoches) {
            CarroService carroService = new CarroService(carro);
            carroService.guardarCocheDB(carro);
        }
    }

    public static Carro[] hacerListaCarros(){
        return new Carro[]{
                new Renault(),
                new Audi()
        };
    }

    public static void imprimirPrecioMedioCoche(Carro[] carros) {
        for (Carro carro : carros) {
            carro.Precio();
            }
        }
}
