import java.util.*;

public class Division
{

     
public static void main(String []args){

       float a,b;

       float c;

       Scanner k=new Scanner(System.in);

       System.out.println("Enter two numbers");

       a=k.nextFloat();

       b=k.nextFloat();

       try{

           c=a/b;

           System.out.println("Ans:"+c);

       }

       catch(ArithmeticException e)

       {

           System.out.println("Wrong input"+e);

       }

     }
   
}