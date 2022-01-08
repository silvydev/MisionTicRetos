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
public class Vehiculo {
    int velocidad;
    int cantidad_pasajeros;
    String placa;
    String tipo_vehiculo;

    Vehiculo(String tipo_vehiculo, int cantidad_pasajeros, int velocidad, String placa) {
        this.tipo_vehiculo=tipo_vehiculo;
        this.cantidad_pasajeros=cantidad_pasajeros;
        this.velocidad=velocidad;
        this.placa=placa;
    }
    public String mostrar_datos(){
        return "\tVehículo "+ tipo_vehiculo+" - "+"\tPlaca: "+placa+"\n"+"\tvelocidad: "
                +velocidad+" km/h"+"\n"+"\tpasajeros: "+cantidad_pasajeros;
    }
    
}
