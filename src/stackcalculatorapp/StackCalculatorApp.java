package stackcalculatorapp;
import java.util.*;

/**
 *
 * @author wustudent
 */
public class StackCalculatorApp {
public static void main(String[] args) {
        StackCalculator stackCalculator = new StackCalculator();
        Scanner sc = new Scanner(System.in);
        String option = "";
        double pushNumber = 0;
        int index;
        int length;
        int size = 0;
        double[] stack;
        
        System.out.println("Welcome to the Stack Calculator\n");
        
        System.out.println("Commands: push n, add, sub, mult, div, clear, or quit\n");
        
        while(!option.equalsIgnoreCase("quit"))
        {
            System.out.print("stack> ");
            
            option = sc.nextLine();
            
            if(option.startsWith("push"))
            {
                index = option.indexOf(" ") + 1;
                
                pushNumber = Double.parseDouble(option.substring(index));
                
                stackCalculator.push(pushNumber);
                
                size++;
            }
            else if(option.equalsIgnoreCase("add"))
            {
                if(size >= 2)
                {
                    stackCalculator.add();
                    size--;
                }
                else
                {
                    System.out.println("Error! Not enough values in stack.");
                }
            }
            else if(option.equalsIgnoreCase("sub"))
            {
                if(size >= 2)
                {
                    stackCalculator.subtract();
                    size--;
                }
                else
                {
                    System.out.println("Error! Not enough values in stack.");
                }
            }
            else if(option.equalsIgnoreCase("mult"))
            {
                if(size >= 2)
                {
                    stackCalculator.multiply();
                    size--;
                }
                else
                {
                    System.out.println("Error! Not enough values in stack.");
                }
            }
            else if(option.equalsIgnoreCase("div"))
            {
                if(size >= 2)
                {
                    stackCalculator.divide();
                    size--;
                }
                else
                {
                    System.out.println("Error! Not enough values in stack.");
                }
            }
            else if(option.equalsIgnoreCase("clear"))
            {
                stackCalculator.clear();
                size = 0;
            }
            else if(!option.equalsIgnoreCase("quit"))
            {
                System.out.println("Invalid Command!");
            }
              
            if(!option.equalsIgnoreCase("quit"))
            {
                stack = stackCalculator.getValues();
            
            for(int i = 0; i < stack.length; i++)
            {
                System.out.println(stack[i]);
            }
            
            if(stack.length == 0)
            {
                System.out.println("empty");
            }
            
            System.out.println();
            }
            
        }
        
        System.out.println("\nThank you for using the Stack Calculator.");
    }
    
    
}
