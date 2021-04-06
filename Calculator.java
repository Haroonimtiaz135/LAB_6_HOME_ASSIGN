
package calculator;
import java.lang.Math;

public class Calculator {

    public static void add(int x, int y){
        int add = x+y;
        System.out.println(" addition of "+x+" and "+y+" is :"+add);
    }
    
    public static void subtract(int x, int y){
        int sub = x-y;
        System.out.println(" subtraction of "+x+" and "+y+" is :"+sub);
    }
    
    public static void divide(double x, double y){
        double divide = x/y;
        System.out.println(" division of "+x+" and "+y+" is :"+divide);
    }
    
    public static void multiply(int x, int y){
        int multiply = x*y;
        System.out.println(" multiplication of "+x+" and "+y+" is :"+multiply);
    }
    
    public static void modulus(double x, double y){
        double mod = x%y;
        System.out.println(" modulus of "+x+" and "+y+" is :"+mod);
    }
    
    public static void sin(double x){
        double sin = Math.sin(x);
        System.out.println(" sin of "+x+" is :"+sin);
    }
    
    public static void tan(double x){
        double tan = Math.tan(x);
        System.out.println(" tan of "+x+" is :"+tan);
    }
    
    public static void cos(double x){
        double cos = Math.cos(x);
        System.out.println(" cos of "+x+" is :"+cos);
    }
    
    
}
