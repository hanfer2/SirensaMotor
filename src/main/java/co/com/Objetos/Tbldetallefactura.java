package co.com.Objetos;
// Generated 18/06/2018 05:29:22 PM by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Tbldetallefactura generated by hbm2java
 */
public class Tbldetallefactura  implements java.io.Serializable {


     private Integer id;
     private Tblfactura tblfactura;
     private Tblparametrodetalle tblparametrodetalle;
     private Tblproducto tblproducto;
     private BigDecimal valorUnitario;
     private BigDecimal ivaUnitario;
     private Integer cantidad;
     private BigDecimal descuento;
     private BigDecimal total;

    public Tbldetallefactura() {
    }

	
    public Tbldetallefactura(Tblfactura tblfactura) {
        this.tblfactura = tblfactura;
    }
    public Tbldetallefactura(Tblfactura tblfactura, Tblparametrodetalle tblparametrodetalle, Tblproducto tblproducto, BigDecimal valorUnitario, BigDecimal ivaUnitario, Integer cantidad, BigDecimal descuento, BigDecimal total) {
       this.tblfactura = tblfactura;
       this.tblparametrodetalle = tblparametrodetalle;
       this.tblproducto = tblproducto;
       this.valorUnitario = valorUnitario;
       this.ivaUnitario = ivaUnitario;
       this.cantidad = cantidad;
       this.descuento = descuento;
       this.total = total;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tblfactura getTblfactura() {
        return this.tblfactura;
    }
    
    public void setTblfactura(Tblfactura tblfactura) {
        this.tblfactura = tblfactura;
    }
    public Tblparametrodetalle getTblparametrodetalle() {
        return this.tblparametrodetalle;
    }
    
    public void setTblparametrodetalle(Tblparametrodetalle tblparametrodetalle) {
        this.tblparametrodetalle = tblparametrodetalle;
    }
    public Tblproducto getTblproducto() {
        return this.tblproducto;
    }
    
    public void setTblproducto(Tblproducto tblproducto) {
        this.tblproducto = tblproducto;
    }
    public BigDecimal getValorUnitario() {
        return this.valorUnitario;
    }
    
    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    public BigDecimal getIvaUnitario() {
        return this.ivaUnitario;
    }
    
    public void setIvaUnitario(BigDecimal ivaUnitario) {
        this.ivaUnitario = ivaUnitario;
    }
    public Integer getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    public BigDecimal getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }
    public BigDecimal getTotal() {
        return this.total;
    }
    
    public void setTotal(BigDecimal total) {
        this.total = total;
    }




}


