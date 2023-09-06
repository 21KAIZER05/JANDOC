package main;
import java.lang.*;
public class RightTriangle2 {
    public static void main (String[] args){

        double hypotenuse;
        double height;
        height=5.0;
        double base;
        base=10.0;
        hypotenuse=Math.sqrt(height*height + base*base);

         System.out.println( );
         System.out.println( );
         System.out.println("********************************************");
         System.out.println("* Given base of the right triangle="+ base +"  *" );
         System.out.println( "* Given height of the right triangle= "+ base +"  *");
         System.out.println( " * Computed hypotenuse of the right triangle="+ hypotenuse +" *");
         System.out.println( "*********************************************");
    }
}
