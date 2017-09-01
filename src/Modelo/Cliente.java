package Modelo;

import java.util.ArrayList;
import java.util.Random;

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
ArrayList <Cuenta> listacuentas;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
          this.listacuentas = new ArrayList();
        this.crearCuentas();
    }
 public void agregarCuenta(Cuenta c) {
        this.listacuentas.add(c);
        c.setCliente_t(this);
    }
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

    public ArrayList<Cuenta> getListacuentas() {
        return listacuentas;
    }

    public void setListacuentas(ArrayList<Cuenta> listacuentas) {
        this.listacuentas = listacuentas;
    }
    @Override
    public String toString(){
        return  getNombre() + " " + getCedula();
    }
      public Cuenta cuentaAleatoria(){
        Random al = new Random();
        int r = (int) (al.nextDouble()*this.getListacuentas().size());
        
        Cuenta c = this.getListacuentas().get(r);
        
        return c;
    }
     private void crearCuentas(){
        Random n = new Random();
        
        int s = (int) (n.nextDouble()*2 + 1);
        int t = (int) (n.nextDouble()*2 + 1);
        int ti = (int) (n.nextDouble()*2 + 1);
        int ah = (int) (n.nextDouble()*10000 + 1000);
        int co = (int) (n.nextDouble()*20000 + 2000);
        for(int i=0; i<s; i++){
           
            Cuenta a = new CuentaAhorro(ah,ti);
            this.agregarCuenta(a);
        }
        
        for(int i=0; i<t; i++){
            
            Cuenta b = new CuentaCorriente(co,ti);
            this.agregarCuenta(b);
        }
    }


        
}
