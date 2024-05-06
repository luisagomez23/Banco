package co.edu.uniquindio;

import java.util.Collection;

public class CuentaAhorros extends CuentaBancaria {
    int tasaInteres;

    

    public CuentaAhorros(String nombreTitular, String apellidosTitular, Boolean estadoCuenta, int numeroCuenta,
            Double saldo, Collection<Transaccion> listaTransacciones, Titular titular, int tasaInteres) {
        super(nombreTitular, apellidosTitular, estadoCuenta, numeroCuenta, saldo, listaTransacciones, titular);
        this.tasaInteres = tasaInteres;
    }

    public int getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
@Override
    public void retirar (double valor){
        assert valor > 0;
        saldo = saldo - valor;
        if (saldo == 0) estadoCuenta = false;
    }
}
