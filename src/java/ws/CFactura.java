/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import Modelo.Clasificacion;
import Modelo.Tipo_Pago;
import Modelo.Factura;
import Modelo.Persona;
import Modelo.Producto;
import Modelo.Proveedores;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.Date;
import java.util.List;

/**
 *
 * @author blink
 */
@WebService(serviceName = "CFactura")
public class CFactura {

    private List<Factura> facturas = new ArrayList<>();
    private List<Tipo_Pago> tiposPagos = new ArrayList<>();
    private List<Persona> personas = new ArrayList<>();
    private List<Clasificacion> clasificacions = new ArrayList<>();
    private List<Proveedores> proveedores = new ArrayList<>();
   private List<Producto> productos = new ArrayList<>();

    @WebMethod
    public String crearTipoPago(
            @WebParam(name = "idTipoPago") int idTipoPago,
            @WebParam(name = "tipo") String tipo,
            @WebParam(name = "descripcion") String descripcion) {
        Tipo_Pago nuevoTipoPago = new Tipo_Pago(idTipoPago, tipo, descripcion);

        tiposPagos.add(nuevoTipoPago);

        return "Tipo de pago creado exitosamente con ID: " + nuevoTipoPago.getId_tipo_pago();
    }

    @WebMethod
    public Tipo_Pago obtenerTipoPagoPorId(@WebParam(name = "idTipoPago") int idTipoPago) {

        return encontrarTipoPagoPorId(idTipoPago);
    }

    @WebMethod
    public String crearFactura(
            @WebParam(name = "idFactura") int idFactura,
            @WebParam(name = "ruc") String ruc,
            @WebParam(name = "fecha") Date fecha,
            @WebParam(name = "descuento") double descuento,
            @WebParam(name = "total") double total,
            @WebParam(name = "tiposPago") List<Tipo_Pago> tiposPago, 
            @WebParam(name = "persona")List<Persona> personas){

        Factura nuevaFactura = new Factura(idFactura, ruc, fecha, descuento, total, tiposPago, personas);

        facturas.add(nuevaFactura);
        return "Factura creada exitosamente. ID de Factura: " + nuevaFactura.getId_factura();
    }
    
    private Tipo_Pago encontrarTipoPagoPorId(int idTipoPago) {

        return tiposPagos.stream()
                .filter(tipoPago -> tipoPago.getId_tipo_pago() == idTipoPago)
                .findFirst()
                .orElse(null);
    }

    @WebMethod
    public String listarTiposPago() {
        if (tiposPagos.isEmpty()) {
            return "No hay tipos de pago registrados.";
        }

        StringBuilder listaTiposPago = new StringBuilder("Listado de Tipos de Pago:\n");

        for (Tipo_Pago tipoPago : tiposPagos) {
            listaTiposPago.append("ID: ").append(tipoPago.getId_tipo_pago())
                    .append(", Tipo: ").append(tipoPago.getTipo())
                    .append(", Descripción: ").append(tipoPago.getDesripcion())
                    .append("\n");
        }

        return listaTiposPago.toString();
    }

    @WebMethod
    public String listarFacturas() {
        if (facturas.isEmpty()) {
            return "No hay facturas registradas.";
        }

        StringBuilder listaFacturas = new StringBuilder("Listado de Facturas:\n");

        for (Factura factura : facturas) {
            listaFacturas.append("ID Factura: ").append(factura.getId_factura())
                    .append(", RUC: ").append(factura.getRuc())
                    .append(", Fecha: ").append(factura.getFecha())
                    .append(", Descuento: ").append(factura.getDescuento())
                    .append(", Total: ").append(factura.getTotal())
                    .append("\nTipos de Pago:\n");
            for (Tipo_Pago tipoPago : factura.getTiposPago()) {
                listaFacturas.append("\tID Tipo Pago: ").append(tipoPago.getId_tipo_pago())
                        .append(", Tipo: ").append(tipoPago.getTipo())
                        .append(", Descripción: ").append(tipoPago.getDesripcion())
                        .append("\n");
            }
            listaFacturas.append("\n");
        }
        return listaFacturas.toString();
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @WebMethod
    public String crearPersona(
            @WebParam(name = "idPersona") int idPersona,
            @WebParam(name = "nombre") String nombre,
            @WebParam(name = "apellido") String apellido,
            @WebParam(name = "dni") String dni,
            @WebParam(name = "celular") String celular,
            @WebParam(name = "correo") String correo) {
        Persona nuevaPersona = new Persona(idPersona, nombre, apellido, dni, celular, correo);

        personas.add(nuevaPersona);

        return "Persona creada exitosamente con ID: " + nuevaPersona.getId_persona();
    }
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @WebMethod
    public String crearClasificacion(
            @WebParam(name = "idClasificacion") int idClasificacion,
            @WebParam(name = "grupo") String grupo) {
        Clasificacion nuevaClasificacion = new Clasificacion(idClasificacion, grupo);

        clasificacions.add(nuevaClasificacion);

        return "Clasificación creada exitosamente con ID: " + nuevaClasificacion.getId_clasificacion();
    }
    /////////////////////////////////////////////////////////////////
    @WebMethod
    public String crearProveedor(
            @WebParam(name = "idProveedor") int idProveedor,
            @WebParam(name = "ruc") String ruc,
            @WebParam(name = "telefono") String telefono,
            @WebParam(name = "pais") String pais,
            @WebParam(name = "correo") String correo,
            @WebParam(name = "moneda") String moneda) {
        Proveedores nuevoProveedor = new Proveedores(idProveedor, ruc, telefono, pais, correo, moneda);

        proveedores.add(nuevoProveedor);

        return "Proveedor creado exitosamente con ID: " + nuevoProveedor.getId_proveedor();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    

}