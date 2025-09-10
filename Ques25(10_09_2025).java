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
	int arr[] = new int[n];
	int crr[] = new int[n];

    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }

	for(int i=0; i<n; i++){
	    int greater = arr[i];
	    int greatest = 0;
	for(int j =i; j<n; j++){
	    if(greater<arr[j]){
	        greater = arr[j];
	        greatest= arr[j];
	    }
	}
	crr[i]=greatest;
}
	    
	    for(int i=0; i<n; i++){
	       System.out.print(crr[i]+" ");
	       
	    }

	}
}
