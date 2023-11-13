package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        logger.info("Execution Started");
        while(true)
        {
            System.out.println("operation");
            
            System.out.println("1 addition ");
            System.out.println("2 subtraction");
            System.out.println("3 *");
            System.out.println("4 /");
            System.out.println("5 power");
            int selection=scanner.nextInt();
            double res=0.0;
            if(selection==6)
            {
                break;
            }
            System.out.print("enter 1st number:");
            double num1=scanner.nextDouble();
            System.out.print("enter 2nd number:");
            double num2=scanner.nextDouble();
            switch(selection){
                case 1:
                    res=add(num1,num2);
                    logger.info(Double.toString(num1)+ " add "+Double.toString(num2));
                    break;
                case 2:
                    res=sub(num1,num2);
                    logger.info(Double.toString(num1)+ " subract "+Double.toString(num2));
                    break;
                case 3:
                    res=mul(num1,num2);
                    logger.info(Double.toString(num1)+ " multiply "+Double.toString(num2));
                    break;
                case 4:
                    res=division(num1,num2);
                    logger.info(Double.toString(num1)+ " divide "+Double.toString(num2));
                    break;
                case 5:
                    res=power(num1,num2);
                    logger.info(Double.toString(num1)+ " power "+Double.toString(num2));
                    break;
                default:
                    System.out.println("No operation selected");
            }
            System.out.println("Result:"+res);
            logger.info("Result - "+res);
        }
        scanner.close();
        logger.info("Execution Ended");
    }
    public static double add(double n1,double n2)
    {
        return n1+n2;
    }
    public static double sub(double n1,double n2)
    {
        return n1-n2;
    }
    public static double mul(double n1,double n2)
    {
        return n1*n2;
    }
    public static double power(double n1,double n2)
    {
        return Math.pow(n1,n2);
    }
    public static double division(double n1,double n2)
    {
       if(n2==0)
       {
           System.out.println("error");
           return Double.NaN;
       }
       return n1/n2;
    }
}
