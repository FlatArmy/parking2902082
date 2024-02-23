package org.ficha2902082.maven.parking.alexol;


import org.ficha2902082.maven.parking.alexol.entities.Car;
import org.ficha2902082.maven.parking.alexol.entities.Cliente;
import org.ficha2902082.maven.parking.alexol.entities.Cupo;
import org.ficha2902082.maven.parking.alexol.entities.TipoDocumento;
import org.ficha2902082.maven.parking.alexol.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.alexol.entities.Registro;

import java.util.List;
import java.util.ArrayList;

import java.time.*;

public class Main {
    public static void main(String[] args) {
    
        //Crear dos cupos
        //Instanciar dos cupos:
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        Cupo cupito2 = new Cupo('B', 5.0 , 2.5 );
        
        //Instanciar dos carros:
        Car carrito1 = new Car("ASJ 123", TipoVehiculo.MOTO);
        Car carrito2 = new Car("AWD 494", TipoVehiculo.CAMIONETA);
        
        //Instanciar un cliente:
        Cliente cli = new Cliente("Alex", "Olguin", TipoDocumento.CC, 1125291698L, 3153154587L);
        
        //Vincular carros al cliente
        cli.addCar(carrito1);
        cli.addCar(carrito2);
        cli.addCar("ASJ 123", TipoVehiculo.MOTO);

        //Declarar una Lista de Registros
        List<Registro> misRegistros = new ArrayList<>();

        //Instanciar dos Registros E/S
        Registro registro1 = new Registro(
            LocalDate.of(2024 , Month.JANUARY , 23), 
            LocalTime.of(15, 30, 34),
            LocalDate.of(2024, Month.FEBRUARY, 1),
            LocalTime.of(6, 30, 23),
            50000.00,
            cli.misCarros.get(0),
            cupito1
        
        
        );
        Registro registro2 = new Registro(
            LocalDate.of(2024 , Month.MAY , 23), 
            LocalTime.of(16, 30, 34),
            LocalDate.of(2024, Month.DECEMBER, 1),
            LocalTime.of(6, 30, 23),
            100000.00,
            cli.misCarros.get(0),
            cupito2
        
        
        );

        //vincular los registros a la lista
        //de registros
        misRegistros.add(registro1);
        misRegistros.add(registro2);
        
        //recorrer la lista de registros
        for( Registro r : misRegistros){
            System.out.println("placa:" + r.carro.placa + "/" + "Cupo:" + r.cupo.letra + "/" + "valor:" + r.valor + "/" + 
            "Fecha Inicio:" + r.fechaInicio.toString() + "/");
        }
        
    
    }

}