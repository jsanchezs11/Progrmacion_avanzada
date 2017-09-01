/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Fuller 101
 */
public class Cajera extends Thread  {
    private String nombre;
    private String cedula;
    private long initialTime;

    public Cajera(String nombre, String cedula, long initialTime) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.initialTime = initialTime;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getNombre() {
        return nombre;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
       procesarCompra();
    }
    public void procesarCompra() {
   try {
            while (true) {
               Cliente cliente = Banco.siguienteCliente();
               for(int i=0;i<=Banco.listacliente.size();i++){
                   
               
                this.esperarXsegundos(cliente.getListacuentas().get(i).getTiempo());

                System.out.println("Procesada la cuenta (" + cliente.getListacuentas().get(i).getTipo() + ") del cliente "
                        + cliente.getNombre() + " " + cliente.getCedula() + " por "
                        + this.getNombre() + "; Tiempo --> " + (System.currentTimeMillis() - this.initialTime) / 1000
                        + "seg");
               }
            }
        } catch (Exception e) {
            System.out.println("La cajera " + this.nombre + " no tiene mas clientes que atender!");
        }
    }
private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
}
