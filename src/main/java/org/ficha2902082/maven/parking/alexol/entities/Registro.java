package org.ficha2902082.maven.parking.alexol.entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
    //atributos intrisecos:
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public Double valor;

    //atributos de relacion
    public Car carro;
    public Cupo cupo;
    
    //Constructor por defecto
    public Registro() {
    }
    //Constructor parametrizado
    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Double valor,
            Car carro, Cupo cupo) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.carro = carro;
        this.cupo = cupo;
    }
    
    

}