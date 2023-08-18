
package ejercicioarreglo;

import java.util.Scanner;


public class EjercicioArreglo {

    
    public static void main(String[] args) {
                                  
        Scanner Lectura = new Scanner(     System.in);
        //Creacion de las variables
        int mult = 0, sumatoria = 0;
        //creacion de la constante max
        final int MAX = 3;
                //creamos los Array A y B que tendra maximo 10 que fue con lo que inicializamos MAX
        int edadesA [] = new int [MAX];
        int edadesB [] = new int [MAX];
        //Usamos un for para el ingreso de datos de A
        for(int i=0; i<MAX;i++){
                         System.out.println("\n Ingrese los numeros  A");
                         edadesA [i]=Lectura.nextInt();
        }        
        //Usamos un for para el ingreso de datos de B
             for(int i=0; i<MAX;i++){
            //entrada de datos por teclado
                            System.out.println("\n Ingrese numeros B");
                            edadesB [i]=Lectura.nextInt();
             }
                            //salida de datos con un ciclo for para ver todos los datos ingresados en cada posicion
                            for (int i = 0; i<MAX; i++) {
                            //imprime los datos ingresados de A y B para crear la tabla
                            System.out.println(edadesA[i]+"X" +edadesB[i]+"=" + (mult = edadesA[i] * edadesB[i]) );
                            // creacion de la sumatoria total apartir de "result" que sume todos los resultados y  los guarde en la variable sumatoria
                            sumatoria = sumatoria + mult;
                                        }
         // Salida de datos que mostrara la sumatoria de los resultados de las multiplicaciones                   
        System.out.println("la sumatoria es :"+sumatoria);
        
                            
                            
                            
    }
    
    
    
    
}