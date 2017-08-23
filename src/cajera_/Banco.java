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
public class Banco {
private String nombre;    
private ArrayList<Cliente> listacliente;
private ArrayList<Transaccion> listatransaccion;
private ArrayList<Cajera> listcajeras;
    public Banco(String nombre, ArrayList<Cliente> listacliente, ArrayList<Transaccion> listatransaccion) {
        this.nombre = nombre;
        this.listacliente = listacliente;
        this.listatransaccion = listatransaccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getListacliente() {
        return listacliente;
    }

    public void setListacliente(ArrayList<Cliente> listacliente) {
        this.listacliente = listacliente;
    }

    public ArrayList<Transaccion> getListatransaccion() {
        return listatransaccion;
    }

    public void setListatransaccion(ArrayList<Transaccion> listatransaccion) {
        this.listatransaccion = listatransaccion;
    }

}
