/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author omarc
 */
public class Curso {
    
    private String nombre;
    private String codigo;
    private String turno;
    private List<Estudiantes> estudiantes;

    public Curso( 
            String codigo,  
            String nombre,
            String turno) { 
        this.codigo = codigo;
        this.nombre = nombre;
        this.turno = turno;
        this.estudiantes = new ArrayList<Estudiantes>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<Estudiantes> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiantes> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public void agregarEstudiante(Estudiantes estudiantes){
        this.estudiantes.add(estudiantes);
    }
    
}
