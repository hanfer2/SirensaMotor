package co.com.Objetos;
// Generated 10/05/2018 11:09:35 AM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tblpedido generated by hbm2java
 */
public class Tblpedido  implements java.io.Serializable {


     private Integer id;
     private Tblcliente tblcliente;
     private Tblparametrodetalle tblparametrodetalle;
     private Tblproveedor tblproveedor;
     private Tblusuario tblusuario;
     private Date fechaPedido;
     private String numeroPedido;
     private Set tbldetallepedidos = new HashSet(0);

    public Tblpedido() {
    }

    public Tblpedido(Tblcliente tblcliente, Tblparametrodetalle tblparametrodetalle, Tblproveedor tblproveedor, Tblusuario tblusuario, Date fechaPedido, String numeroPedido, Set tbldetallepedidos) {
       this.tblcliente = tblcliente;
       this.tblparametrodetalle = tblparametrodetalle;
       this.tblproveedor = tblproveedor;
       this.tblusuario = tblusuario;
       this.fechaPedido = fechaPedido;
       this.numeroPedido = numeroPedido;
       this.tbldetallepedidos = tbldetallepedidos;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Tblcliente getTblcliente() {
        return this.tblcliente;
    }
    
    public void setTblcliente(Tblcliente tblcliente) {
        this.tblcliente = tblcliente;
    }
    public Tblparametrodetalle getTblparametrodetalle() {
        return this.tblparametrodetalle;
    }
    
    public void setTblparametrodetalle(Tblparametrodetalle tblparametrodetalle) {
        this.tblparametrodetalle = tblparametrodetalle;
    }
    public Tblproveedor getTblproveedor() {
        return this.tblproveedor;
    }
    
    public void setTblproveedor(Tblproveedor tblproveedor) {
        this.tblproveedor = tblproveedor;
    }
    public Tblusuario getTblusuario() {
        return this.tblusuario;
    }
    
    public void setTblusuario(Tblusuario tblusuario) {
        this.tblusuario = tblusuario;
    }
    public Date getFechaPedido() {
        return this.fechaPedido;
    }
    
    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }
    public String getNumeroPedido() {
        return this.numeroPedido;
    }
    
    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }
    public Set getTbldetallepedidos() {
        return this.tbldetallepedidos;
    }
    
    public void setTbldetallepedidos(Set tbldetallepedidos) {
        this.tbldetallepedidos = tbldetallepedidos;
    }




}


