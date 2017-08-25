package cajera_;

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
        c.setTitular(this);
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
        return getCedula() + " - " + getNombre() + " " + getCedula();
    }
     private void crearCuentas(){
        Random x = new Random();
        
        int s = (int) (x.nextDouble()*2 + 1);
        int t = (int) (x.nextDouble()*2 + 1);
        
        for(int i=0; i<s; i++){
            int r = (int) (x.nextDouble()*100000 + 1000);
            Cuenta a = new CuentaAhorro(r);
            this.agregarCuenta(a);
        }
        
        for(int i=0; i<t; i++){
            int r = (int) (x.nextDouble()*20000 + 2000);
            Cuenta b = new CuentaCorriente(r);
            this.agregarCuenta(b);
        }
    }


        
}
