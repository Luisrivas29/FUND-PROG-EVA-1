/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_9_area_triangulo;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_9_AREA_TRIANGULO {

  
    public static void main(String[] args) {
        
     double base;
     double altura;
     double area;        
     Scanner captura = new Scanner(System.in);
     
     System.out.println("Introduce la base del triangulo");
     base = captura.nextDouble();
     System.out.println("Introduce la altura del triamgulo");
     altura = captura.nextDouble();
     
     area = (base * altura) / 2;
     
     System.out.println("El area del triangulo es: ");
     System.out.println(area);
    }
    
}
