/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_joselagos;

import java.util.ArrayList;

/**
 *
 * @author tali_
 */
public class Usuarios {
    private String user;
    private String correo;
    private String contra;
    private String fecha_nac;
    private ArrayList<Peliculas>fav = new ArrayList();
    private ArrayList<Series>favo = new ArrayList();
    private String tarjeta;

    public Usuarios() {
    }

    public Usuarios(String user, String correo, String contra, String fecha_nac, String tarjeta) {
        this.user = user;
        this.correo = correo;
        this.contra = contra;
        this.fecha_nac = fecha_nac;
        this.tarjeta = tarjeta;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public ArrayList<Peliculas> getFav() {
        return fav;
    }

    public void setFav(ArrayList<Peliculas> fav) {
        this.fav = fav;
    }

    public ArrayList<Series> getFavo() {
        return favo;
    }

    public void setFavo(ArrayList<Series> favo) {
        this.favo = favo;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return user;
    }
    
}
