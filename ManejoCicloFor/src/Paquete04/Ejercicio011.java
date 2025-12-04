/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete04;

/**
 *
 * @author USUARIO
 */
public class Ejercicio011 {

    public static void main(String[] args) {
    
        int operacion = 0;
        int operacion2 = 0;
        int operacion3 = 0;
        int operacion4 = 0;
        int fila2;
        int fila3;
        int fila4;
        String mensaje_final = ""; 
        String mensaje_suma;
        
        for (int i = 30; i >= 10; i--) {
            fila2 = i * 2;
            fila3 = i * 3;
            fila4 = i * 4;

            mensaje_final += String.format("%d-,%d-,%d-,%d\n", i, fila2, fila3,
                    fila4);

            operacion += i;
            operacion2 += fila2;
            operacion3 += fila3;
            operacion4 += fila4;
        }

        mensaje_suma = String.format("totales %d-,%d-,%d-,%d", operacion, 
                operacion2, operacion3, operacion4);

        String mensaje_completo = mensaje_final + mensaje_suma + "-\n";
        
        System.out.printf("%s", mensaje_completo);
    }
}