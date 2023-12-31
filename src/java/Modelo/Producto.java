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
public class Producto {

    private int id_producto;
    private int stock;
    private double precio_unitario;
    private String unidad;
    private boolean iva;
    private int id_clasificacion;
    private int id_proveedor;
    private List<Proveedores> proveedor;
    private List<Clasificacion> clasificacion;

    private List<Item_Factura> itemFactura;

    public Producto() {
        this.itemFactura = new ArrayList<>();
    }

    public Producto(int id_producto, int stock, double precio_unitario, String unidad, boolean iva, int id_clasificacion, int id_proveedor, List<Proveedores> proveedor, List<Clasificacion> clasificacion) {
        this.id_producto = id_producto;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.unidad = unidad;
        this.iva = iva;
        this.id_clasificacion = id_clasificacion;
        this.id_proveedor = id_proveedor;
        this.proveedor = proveedor;
        this.clasificacion = clasificacion;
        this.itemFactura = new ArrayList<>();
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public boolean isIva() {
        return iva;
    }

    public void setIva(boolean iva) {
        this.iva = iva;
    }

    public List<Proveedores> getProveedor() {
        return proveedor;
    }

    public void setProveedor(List<Proveedores> proveedor) {
        this.proveedor = proveedor;
    }

    public List<Clasificacion> getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(List<Clasificacion> clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public List<Item_Factura> getItemFactura() {
        return itemFactura;
    }

    public void setItemFactura(List<Item_Factura> itemFactura) {
        this.itemFactura = itemFactura;
    }

}
