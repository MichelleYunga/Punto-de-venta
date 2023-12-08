/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package ws;

import Modelo.Clasificacion;
import Modelo.Tipo_Pago;
import Modelo.Factura;
import Modelo.Item_Factura;
import Modelo.Persona;
import Modelo.Producto;
import Modelo.Proveedores;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.util.List;

/**
 *
 * @author blink
 */
@WebService(serviceName = "ServiceVenta")
public class ServiceVenta {

    private List<Factura> facturas = new ArrayList<>();
    private List<Tipo_Pago> tiposPagos = new ArrayList<>();
    private List<Persona> personas = new ArrayList<>();
    private List<Clasificacion> clasificacions = new ArrayList<>();
    private List<Proveedores> proveedores = new ArrayList<>();
    private List<Producto> productos = new ArrayList<>();
    private List<Item_Factura> itemFactura = new ArrayList<>();

    ///////////////////////////////////////TIPOPAGO
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

    private Tipo_Pago encontrarTipoPagoPorId(int idTipoPago) {

        return tiposPagos.stream()
                .filter(tipoPago -> tipoPago.getId_tipo_pago() == idTipoPago)
                .findFirst()
                .orElse(null);
    }

    /////////////////////////////////FACTURA////////////////////////7
//    @WebMethod
//    public String crearFactura(
//            @WebParam(name = "idFactura") int idFactura,
//            @WebParam(name = "ruc") String ruc,
//            @WebParam(name = "fecha") Date fecha,
//            @WebParam(name = "descuento") double descuento,
//            @WebParam(name = "total") double total,
//            @WebParam(name = "tiposPago") int idtipopago,
//            @WebParam(name = "persona")int idpersona) {
//
//        Factura nuevaFactura = new Factura(idFactura, ruc, fecha, descuento, total, idtipopago, idpersona,null,null);
//
//        facturas.add(nuevaFactura);
//        return "Factura creada exitosamente. ID de Factura: " + nuevaFactura.getId_factura();
//    }
    @WebMethod(operationName = "crearFactura")
    public String crearFactura(
            @WebParam(name = "idFactura") int idFactura,
            @WebParam(name = "ruc") String ruc,
            @WebParam(name = "fecha") String fecha,
            @WebParam(name = "descuento") double descuento,
            @WebParam(name = "total") double total,
            @WebParam(name = "idPersona") int idPersona,
            @WebParam(name = "idTipoPago") int idTipoPago) {

        Persona persona = null;
        for (Persona p : personas) {
            if (p.getId_persona() == idPersona) {
                persona = p;
                break;
            }
        }
        if (persona == null) {
            return "Error: La persona con ID " + idPersona + " no existe.";
        }

        Tipo_Pago tipPago = null;
        for (Tipo_Pago tp : tiposPagos) {
            if (tp.getId_tipo_pago() == idTipoPago) {
                tipPago = tp;
                break;
            }
        }
        if (tipPago == null) {
            return "Error: El Tipo pago con ID " + idTipoPago + " no existe.";
        }
        Factura nuevaFactura = new Factura(idFactura, ruc, fecha, descuento, total, idPersona, idTipoPago, null, null);
        persona.getFacturas().add(nuevaFactura);
        tipPago.getFacturas().add(nuevaFactura);

        facturas.add(nuevaFactura);
        return "Factura creado exitosamente con ID: " + nuevaFactura.getId_factura();
    }

    /////////////////////PERSONA//////////////////////////////////////////////////////////////
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

    ///////////////CLASIFICACION////////////////////////////////////////////////////////////////////////////
    @WebMethod
    public String crearClasificacion(
            @WebParam(name = "idClasificacion") int idClasificacion,
            @WebParam(name = "grupo") String grupo) {
        Clasificacion nuevaClasificacion = new Clasificacion(idClasificacion, grupo);

        clasificacions.add(nuevaClasificacion);

        return "Clasificación creada exitosamente con ID: " + nuevaClasificacion.getId_clasificacion();
    }

    ///////////////PROVEEDOR//////////////////////////
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

