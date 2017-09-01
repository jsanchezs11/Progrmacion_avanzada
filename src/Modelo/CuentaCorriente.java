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
public class CuentaCorriente extends Cuenta{
    
    public CuentaCorriente(int saldo,int tiempo){
        this.tiempo=tiempo;
        this.saldo= saldo;
        this.setTipo("Corriente");
    }

    @Override
     public String toString(){
        return this.getTipo() + " - " +this.getSaldo() + " - " +this.getCliente_t()+"-"+this.getTiempo();
    }
}