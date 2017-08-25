/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajera_;

import java.util.Iterator;

/**
 *
 * @author Ts
 */
public class Controlador {
Banco banco;


    public Controlador() {
        banco = new Banco("Pichincha");
       Cliente cliente1 = new Cliente( "Jorge Rudas", "23456");
       Cliente cliente2 = new Cliente( "Santiago Sanchez", "12345");
       Cliente cliente3 = new Cliente( "Jair Silva", "2366666");
       Cliente cliente4 = new Cliente( "Gian Tovar", "222222");

        banco.addCliente(cliente1);
        banco.addCliente(cliente2);
        banco.addCliente(cliente3);
        banco.addCliente(cliente4);
        long initialTime = System.currentTimeMillis();
        
         
       
        Cajera cajera1 = new Cajera("Cajera:Maria", initialTime);
        Cajera cajera2 = new Cajera("Cajero:Juan", initialTime); 
        
      banco.addCajera(cajera1);
      banco.addCajera(cajera2); 
    }
      public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
