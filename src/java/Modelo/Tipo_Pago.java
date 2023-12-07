/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author blink
 */
public class Tipo_Pago {

    private int id_tipo_pago;
    private String tipo;
    private String desripcion;

    public Tipo_Pago() {
    }

    public Tipo_Pago(int id_tipo_pago, String tipo, String desripcion) {
        this.id_tipo_pago = id_tipo_pago;
        this.tipo = tipo;
        this.desripcion = desripcion;
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

}
