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

	for(int i=0; i<n; i++){
	    arr[i] = sc.nextInt();
	    }
	    
	for(int i=0; i<=n; i++){
	    for(int j=i; j<n; j++){
	        if(arr[i]+arr[j]==m){
	            System.out.println(arr[i]+" "+arr[j]);
	        }
	    }
	}

	}
}
