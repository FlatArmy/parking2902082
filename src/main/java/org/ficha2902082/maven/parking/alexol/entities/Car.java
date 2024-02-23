package org.ficha2902082.maven.parking.alexol.entities;



public class Car {

    //sintaxis de atributos
    //1. modificador de acceso
    //2. Tipo de dato del atributo
    //3. Nombre del atributo
    //   (camel case)
    public String placa;
    public TipoVehiculo tipoVehiculo;
    public Car() {
    }

    public Car(String placa, TipoVehiculo tipoVehiculo) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

}
