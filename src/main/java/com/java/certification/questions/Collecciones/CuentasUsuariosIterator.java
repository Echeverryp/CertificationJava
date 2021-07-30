package com.java.certification.questions.Collecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuariosIterator {

    public static void main(String[] args) {
        Cliente cliente=new Cliente("Antonio", "00001",2000);
        Cliente cliente1=new Cliente("Antonio", "00002",2100);
        Cliente cliente2=new Cliente("Antonio", "00003",2200);
        Cliente cliente3=new Cliente("Antonio", "00004",2300);
        Cliente cliente4=new Cliente("Antonio1", "00001",2000);

        if(cliente.equals(cliente4)){
            //POSICION DE MEMORIA DEL OBJECT
            System.out.println(cliente.hashCode());
            System.out.println(cliente4.hashCode());
            System.out.println("Is the same person");
        }
        else{
            System.out.println(cliente.hashCode());
            System.out.println(cliente4.hashCode());
            System.out.println("Is not the same person");
        }
        Set<Cliente> clientesBanco=new HashSet<>();
        clientesBanco.add(cliente);
        clientesBanco.add(cliente1);
        clientesBanco.add(cliente2);
        clientesBanco.add(cliente3);

        for (Cliente clientes:clientesBanco) {
            System.out.println("´NOMBRE " + clientes.getNombre() + " N_CUENTA" + clientes.getN_cuenta() + " SALDO" + clientes.getN_cuenta());
        }

        //CON ITERATOR SE BORRAN LOS ELEMENTOS MAS FACIL
        Iterator<Cliente> iterator=clientesBanco.iterator();

        while (iterator.hasNext()){
            String nombre=iterator.next().getNombre();
            if(nombre.equals("Antonio")){
                iterator.remove();
            }
        }


    }
}