    /////////////////PRODUCTO///////////////////////////////////////////////////////////////////////////////
    @WebMethod(operationName = "crearProducto")
    public String crearProducto(
            @WebParam(name = "idProducto") int idProducto,
            @WebParam(name = "stock") int stock,
            @WebParam(name = "precioUnitario") double precioUnitario,
            @WebParam(name = "unidad") String unidad,
            @WebParam(name = "idClasificacion") int idClasificacion,
            @WebParam(name = "idProveedor") int idProveedor,
            @WebParam(name = "iva") boolean iva) {

        Clasificacion clasificacion = null;
        for (Clasificacion c : clasificacions) {
            if (c.getId_clasificacion() == idClasificacion) {
                clasificacion = c;
                break;
            }
        }
        if (clasificacion == null) {
            return "Error: La clasificación con ID " + idClasificacion + " no existe.";
        }

        Proveedores proveedor = null;
        for (Proveedores p : proveedores) {
            if (p.getId_proveedor() == idProveedor) {
                proveedor = p;
                break;
            }
        }
        if (proveedor == null) {
            return "Error: El proveedor con ID " + idProveedor + " no existe.";
        }

        Producto nuevoProducto = new Producto(idProducto, stock, precioUnitario, unidad, iva, idClasificacion, idProveedor, null, null);
        proveedor.getProductos().add(nuevoProducto);
        clasificacion.getProductos().add(nuevoProducto);

        productos.add(nuevoProducto);
        return "Producto creado exitosamente con ID: " + nuevoProducto.getId_producto();
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//    @WebMethod
//    public String crearItemFactura(
//            @WebParam(name = "idItemFactura") int idItemFactura,
//            @WebParam(name = "cantidad") int cantidad,
//            @WebParam(name = "precio") double precio,
//            @WebParam(name = "subtotal") double subtotal,
//            @WebParam(name = "factura") int idfacura,
//            @WebParam(name = "producto") int idproducto) {
//
//        Item_Factura nuevoitemFa = new Item_Factura(idItemFactura, cantidad, precio, subtotal, idfacura, idproducto, null, null);
//
//        itemFactura.add(nuevoitemFa);
//        return "ItemFactura creada exitosamente. ID de itemFactura: " + nuevoitemFa.getId_itemfactura();
//    }
    @WebMethod(operationName = "crearItemFactura")
    public String crearItemFactura(
            @WebParam(name = "iditemFactura") int idItemFactura,
            @WebParam(name = "cantidad") int cantidad,
            @WebParam(name = "precio") double prrecio,
            @WebParam(name = "subtotal") double subTotal,
            @WebParam(name = "idProducto") int idProducto,
            @WebParam(name = "idFactura") int idFactura) {

        Producto producto = null;
        for (Producto pr : productos) {
            if (pr.getId_producto() == idProducto) {
                producto = pr;
                break;
            }
        }
        if (producto == null) {
            return "Error: El producto con ID " + idProducto + " no existe.";
        }

        Factura factura = null;
        for (Factura f : facturas) {
            if (f.getId_factura() == idFactura) {
                factura = f;
                break;
            }
        }
        if (factura == null) {
            return "Error: La factura con ID " + idFactura + " no existe.";
        }

        Item_Factura nuevaItemFactura = new Item_Factura(idItemFactura, cantidad, prrecio, subTotal, idProducto, idFactura, null, null);
        producto.getItemFactura().add(nuevaItemFactura);
        factura.getItemFactura().add(nuevaItemFactura);

        itemFactura.add(nuevaItemFactura);
        return "Item Factura creado exitosamente con ID: " + nuevaItemFactura.getId_itemfactura();
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @WebMethod(operationName = "listarClasificaion")
    public List<Clasificacion> listarClasificacion() {
        return clasificacions;
    }

    @WebMethod(operationName = "listarProveedor")
    public List<Proveedores> listarProveedor() {
        return proveedores;
    }

    @WebMethod(operationName = "listarProducto")
    public List<Producto> listarProducto() {
        return productos;
    }

    @WebMethod(operationName = "listarFactura")
    public List<Factura> listarFactura() {
        return facturas;
    }

    @WebMethod(operationName = "listarPersona")
    public List<Persona> listarPersona() {
        return personas;
    }

    @WebMethod(operationName = "listarItemFactura")
    public List<Item_Factura> listarItemFa() {
        return itemFactura;
    }

    @WebMethod(operationName = "listarTipPago")
    public List<Tipo_Pago> listarTipoPago() {
        return tiposPagos;
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
}
