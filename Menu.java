/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog8.pkg3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Nauzet
 */
public class Menu {
      public static void main(String[] args)throws IOException {
        // TODO code application logic here
        boolean exit = false;//variable para clear nuestro while (bucle para que arrranque el menú)
        int option;//opciones para nuestro menú Switch
        Scanner keyboard = new Scanner(System.in);//Recoger los valores por teclado
        BufferedReader teclado= new BufferedReader(new InputStreamReader(System.in));
        
        while(!exit){//menú quue comienza con un while siemrpe que sea disntinto a salir de el mismo
            System.out.println("================================================= M E N Ú ==================================================");
            System.out.println("| 1. DAR DE ALTA UN ALUMNO CON SUS NOTAS                                                                   |");
            System.out.println("| 2. CONSULTAR LA NOTA PARA UN DADO Y UNA ASIGNATURA DADA                                                  |");
            
            try{//vamos a recoger todas las excepciones que exiten y no liomitaremos a mostrar en pantalla 
                System.out.println("Escribe una de las opciones: ");
                option = keyboard.nextInt();
                System.out.println("Ejecuntando opción " +option+ ". . .");
                
                switch(option){//nuestro menú por dentro con nuestras opciones 
                    case 1:
                       
            
                        break;
                    case 2:
                        System.out.println("CONSULTAR NUMERO DE FALTAS PARA UN ALUMNO Y UNA ASIGNATURA");
                        String name = teclado.readLine();
                        System.out.println(" El Telefono de " + name + " Es " + Faltas.askFaltas(name)); 
                        break;
                }
            }catch(Exception e){
               System.out.println("Error" +e);//Imprimos cualquier excepcion desde la principal raíz o padre de klas que heredan todas las excepciones
               exit = true;
            }
        } 
    
    
}
