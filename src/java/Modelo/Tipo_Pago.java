/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blink
 */
public class Tipo_Pago {

    private int id_tipo_pago;
    private String tipo;
    private String desripcion;

    private List<Factura> facturas;
    
    public Tipo_Pago() {
        this.facturas = new ArrayList<>();
    }

    public Tipo_Pago(int id_tipo_pago, String tipo, String desripcion) {
        this.id_tipo_pago = id_tipo_pago;
        this.tipo = tipo;
        this.desripcion = desripcion;
        this.facturas = new ArrayList<>();
    }

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesripcion() {
        return desripcion;
    }

    public void setDesripcion(String desripcion) {
        this.desripcion = desripcion;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

}
