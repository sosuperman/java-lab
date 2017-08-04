import java.util.Arrays;
import java.util.Scanner;
//Link:https://www.codechef.com/AUG17/problems/RAINBOWA
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shraban Karmakar
 */
public class ChefAndRainbowArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        out:while(t-->0){
            int n = in.nextInt();
            int[] a = new int[n];
            int[] aCopy = new int[n];
            for(int i = 0; i<n; i++)
                a[i] = in.nextInt();
            int c = 0;
            for(int i = n-1; i>=0; i--){
                aCopy[c] = a[i];
                c++;
            }
            
            
            for(int i = 0; i<n/2 ; i++){
                //System.out.println(a[i]+","+a[i+1]);
                if(((a[i+1] - a[i]) != 0 && (a[i+1] - a[i]) !=1))//Checking the case of missing any sequence
                {
                    //System.out.println(a[i]+","+a[i+1]);
                    
                    System.out.println("no");
                    continue out;
                }
            }
            if(Arrays.equals(a,aCopy))//Whether the array is palindrome or not after checking all conditions
                System.out.println("yes");
            
        }
    }
}
