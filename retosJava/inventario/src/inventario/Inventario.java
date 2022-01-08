/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ING SILVIA MESINO
 */
public class Inventario {

    /**
     * @return
     */
    public static ArrayList<Vehiculo> procesar_comandos() {

        ArrayList<Vehiculo> inventario = new ArrayList();
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            //Scanner sc = new Scanner(System.in);
            String comando = sc.nextLine();

            String[] datos = comando.split("&");

            int opcion = Integer.parseInt(datos[0]);
 
            if (opcion == 1) {

                int pasajeros = Integer.parseInt(datos[2]);
                int vel = Integer.parseInt(datos[3]);
                if ("Particular".equals(datos[1])) {
                    Vehiculo v = new Particular(datos[1], pasajeros, vel, datos[4], datos[5]);
                    inventario.add(v);

                } else {
                    Vehiculo v = new Comercial(datos[1], pasajeros, vel, datos[4], datos[5]);
                    inventario.add(v);
                }

            } else if (opcion == 2) {

                System.out.println("***Inventario de vehículos***");
                for (int i = 0; i < inventario.size(); i++) {
                    System.out.print(inventario.get(i).mostrar_datos() + "\n");
                }
            } else {
                break;
            }

        }
        return inventario;

    }

    public static void main(String[] args) {
        // TODO code application logic here     
        procesar_comandos();

    }

}
