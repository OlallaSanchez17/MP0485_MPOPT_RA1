/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyApi;

import java.util.Scanner;

/**
 *
 * @author Olalla SB
 */
public class MyApi {
    public static int pedirEnteroPositivo(int min, int max, String msg) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            try {
                System.out.println(msg);
                n = sc.nextInt();                
                
                if (min <= n && n <= max) {
                    break;                    
                } else {
                    System.out.println("Elija un número entre " + min + " y " + max);
                    
                }
            } catch (Exception e) {
                
                System.out.println("Error al introducir datos");
                sc.next();                
            }
            
        } while (true);        
        return n;        
    }
    
    public static void menu(String... text) {
        
        for (String t : text) {
            System.out.println(t);
        }        
    }    
}
