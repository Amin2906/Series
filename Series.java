/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series;

import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;

/**
 *
 * @author MUHAMMAD AMIN
 */
public class Series {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scan=new Scanner(System.in);
        
        int n1=0;
        int n2=1, sum;
        for (int i=1; i<10; i++){
          sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
          
        }
        
    }
    
}
