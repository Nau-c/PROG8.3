/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog8.pkg3;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Nauzet
 */
public class Alumno {
    
    int [][] Notas = new int [10][3];
    TreeMap<Integer, String> alumno = new TreeMap<Integer, String>();
    HashMap<Integer, String> asignaturas = new HashMap<Integer, String>();
    
    public Alumno(){
        
    }
        
   
    //Método que inicializa las variables
    public 
    
    //Método para carga los valores en el array
   
    public void cargarAsignaturas(String[] Asignaturas) {
        for (int i = 0; i < 3; i ++){
            asignaturas.put(i, asignaturas.get(i));
        }
    }
    
    public void cargasAlumno (String[] alumno) {
        for (int i = 0; i < 10; i++){
            alumno.put(i, alumno.get(i));
        }
    }
    
    
    public Alumno (String[] alumno,String[] asignaturas){//Método que inicializa las variables 
    this.alumno = alumno;
    this.asignaturas = asignaturas;
    }
 
   //Método que nos carga los datos
   public void loadData(){
       this.alumno = new String[] {"pepe", "bartolo", "airam", "liam", "lolo", "nauzet", "lucas", "Iru", "Alberto", "Cristian"};
       this.asignaturas = new String[] {"123456789", "987456321", "922653987", "928693698", "922895878", "928454749", "982787475","629105023", "922417741", "985656923"};
   }
  
        
    
    
}
