/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ligabaloncesto;     
import java.util.Scanner;
/**
 *
 * @author ING SILVIA MESINO
 */

public class LigaBaloncesto {
    
   public static int[] puntos(int x){
        int toledo;
        int norato;
        int barrero;
         
        toledo=x;
        norato=(toledo*2)+(2*2);
        barrero=(toledo + norato)/5;
        
        return new int []{toledo, norato, barrero};
        
    } 
   public static String nivel(int barrero){
       int PuntosJugador=barrero;
       String NivelJugador;
       
       if (PuntosJugador <= 20){
           NivelJugador="uno";
       }
       else if (PuntosJugador > 20 && PuntosJugador<=30){
           NivelJugador="dos";
       }
       else if (PuntosJugador >30 && PuntosJugador <= 50){
           NivelJugador="tres";
       }
       else{
           NivelJugador="cuatro";
       }
       return NivelJugador;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Por favor ingrese los puntos del jugador Toledo");
        int x=sc.nextInt();
        
        int PuntosNivel[]= puntos(x);
        nivel (PuntosNivel[2]);
 
        
        System.out.println(PuntosNivel[0] +" "+ PuntosNivel[1]+ " "+ PuntosNivel[2]);
        System.out.println(nivel(PuntosNivel[2]));
        
        
    }
    
}
