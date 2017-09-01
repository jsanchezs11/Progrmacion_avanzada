package Modelo;


import java.util.ArrayList;
import java.util.Iterator;

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
public static ArrayList<Cliente> listacliente;
private ArrayList<Cajera> listcajeras;
 static Iterator  clientes;


  // clientes =listacliente.iterator();
    public Banco(String nombre, ArrayList<Cliente> listacliente,ArrayList<Cajera> listcajeras) {
        this.nombre = nombre;
        this.listacliente = listacliente;
        this.listcajeras=listcajeras;
    }
    public Banco(String nombre){
     this.nombre = nombre;
     this.listacliente = new ArrayList();
     this.listcajeras=new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      public void addCliente(Cliente c) {
        listacliente.add(c);
    }
  public void addCajera(Cajera ca) {
        listcajeras.add(ca);
    }
    public static ArrayList<Cliente> getListacliente() {
        return listacliente;
    }

    public void setListacliente(ArrayList<Cliente> listacliente) {
        this.listacliente = listacliente;
    }

    public ArrayList<Cajera> getListcajeras() {
        return listcajeras;
    }

    public  void setListcajeras(ArrayList<Cajera> listcajeras) {
        this.listcajeras = listcajeras;
    }
    
    
    public void eliminarCajera(Cajera ca){
        this.listcajeras.remove(ca);   
    }
    public void eliminarCliente(Cliente cl){
        this.listacliente.remove(cl);   
    }
    
    public ArrayList<Cajera> getcajeras(){
    return listcajeras;    
    }
     public ArrayList<Cliente> getcliente(){
    return listacliente;    
    }
    
    
    public void activar(){
        for(Cajera c: this.listcajeras){
         c.start();
       }
}
     public synchronized static Cliente siguienteCliente() throws Exception {
        if(!listacliente.isEmpty()){
            Cliente aux = listacliente.get(0);
            listacliente.remove(0);
            
            return aux;
        }
        else{
           throw new Exception("No hay mas clientes por atender");
        }
    }

}
