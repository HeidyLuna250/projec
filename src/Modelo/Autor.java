package Modelo;

import java.util.Date;

/*** @author HeidyHueteLuna
 */
public class Autor {
    private int id_autor;
    private String Cedula;
    private String Nombres;
    private String Apellidos;
    private String email;
    private Date fechaNac;

    public Autor(int id_autor, String Cedula, String Nombres, String Apellidos, String email, Date fechaNac) {
        this.id_autor = id_autor;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    public Autor(String Cedula, String Nombres, String Apellidos, String email, Date fechaNac) {
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.email = email;
        this.fechaNac = fechaNac;
    }

    public int getId_autor() {
        return id_autor;
    }

    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
}
