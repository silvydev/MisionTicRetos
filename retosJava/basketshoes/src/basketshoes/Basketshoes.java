/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basketshoes;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;

/**
 *
 * @author ING SILVIA MESINO
 */
public class Basketshoes {
    //Creamos el metodo marcas
    public static ArrayList<String> marcas(ArrayList<String>allmarcas){
        ArrayList<String> marca = new ArrayList();
        //System.out.println(allmarcas.get(1));
        for(int i=0; i<allmarcas.size();i++){
            if (!marca.contains(allmarcas.get(i))){
                marca.add(allmarcas.get(i));
            }
        
        }
        
        return marca;
    }
    
    public static ArrayList<Integer> marcas_faltantes(ArrayList<Integer>numero_zapatillas,
                ArrayList<String> allmarcas, String marca_zapatilla){
    
        ArrayList<Integer> num_falta = new ArrayList();
        
        for( int i=0; i<numero_zapatillas.size();i++){
            
            if(allmarcas.get(numero_zapatillas.get(i)).equals(marca_zapatilla)){
                num_falta.add(numero_zapatillas.get(i));
                
            }
            
        }
        
        return num_falta;
    }
    
    public static ArrayList zapatillas_faltantes(
            ArrayList zapatillas_sector, ArrayList zapatillas_otro){
        
        ArrayList zapatillas_interesan = new ArrayList();
        for (int i=0;i<zapatillas_sector.size();i++){
            if(!zapatillas_otro.contains(zapatillas_sector.get(i))){
                zapatillas_interesan.add(zapatillas_sector.get(i));
            } else {
            } 
        }
        
        return zapatillas_interesan;
    }
    
    public static Integer zapatillas_disponibles_para_cambio(
            ArrayList zapatillas_otro, ArrayList zapatillas_sector){
        
       
       int contadora=0;
       int contadorb=0;
        for (int i=0;i<zapatillas_otro.size();i++){
            if(!zapatillas_sector.contains(zapatillas_otro.get(i))){
               contadora++;
            } 
        }
        for (int i=0;i<zapatillas_sector.size();i++){
            if(!zapatillas_otro.contains(zapatillas_sector.get(i))){
                contadorb++;
            } 
        }
        Integer numero_cambios = Math.min(contadora, contadorb);
        
        return numero_cambios;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> listamarcas = new ArrayList <>(Arrays.asList("nike","adidas","rebook", "rebook", 
        "rebook","nike","adidas", "rebook", "rebook", "rebook"));
        ArrayList<Integer> num_faltantes = new ArrayList <>(Arrays.asList(1,3,6,8));
        String marca="rebook";
        ArrayList<Integer> zapatillasa = new ArrayList <>(Arrays.asList(3,5,7,10,15,16));
        ArrayList<Integer> zapatillasb = new ArrayList <>(Arrays.asList(4,10,5,8));
        
        System.out.println(marcas(listamarcas));
        System.out.println(marcas_faltantes(num_faltantes,listamarcas,marca));
        System.out.println(zapatillas_faltantes(zapatillasa,zapatillasb));
        System.out.println(zapatillas_disponibles_para_cambio(zapatillasb,zapatillasa));
       // ArrayList nombreArray = new ArrayList();
        
    }
    
}
