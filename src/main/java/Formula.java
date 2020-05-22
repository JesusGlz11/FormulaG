
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesus
 */
public class Formula {
    

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        int x1,x2;
        int a,b,c;
        
        System.out.println("Ingrese el valor de a");
        a= sc.nextInt();
        System.out.println("Ingrese le valor de b");
        b= sc .nextInt();
        System.out.println("ingrese el valor de c");
        c= sc .nextInt();
        
        x1 = (int) ((-b+(Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a));

        x2 = (int) ((-b-(Math.sqrt((Math.pow(b,2)-(4*a*c)))))/(2*a));
        
        
        
        System.out.println("X1="+x1);
        System.out.println("X2="+x2);       
 
    }
}
    

