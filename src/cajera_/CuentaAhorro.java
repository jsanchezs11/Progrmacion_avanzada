/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajera_;

/**
 *
 * @author soportecsi
 */
public class CuentaAhorro extends Cuenta{
    
    public CuentaAhorro(int saldo){
        this.saldo= saldo;
        this.setTipo("Ahorros");
    }

    @Override
     public String toString(){
        return this.getTipo() + " - " +this.getSaldo() + " - " +this.getTitular();
    }
}
  