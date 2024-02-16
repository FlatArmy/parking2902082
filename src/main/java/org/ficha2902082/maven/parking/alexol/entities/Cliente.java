package org.ficha2902082.maven.parking.alexol.entities;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    public String nombre;
    public String apellidos;
    public  TipoDocumento tipoDocumento;
    public Long numeroDocumento;
    public Long celular;

    public List<carro> misCarros = new ArrayList<carro>(); 


    //metodo 1: añadir carro al cliente
    //definir metodo(frima del metodo - Signature):
    //  - modificar acceso
    //  - tipo de dato de retorno
    //  - nombre del metodo
    // paramentros (Entradas, inputs)
    //     1. Tipo de dato del parametro
    //     2. nombre del parametro
    public void addCar(carro c){
        this.misCarros.add(c);
    }

    //sobrecarga del metodo addCar
    public void addCar( String placa, TipoVehiculo tipoVehiculo){
        //construir)(instanciar)
        carro c = new carro();
        c.placa = placa;
        c.tipoVehiculo = tipoVehiculo;
        this.misCarros.add(c);

    }

    //Sobrecarga de metodos:
    //en una clase se permiten metodos
    //con el mism nombre
    //con diferente firma

}
