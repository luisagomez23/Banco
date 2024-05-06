package co.edu.uniquindio;

import java.util.Collection;

public abstract class CuentaBancaria {
    String nombreTitular;
    String apellidosTitular;
    Boolean estadoCuenta;
    int numeroCuenta;
    Double saldo;
    Collection <Transaccion> listaTransacciones;
    Titular titular;
    
    public CuentaBancaria(String nombreTitular, String apellidosTitular, Boolean estadoCuenta, int numeroCuenta,
            Double saldo, Collection<Transaccion> listaTransacciones, Titular titular) {
        this.nombreTitular = nombreTitular;
        this.apellidosTitular = apellidosTitular;
        this.estadoCuenta = estadoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.listaTransacciones = listaTransacciones;
        this.titular = titular;
    }
    
    public void transferir(CuentaBancaria otraCuenta, double valor) {
        if (estadoCuenta && otraCuenta.estadoCuenta) {
            if (valor > 0 && this.saldo >= valor) {
                this.retirar(valor);
                otraCuenta.depositar(valor);
                System.out.println("Transferencia de " + valor + " realizada con éxito.");
            } else {
                System.out.println("Saldo insuficiente para realizar la transferencia.");
            }
        } else {
            System.out.println("Una o ambas cuentas están inactivas.");
        }
    }

    
    public void consultarSaldo (Double saldo){
        if (saldo > 0){
            System.out.println("El saldo de la cuenta:" + saldo);
        } else{
            System.out.println("La cuenta está inactiva.");
        }

    }
    public void depositar(double valor){
        assert valor>0:"";
        saldo=saldo+valor;
        estadoCuenta= true;
    }
    public abstract void retirar (double valor);

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public void setApellidosTitular(String apellidosTitular) {
        this.apellidosTitular = apellidosTitular;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Collection<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }

    public void setListaTransacciones(Collection<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
}    