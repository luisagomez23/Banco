package co.edu.uniquindio;

import java.time.LocalDate;


public class Transaccion {
    int codigo;
    Double valor;
    String descripcion;
    String estado;
    LocalDate fecha;
    Tipo tipo;
    
    public Transaccion(int codigo, Double valor, String descripcion, String estado, LocalDate fecha) {
        this.codigo = codigo;
        this.valor = valor;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha = fecha;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
   

}
