/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class Cuenta {
    
    public int saldo;
    private String tipo;
    public Cliente cliente_t;
    public int tiempo;

    public int getSaldo() {
        return saldo;
    }

    public Cliente getCliente_t() {
        return cliente_t;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public void setCliente_t(Cliente cliente_t) {
        this.cliente_t = cliente_t;
    }
  

   


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public abstract String toString();
    
}
