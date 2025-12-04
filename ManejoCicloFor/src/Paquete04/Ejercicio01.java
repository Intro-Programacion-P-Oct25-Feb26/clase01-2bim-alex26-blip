/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete04;

/**
 *
 * @author USUARIO
 */
public class Ejercicio01 {

    int operacion = 0;
    int operacion2 = 0;
    int operacion3 = 0;
    int operacion4 = 0;
    int fila2;
    int fila3;
    int fila4;
    String mensaje_final = "";
    String mensaje_suma;

    for (int i = 30; i >=10; --1) {
        fila2 = i * 2;
        fila3 = i * 3;
        fila4 = i * 4;
        mensaje_final += String.format("%s-,%s-,%s-,%s\n, i, fila2, "
                + "fila3, fila4");
        operacion += i;
        operacion += operacion2;
        operacion += operacion3;
        operacion += operacion4;
    }

    mensaje_suma  = String.format("totales%s-,%s-,%s-,%s", operacion, "
                    + "operacion2 , operacion3, operacion4);
    mensaje_final  = String.format("%s-,%s-\n", mensaje_final,
            +" mensaje_suma);"
    System.out.printf("%s\n",mensaje_final );             
            
            
            
            
            
    
    
    
   
}
