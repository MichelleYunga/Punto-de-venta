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
public class Clasificacion {

    private int id_clasificacion;
    private String grupo;

    private List<Producto> productos;

    public Clasificacion() {
        this.productos = new ArrayList<>();
    }

    public Clasificacion(int id_clasificacion, String grupo) {
        this.id_clasificacion = id_clasificacion;
        this.grupo = grupo;
        this.productos = new ArrayList<>();
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

}
