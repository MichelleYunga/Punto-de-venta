/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author blink
 */
public class Item_Factura {

    private int id_itemfactura;
    private int id_factura;
    private int id_producto;
    private int cantidad;
    private double precio;
    private double subtotal;

    private List<Producto> tipoproducto;
    private List<Factura> tipofactura;

    public Item_Factura() {
    }

    public Item_Factura(int id_itemfactura, int id_factura, int id_producto, int cantidad, double precio, double subtotal, List<Producto> tipoproducto, List<Factura> tipofactura) {
        this.id_itemfactura = id_itemfactura;
        this.id_factura = id_factura;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.tipoproducto = tipoproducto;
        this.tipofactura = tipofactura;
    }

    public int getId_itemfactura() {
        return id_itemfactura;
    }

    public void setId_itemfactura(int id_itemfactura) {
        this.id_itemfactura = id_itemfactura;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public List<Producto> getTipoproducto() {
        return tipoproducto;
    }

    public void setTipoproducto(List<Producto> tipoproducto) {
        this.tipoproducto = tipoproducto;
    }

    public List<Factura> getTipofactura() {
        return tipofactura;
    }

    public void setTipofactura(List<Factura> tipofactura) {
        this.tipofactura = tipofactura;
    }
}
