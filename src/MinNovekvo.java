/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
public class MinNovekvo {
    public static void main(String[]args){
        int[] a=new int[18];
        for(int i=0; i<a.length; i++){
            a[i]=(int)(Math.random()*101);
            System.out.print(a[i]+" ");           
        }
        int b, c;
        for(int i=0; i<(a.length-1); i++){
            b=a[i];
            c=i;
            for(int j=i+1; j<a.length; j++){
                if(b>a[j]){
                    b=a[j];
                    c=j;                                   
                }
            }      
        a[c]=a[i];
        a[i]=b;
        }
        System.out.println();
        System.out.println("Növekvő sorrendben: ");
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
           }    
}
