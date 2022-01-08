/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventario;

/**
 *
 * @author ING SILVIA MESINO
 */
public class Particular extends Vehiculo{
    String color;

    Particular(String tipo_vehiculo, int cantidad_pasajeros, int velocidad, String placa, String color) {
       super(tipo_vehiculo, cantidad_pasajeros,velocidad,placa);
       this.color=color;
    }

    @Override
    public String mostrar_datos(){
        return "\tVehículo "+ tipo_vehiculo+" - "+"Placa: "+placa+"\n\tvelocidad: "
                +velocidad+" km/h"+"\n\tpasajeros: "+cantidad_pasajeros+"\n\tcolor: "+
                color;
    }

   
}
