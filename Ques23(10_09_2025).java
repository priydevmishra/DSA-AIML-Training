import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	int m =sc.nextInt();
	int arr[] = new int[n];
	int brr[] = new int[m];
	int crr[] = new int[m];
	
	for(int i=0; i<n; i++){
	    arr[i] = sc.nextInt();
	    }
	    
	   for(int i=0; i<m; i++){
	    brr[i] = sc.nextInt();
	    }
	
	for(int i=0; i<m; i++){
	    int k=0;
	    for(int j=0; j<n; j++){
	        if(brr[i]<arr[j]){
	            k++;
	        }
	    }
	  crr[i]=k;
	
	}
	for(int i=0; i<m; i++){
	    System.out.print(crr[i]+" ");
	}

	}
}
