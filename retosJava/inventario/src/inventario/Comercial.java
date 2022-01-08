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
public class Comercial extends Vehiculo{
    String carga_maxima;
    
    Comercial(String tipo_vehiculo, int cantidad_pasajeros, int velocidad, String placa, String carga_maxima){
       super(tipo_vehiculo, cantidad_pasajeros,velocidad,placa);
       this.carga_maxima=carga_maxima;
    }
    
    @Override
    public String mostrar_datos(){
        return "\tVehículo "+ tipo_vehiculo+" - "+"Placa: "+placa+"\n\tvelocidad: "
                +velocidad+" km/h"+"\n\tpasajeros: "+cantidad_pasajeros+"\n\tCarga máxima: "+
                carga_maxima+"kg";
    }
}
