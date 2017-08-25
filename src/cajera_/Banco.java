package cajera_;


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
private ArrayList<Cliente> listacliente;
private ArrayList<Transaccion> listatransaccion;
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
    public ArrayList<Cliente> getListacliente() {
        return listacliente;
    }

    public void setListacliente(ArrayList<Cliente> listacliente) {
        this.listacliente = listacliente;
    }

    public ArrayList<Cajera> getListcajeras() {
        return listcajeras;
    }

    public void setListcajeras(ArrayList<Cajera> listcajeras) {
        this.listcajeras = listcajeras;
    }
    
     public void agregarCliente(Cliente c){        
        this.listacliente.add(c);
    }
    
    public void eliminarCliente(Cliente c){
        this.listacliente.remove(c);
    }
    
    public void agregarCajera(Cajera ca){
        this.listcajeras.add(ca);        
    }
    
    public void eliminarCajera(Cajera ca){
        this.listcajeras.remove(ca);
    }
   public synchronized static Cliente siguienteCliente() throws Exception {
 //   public static Cliente siguienteCliente() throws Exception {
        if (clientes.hasNext()) {
            return (Cliente) clientes.next();
        } else {
            throw new Exception("No hay mas clientes");
        }
    }

}
