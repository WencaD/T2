/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author omarc
 */
public class Estudiantes {
    
    private String codigo;
    private String nombre;
    private int asistencia;
    private int tardanza;
    private int falta;


    public Estudiantes(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public int getTardanza() {
        return tardanza;
    }

    public void setTardanza(int tardanza) {
        this.tardanza = tardanza;
    }

    public int getFalta() {
        return falta;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }
    
    public void marcaAsistencia(){
        this.asistencia++;
    }
    
    public void marcaTardanza(){
        this.tardanza++;
    }
    
    public void marcaFalta(){
        this.falta++;
    }
}
