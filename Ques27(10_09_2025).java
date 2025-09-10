import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args){
		// your code goes here
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int arr[] = new int[n];
    int maxSum  =0;
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }

    for(int i=0; i<n; i++){
        int sum=0;
        for(int j=i; j<n; j++){
            sum = sum+arr[j];
            if(maxSum<sum){
                maxSum = sum;
            }
        }
    }
	    
    System.out.println(maxSum);
	}
}
