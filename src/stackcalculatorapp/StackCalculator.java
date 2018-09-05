package stackcalculatorapp;

import java.util.*;

public class StackCalculator {
    
    private LinkedList<Double> stack = new LinkedList<>();
    
    public void push(double x){
        stack.addFirst(x);
    }
    
    public double pop(){
        double x = stack.removeFirst();
        
        return x;
    }
    
    public double add(){
        double sum = stack.removeFirst() + stack.removeFirst();
        
        stack.addFirst(sum);
        
        return sum;
    }
    
    public double subtract(){
        double difference = stack.removeFirst() - stack.removeFirst();
        
        stack.addFirst(difference);
        
        return difference;
    }
    
    public double multiply(){
        double product = stack.removeFirst() * stack.removeFirst();
        
        stack.addFirst(product);
        
        return product;
    }
    
    public double divide(){
        double quotient = stack.removeFirst() / stack.removeFirst();
        
        stack.addFirst(quotient);
        
        return quotient;
    }
    
    public void clear(){
        stack.clear();
    }
    
    public double[] getValues(){
        double[] stackValues = new double[stack.size()];
        
        for(int i = 0; i < stack.size(); i++)
        {
            stackValues[i] = stack.get(i);
        }
        
        return stackValues;
    }
}


