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

        banco.addCliente(cliente1);
        banco.addCliente(cliente2);
        banco.addCliente(cliente3);
        long initialTime = System.currentTimeMillis();
        
         
       
        Cajera cajera1 = new Cajera("Cajera 1", initialTime);
        Cajera cajera2 = new Cajera("Cajera 2", initialTime); 
        
      
        
    }
      public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
