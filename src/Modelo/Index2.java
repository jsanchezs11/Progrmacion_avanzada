package Modelo;

import patrones.monitor.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Index2 {


    Banco banco;

    public static void main(String[] args) {
        Banco banco = new Banco("Pichincha");
       Cliente cliente1 = new Cliente( "Jorge Rudas", "23456");
       Cliente cliente2 = new Cliente( "Santiago Sanchez", "12345");
       Cliente cliente3 = new Cliente( "Steven Sanchez", "11111");
       Cliente cliente4 = new Cliente( "Jair Silva", "2366666");

        banco.addCliente(cliente1);
        banco.addCliente(cliente2);
        banco.addCliente(cliente3);
        banco.addCliente(cliente4);
        long initialTime = System.currentTimeMillis();
        
        
       
        Cajera cajera1 = new Cajera("Cajera 1", "23",initialTime);
        Cajera cajera2 = new Cajera("Cajera 2", "44",initialTime); 
        
        cajera1.start();
        cajera2.start();
    }

   
}
