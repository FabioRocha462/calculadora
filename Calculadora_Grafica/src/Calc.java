/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabio
 */
public class Calc {
    private float resultado;
    public double soma(double a, double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double mult(double a, double b){
        return  a*b;
    }
    public double div(double a, double b){
       try{
        return a/b;
       }catch(Exception e){
           System.out.println(e.getMessage());
       }
       return a/b;
    }
    public double pot(double a,double b){
        return Math.pow(a, b);
    }
    public double raiz(double a,double b){
        try{
        return Math.pow(a, 1/b);
        }catch(Exception e){
            return 1;
        }
        
    }
}
