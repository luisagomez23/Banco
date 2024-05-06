package co.edu.uniquindio;

import java.util.Collection;

public class CuentaCorriente extends CuentaBancaria {
    Double sobregiro;

    

    public CuentaCorriente(String nombreTitular, String apellidosTitular, Boolean estadoCuenta, int numeroCuenta,
            Double saldo, Collection<Transaccion> listaTransacciones, Titular titular, Double sobregiro) {
        super(nombreTitular, apellidosTitular, estadoCuenta, numeroCuenta, saldo, listaTransacciones, titular);
        this.sobregiro = sobregiro;
    }

    public Double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(Double sobregiro) {
        this.sobregiro = sobregiro;
    }
@Override
    
    public void retirar(double valor) {
        double disponible = saldo + sobregiro;
        if (valor > 0 && disponible >= valor) {
            saldo -= valor;
            if (saldo == 0) {
                estadoCuenta = false;
            }
        } else {
            System.out.println("Saldo insuficiente. Operación no realizada.");
        }
    }
    

}
