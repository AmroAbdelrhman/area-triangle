/*
 * Amro Abdelrhman
 * Calculating the area of triangle using trignometery and Heron's formula
 * 21/02/2020
 */
package areaoftriange;
import java.util.Scanner;
/**
 *
 * @author Amro
 */
public class Areaoftriange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double choice ;                            //the choice of formula
        double [ ] side1 = new double [2];         //one of the information needed to find area
        double [] side2 = new double [2];          //one of the information needed to find area
        double side3;                              //one of the information needed to find area
        double angle;                              //one of the information needed to find area
        double [] answer = new double [2];         //the area itself
        double s;                                  //semi-perimeter
        do {
            System.out.println("Enter your choice ");
            System.out.println("1-calculate the area using trignometery formula = (a + b + Sin(C)) / 2");
            System.out.println("2-Calculate the area using Heron's formula ");
            System.out.println("3-Exit");
            choice = input.nextDouble();           //the user input his choice
            if ( choice == 1){
                System.out.println(" Enter side 1 ");
                side1[0] = input.nextDouble();     //the user input side 1
                System.out.println(" Enter side 2 ");
                side2[0] = input.nextDouble();     //the user input side 2
                System.out.println("Enter the angle ");
                angle = input.nextDouble();        //the user input the angle
                answer[0] =(side1[0] + side2[0] + Math.sin(angle))/2;  //computer calculating the area
                System.out.println(""+side1[0]+" + "+side2[0]+" + "+angle+" / 2");
                System.out.println("the area of the triangle is "+answer[0]);    // output the answer
                System.out.println("thank you");
            }
            else if (choice == 2){
                System.out.println(" Enter side 1 ");
                side1[1] = input.nextDouble();     //the user input side 1
                System.out.println(" Enter side 2 ");
                side2[1] = input.nextDouble();     //the user input side 2
                System.out.println("Enter the side 3  ");
                side3 = input.nextDouble();        //the user input side 3
                System.out.println("awesome ");
                System.out.println("let's calculate the semi-perimeter of the calculator first ");
                System.out.println("( "+side1[1]+" + "+side2[1]+" + "+side3+" ) / 2 ");
                s = (side1[1]+side2[1]+side3)/2;   //computer calculating the Semi-perimeter
                System.out.println("so the means that the semi-perimeter is "+s);
                System.out.println("to calculate the area ");
                System.out.println("the square root of "+s+" ( "+s+" - "+side1[1]+" ) ( "+s+" - "+side2[1]+" ) ( "+s+" - "+side3+" ) ");
                answer[1] = Math.sqrt(s *(s-side1[1])*(s-side2[1])*(s-side3));   //computer calculating the area
                System.out.println("the area of the triangle using Heron's formula is "+answer[1]);
                System.out.println("thank you");
            }
        } while ( choice != 3);
                System.out.println("bye bye");
    }
    
    
}
