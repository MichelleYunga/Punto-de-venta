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
    private int cantidad;
    private double precio;
    private double subtotal;
    private int id_producto;
    private int id_factura;

    private List<Producto> producto;
    private List<Factura> factura;

    public Item_Factura() {
    }

    public Item_Factura(int id_itemfactura, int cantidad, double precio, double subtotal, int id_producto, int id_factura, List<Producto> producto, List<Factura> factura) {
        this.id_itemfactura = id_itemfactura;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.id_producto = id_producto;
        this.id_factura = id_factura;
        this.producto = producto;
        this.factura = factura;
    }

    
    public int getId_itemfactura() {
        return id_itemfactura;
    }

    public void setId_itemfactura(int id_itemfactura) {
        this.id_itemfactura = id_itemfactura;
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

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public List<Factura> getFactura() {
        return factura;
    }

    public void setFactura(List<Factura> factura) {
        this.factura = factura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

}
