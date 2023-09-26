/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Scanner;
public class Validation {
    Scanner sc = new Scanner(System.in);
    
    
    public int checkInputIntLimit(int min, int max){
        while(true){
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max){
                    throw new NumberFormatException();
                }
                return result;
            }
            catch (NumberFormatException e){
                System.err.println("Pls input number in rage [" +min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
}
