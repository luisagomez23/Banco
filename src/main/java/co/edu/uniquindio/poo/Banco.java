package co.edu.uniquindio.poo;

import java.util.Collection;

import co.edu.uniquindio.CuentaBancaria;
import co.edu.uniquindio.Titular;

public class Banco {
    String nombre;
    Collection <Titular> listaTitulares;
    Collection <CuentaBancaria> cuentaBancarias;

    public Banco (String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

}
