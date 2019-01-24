/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conjuntos_tiffannyvarela;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author tiffa
 */
public class Conjuntos_TiffannyVarela {

    /**
     * @param args the command line arguments
     */
    static Scanner r = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList();
        ArrayList<Integer> lista2 = new ArrayList();
        ArrayList<Integer> lista3 = new ArrayList();
        ArrayList<Integer> inter = new ArrayList();

        int val = 1;
        while (val != 0) {
            System.out.println("Ingrese los numeros, ingrese 0 para salir: ");
            val = r.nextInt();
            lista.add(val);
        }
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Integer) {
                System.out.println("Lista 1 ->" + lista.indexOf(lista.get(i)) + "= " + lista.get(i));
            }
        }
        System.out.println("\n\n");

        int val2 = 1;
        while (val2 != 0) {
            System.out.println("Ingrese los numeros [lista 2], ingrese 0 para salir: ");
            val2 = r.nextInt();
            lista2.add(val2);
        }

        for (int i = 0; i < lista2.size(); i++) {
            if (lista2.get(i) instanceof Integer) {
                System.out.println("Lissta 2->" + lista2.indexOf(lista2.get(i)) + "= " + lista2.get(i));
            }
        }

        System.out.println("\n\n");

        int val3 = 1;
        while (val3 != 0) {
            System.out.println("Ingrese los numeros [lista 3], ingrese 0 para salir: ");
            val3 = r.nextInt();
            lista3.add(val3);
        }

        for (int i = 0; i < lista3.size(); i++) {
            if (lista3.get(i) instanceof Integer) {
                System.out.println("Lista 3->" + lista3.indexOf(lista3.get(i)) + "= " + lista3.get(i));
            }
        }
        System.out.println("\n\n");
        if (lista.size() > lista2.size() && lista.size() > lista3.size()) {
            for (int i = 0; i < lista.size(); i++) {
                for (int j = 0; j < lista2.size(); j++) {
                    for (int k = 0; k < lista3.size(); k++) {
                        if (lista.get(i).equals(lista2.get(j)) && lista.get(i).equals(lista3.get(k))) {
                            inter.add(lista.get(i));
                        }
                    }
                }
            }

            Collections.sort(inter);
            for (int i = 0; i < inter.size(); i++) {
                for (int j = 0; j < inter.size(); j++) {
                    if (inter.get(i).equals(inter.get(j))) {
                        inter.remove(i);
                    }
                }
                if (inter.get(i) instanceof Integer) {
                    System.out.println("Interseccion->" + inter.indexOf(inter.get(i)) + "= " + inter.get(i));
                }
            }
        }

        if (lista2.size() > lista.size() && lista2.size() > lista3.size()) {
            for (int i = 0; i < lista2.size(); i++) {
                for (int j = 0; j < lista.size(); j++) {
                    for (int k = 0; k < lista3.size(); k++) {
                        if (lista2.get(i).equals(lista.get(j)) && lista2.get(i).equals(lista3.get(k))) {
                            inter.add(lista2.get(i));
                        }
                    }
                }
            }
            Collections.sort(inter);
            for (int i = 0; i < inter.size(); i++) {
                for (int j = 0; j < inter.size(); j++) {
                    if (inter.get(i).equals(inter.get(j))) {
                        inter.remove(i);
                    }
                }
                if (inter.get(i) instanceof Integer) {
                    System.out.println("Interseccion->" + inter.indexOf(inter.get(i)) + "= " + inter.get(i));
                }
            }
        }

        if (lista3.size() > lista.size() && lista3.size() > lista2.size()) {
            for (int i = 0; i < lista3.size(); i++) {
                for (int j = 0; j < lista.size(); j++) {
                    for (int k = 0; k < lista2.size(); k++) {
                        if (lista3.get(i).equals(lista.get(j)) && lista3.get(i).equals(lista2.get(k))) {
                            inter.add(lista3.get(i));
                        }
                    }
                }
            }
            Collections.sort(inter);
            for (int i = 0; i < inter.size(); i++) {
                for (int j = 0; j < inter.size(); j++) {
                    if (inter.get(i).equals(inter.get(j))) {
                        inter.remove(i);
                    }
                }
                if (inter.get(i) instanceof Integer) {
                    System.out.println("Interseccion->" + inter.indexOf(inter.get(i)) + "= " + inter.get(i));
                }
            }
        }

        if (lista3.size() == lista.size() && lista3.size() == lista2.size()) {
            for (int i = 0; i < lista3.size(); i++) {
                for (int j = 0; j < lista.size(); j++) {
                    for (int k = 0; k < lista2.size(); k++) {
                        if (lista3.get(i).equals(lista.get(j)) && lista3.get(i).equals(lista2.get(k))) {
                            inter.add(lista3.get(i));
                        }
                    }
                }
            }
            Collections.sort(inter);
            for (int i = 0; i < inter.size(); i++) {
                for (int j = 0; j < inter.size(); j++) {
                    if (inter.get(i).equals(inter.get(j))) {
                        inter.remove(i);
                    }
                }
                if (inter.get(i) instanceof Integer) {
                    System.out.println("Interseccion->" + inter.indexOf(inter.get(i)) + "= " + inter.get(i));
                }
            }
        }
    }
    
}
