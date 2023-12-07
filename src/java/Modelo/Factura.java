/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author blink
 */
public class Factura {

    private int id_factura;
    private String ruc;
    private Date fecha;
    private double descuento;
    private double total;
    private List<Tipo_Pago> tiposPago;
    private List<Persona> persona;

    public Factura() {
    }

    public Factura(int id_factura, String ruc, Date fecha, double descuento, double total, List<Tipo_Pago> tiposPago, List<Persona> persona) {
        this.id_factura = id_factura;
        this.ruc = ruc;
        this.fecha = fecha;
        this.descuento = descuento;
        this.total = total;
        this.tiposPago = tiposPago;
         this.persona = persona;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Tipo_Pago> getTiposPago() {
        return tiposPago;
    }

    public void setTiposPago(List<Tipo_Pago> tiposPago) {
        this.tiposPago = tiposPago;
    }

    public List<Persona> getPersona() {
        return persona;
    }

    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

}
