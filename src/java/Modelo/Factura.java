/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author blink
 */
public class Factura {

    private int id_factura;
    private String ruc;
    private String fecha;
    private double descuento;
    private double total;
    private int id_persona;
    private int id_tipo_pago;
    
    private List<Tipo_Pago> tiposPago;
    private List<Persona> persona;

      private List<Item_Factura> itemFactura;
      
    public Factura() {
         this.itemFactura = new ArrayList<>();
    }

//    public Factura(int id_factura, String ruc, String fecha, double descuento, double total, int id_persona, int id_tipo_pago, List<Tipo_Pago> tiposPago, List<Persona> persona, List<Item_Factura> itemFactura) {
//        this.id_factura = id_factura;
//        this.ruc = ruc;
//        this.fecha = fecha;
//        this.descuento = descuento;
//        this.total = total;
//        this.id_persona = id_persona;
//        this.id_tipo_pago = id_tipo_pago;
//        this.tiposPago = tiposPago;
//        this.persona = persona;
//        this.itemFactura = itemFactura;
//    }

    public Factura(int id_factura, String ruc, String fecha, double descuento, double total, int id_persona, int id_tipo_pago, List<Tipo_Pago> tiposPago, List<Persona> persona) {
        this.id_factura = id_factura;
        this.ruc = ruc;
        this.fecha = fecha;
        this.descuento = descuento;
        this.total = total;
        this.id_persona = id_persona;
        this.id_tipo_pago = id_tipo_pago;
        this.tiposPago = tiposPago;
        this.persona = persona;
        this.itemFactura = itemFactura;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
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

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
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

    public List<Item_Factura> getItemFactura() {
        return itemFactura;
    }

    public void setItemFactura(List<Item_Factura> itemFactura) {
        this.itemFactura = itemFactura;
    }



   

}
