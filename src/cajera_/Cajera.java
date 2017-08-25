/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajera_;

/**
 *
 * @author Fuller 101
 */
public class Cajera extends Thread  {
    private String nombre;
    private long initialTime;

    public Cajera(String nombre, long initialTime) {
        this.nombre = nombre;
        this.initialTime = initialTime;
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
       // procesarCompra();
    }
    public void procesarCompra() {
        try {
            while (true) {
                Cliente cliente = Banco.siguienteCliente();

                for (int i = 0; i < cliente.getListacuentas().; i++) {
                    this.esperarXsegundos(cliente.getCarroCompra()[i]);
                    System.out.println(Banco.cont + ") Procesado el producto " + (i + 1)
                            + " del " + cliente.getNombre() + " por " + this.nombre + "->Tiempo: "
                            + (System.currentTimeMillis() - this.initialTime) / 1000
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
