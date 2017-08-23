package cajera_;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fuller 101
 */
public class Cliente {
private String nombre;
private String cedula;
ArrayList <Transaccion> listatransaccion;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList<Transaccion> getListatransaccion() {
        return listatransaccion;
    }

    public void setListatransaccion(ArrayList<Transaccion> listatransaccion) {
        this.listatransaccion = listatransaccion;
    }

        
}
