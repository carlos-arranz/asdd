package vehiculos;

import java.util.Scanner;

public class aplivehiculo {

     public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         
         String modelo;
         double potencia;
         String trac;
         boolean traccion;
         Vehiculos[] coches = new Vehiculos[10];
         int contador = 0;
         
         do{
             System.out.println("Teclea un modelo o FIN: ");
             modelo= sc.nextLine();
             if(!modelo.equalsIgnoreCase("FIN") && contador <10){
                 System.out.println("Teclea potencia: ");
                 potencia = sc.nextDouble();
                 sc.nextLine();
                 do{
                     System.out.println("Traccion 4 ruedas?[s/n]: ");
                     trac = sc.nextLine();
                 }while(!trac.equalsIgnoreCase("S")&&
                         !trac.equalsIgnoreCase("N"));
                 if(trac.equalsIgnoreCase("S"))
                     traccion = true;
                 else
                     traccion = false;
                 coches[contador] = new Vehiculos(modelo, potencia, traccion);
                 contador++;
             } 
         }while(!modelo.equalsIgnoreCase("FIN") && contador <10);
         
            for (int i = 0; i < contador; i++){
                System.out.println("Coche: " + coches[i].imprimir());
            }
    }
}
