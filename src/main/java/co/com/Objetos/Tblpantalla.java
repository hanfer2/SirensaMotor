package co.com.Objetos;
// Generated 10/05/2018 11:09:35 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tblpantalla generated by hbm2java
 */
public class Tblpantalla  implements java.io.Serializable {


     private Integer id;
     private String pantalla;
     private Set tblpermisoses = new HashSet(0);

    public Tblpantalla() {
    }

    public Tblpantalla(String pantalla, Set tblpermisoses) {
       this.pantalla = pantalla;
       this.tblpermisoses = tblpermisoses;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getPantalla() {
        return this.pantalla;
    }
    
    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }
    public Set getTblpermisoses() {
        return this.tblpermisoses;
    }
    
    public void setTblpermisoses(Set tblpermisoses) {
        this.tblpermisoses = tblpermisoses;
    }




}


