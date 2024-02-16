package org.ficha2902082.maven.parking.alexol;

//importar dependencias
import org.ficha2902082.maven.parking.alexol.entities.carro;
import org.ficha2902082.maven.parking.alexol.entities.Cliente;
import org.ficha2902082.maven.parking.alexol.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.alexol.entities.TipoDocumento;

public class Main {
    public static void main(String[] args) {

        // crear 2 instancias de la clase carro
        carro carrito1 = new carro();
        carrito1.placa = "ABS 345";
        carrito1.tipoVehiculo = TipoVehiculo.CAMIONETA;
        // taxi
        carro carrito2 = new carro();
        carrito2.placa = "CDE 678";
        carrito2.tipoVehiculo = TipoVehiculo.TAXI;
        // carrito3 moto
        carro carrito3 = new carro();
        carrito3.placa = "FGH 696";
        carrito3.tipoVehiculo = TipoVehiculo.MOTO;

        Cliente clientecito = new Cliente();
        clientecito.nombre = "Alex";
        clientecito.apellidos = "Olguin";
        clientecito.tipoDocumento = TipoDocumento.TI;
        clientecito.numeroDocumento = 1125291698L;
        clientecito.celular = 3009488676L;

        // anañdir carros al cliente
        // invocar , llamar , ejecutar el metodo
        // el metodo addCar
        clientecito.addCar(carrito1);
        clientecito.addCar(carrito2);
        clientecito.addCar("ABS 345", TipoVehiculo.CAMIONETA);

        System.out.println("Cliente: " + clientecito.nombre);
        System.out.println("documento: " + clientecito.numeroDocumento);
        System.err.println("Vehiculos");
        for (carro c : clientecito.misCarros) {
            System.out.println("placa:" + c.placa);
            System.out.println("tipo:" + c.tipoVehiculo);
            System.out.println("_______________");
        }

    }
}