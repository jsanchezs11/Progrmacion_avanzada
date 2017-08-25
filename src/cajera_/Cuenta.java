/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajera_;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public abstract class Cuenta {
    
    public int saldo;
    private String tipo;
    public Cliente titular;

    public int getSaldo() {
        return saldo;
    }
  

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
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
