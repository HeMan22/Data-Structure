//You are given heights of consecutive buildings. You can move from the roof of a building to the roof of next adjacent building.
//You need to find the maximum number of consecutive steps you can put forward such that you gain an increase in altitude
//with each step.
//Input:
//N = 5
//A[] = {1,2,2,3,2}
//Output: 1
//Explanation: 1, 2 or 2, 3 are the only consecutive 
//buildings with increasing heights.

package Searching;

import java.util.*;
import java.io.*;
import java.lang.*;
public class RoofTop {
	// { Driver Code Starts
	
	    
	    public static void main(String args[])throws IOException
	    {
	        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(read.readLine());
	        
	        while(t-- > 0)
	        {
	            int n = Integer.parseInt(read.readLine());
	            
	            int arr[] = new int[n];
	            
	            String st[] = read.readLine().trim().split("\\s+");
	            
	            for(int i = 0; i < n; i++)
	              arr[(int)i] = Integer.parseInt(st[(int)i]);
	              
	            
	            System.out.println(maxStep(arr, n));
	        }
	    }
	    
	   
	    static int maxStep(int arr[], int n) {
	    	
	    	int max =0, count=0;
	    	for(int i=0;i<n;i++) {
	    		if(i==n-1)
	    			break;
	    		if(arr[i]<arr[i+1])
	    			count++;
	    		else {
	    			max=Math.max(max, count);
	    			count=0;
	    		}
	    	}
	    	return Math.max(max, count);
	    	
	    }
}
