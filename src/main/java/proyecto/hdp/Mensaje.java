/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.hdp;

/**
 *
 * @author T-107
 */
public class Mensaje {

    public Mensaje() {
    }

    public Mensaje(String contenido) {
        this.contenido = contenido;
    }
    private String contenido;

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    
}
