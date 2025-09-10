import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args){
		// your code goes here
	int maxProfit = 0;
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int arr[] = new int[n];
	int crr[] = new int[n];
    int greatest  =0;
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++){
        int profit= 0;

         for(int j=i; j<n; j++){
             if(arr[j]>arr[i]&&maxProfit<arr[j]-arr[i]){
                 maxProfit = arr[j]-arr[i];
             }
         }
    }
	    
    System.out.println(maxProfit);
	}
}
