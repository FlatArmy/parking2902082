package org.ficha2902082.maven.parking.alexol;


import org.ficha2902082.maven.parking.alexol.entities.Car;
import org.ficha2902082.maven.parking.alexol.entities.Cliente;
import org.ficha2902082.maven.parking.alexol.entities.Cupo;
import org.ficha2902082.maven.parking.alexol.entities.TipoDocumento;
import org.ficha2902082.maven.parking.alexol.entities.TipoVehiculo;
import org.ficha2902082.maven.parking.alexol.entities.Registro;
import org.ficha2902082.maven.parking.alexol.entities.Empleado;

import java.util.List;
import java.util.ArrayList;
import java.time.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
    
        //Crear dos cupos
        //Instanciar dos cupos:
        Cupo cupito1 = new Cupo();
        cupito1.ancho = 1.0;
        cupito1.largo = 4.5;
        cupito1.letra = 'A';

        //Cupo cupito2 = new Cupo('B', 5.0 , 2.5 );
        
        //Instanciar dos carros:
        Car carrito1 = new Car("ASJ 123", TipoVehiculo.MOTO);
        Car carrito2 = new Car("AWD 494", TipoVehiculo.CAMIONETA);

        Empleado empleado1 = new Empleado("pepe", 123L);
        Empleado empleado2 = new Empleado("alex", 456L);
        Empleado empleado3 = new Empleado("luis", 789L);

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
            cupito1, empleado1
            
        );
        
        Registro registro2 = new Registro(
            LocalDate.of(2024 , Month.FEBRUARY , 03), 
            LocalTime.of(05, 20, 04),
            LocalDate.of(2024, Month.MARCH, 12),
            LocalTime.of(6, 30, 23),
            10000.00,
            cli.misCarros.get(0),
            cupito1, empleado2
            
        );

        Registro registro3 = new Registro(
            LocalDate.of(2024 , Month.MARCH, 07), 
            LocalTime.of(05, 20, 04),
            LocalDate.of(2024, Month.MARCH, 12),
            LocalTime.of(6, 30, 23),
            35000.00,
            cli.misCarros.get(0),
            cupito1, empleado3
            
        );

        Registro registro4 = new Registro(
            LocalDate.of(2024 , Month.FEBRUARY , 03), 
            LocalTime.of(05, 20, 04),
            LocalDate.of(2024, Month.MARCH, 12),
            LocalTime.of(6, 30, 23),
            40000.00,
            cli.misCarros.get(0),
            cupito1, empleado1
            
        );

        Registro registro5 = new Registro(
            LocalDate.of(2024 , Month.FEBRUARY , 03), 
            LocalTime.of(05, 20, 04),
            LocalDate.of(2024, Month.MARCH, 12),
            LocalTime.of(6, 30, 23),
            23500.00,
            cli.misCarros.get(0),
            cupito1, empleado3
            
        );



        LocalDate fi1 = LocalDate.of(2023 , Month.DECEMBER, 24);

        LocalTime hi1 = LocalTime.of(11, 32, 40);

        LocalDate ff1 = LocalDate.of(2023 , Month.JANUARY, 24);

        LocalTime hf1 = LocalTime.of(22, 32, 40);

        Double valoR2 = 50000.00;

        Registro r2 = new Registro(fi1, hi1, ff1, hf1, valoR2, cli.misCarros.get(0), cupito1, empleado1);




        //vincular los registros a la lista
        //de registros
        misRegistros.add(registro1);
        misRegistros.add(registro2);
        misRegistros.add(registro3);
        misRegistros.add(registro4);
        misRegistros.add(registro5);
        misRegistros.add(r2);
        
        //recorrer la lista de registros
        for( Registro r : misRegistros){
            System.out.println("placa:" + r.carro.placa + " | " + "Cupo:" + r.cupo.letra + " | " + "valor:" + r.valor + " | " + 
            "Fecha Inicio:" + r.fechaInicio.toString() + " | " + "Empleado:" + r.empleado.nombre + " | " +   "Codigo" + r.empleado.codigo);
        }
        
    
    }

}