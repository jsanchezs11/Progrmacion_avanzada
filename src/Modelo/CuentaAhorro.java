/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author soportecsi
 */
public class CuentaAhorro extends Cuenta{
    
    public CuentaAhorro(int saldo,int tiempo){
        this.tiempo=tiempo;
        this.saldo= saldo;
        this.setTipo("Ahorros");
    }

    @Override
     public String toString(){
        return this.getTipo() + " - " +this.getSaldo() + " - " +this.getCliente_t()+"-"+this.getTiempo();
    }
}
  