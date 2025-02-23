import java.lang.System;
import java.util.Scanner;

class bubblesort{
    public static void main(String args[]){
        // Initialize an array with unsorted values
        int[] array = {2,4,1,7,3};

        System.out.println("before sorted: ");

         // Get the length of the array
        int n = array.length;
        
        // Print the original unsorted array
        for (int p=0; p<n; p++){
            System.out.print(array[p]+" ");
        }
        for (int i=0; i<n-1; i++){
            // Inner loop for comparing adjacent elements in the array
            for (int j=0; j<n-i-1; j++){
                if(array[j]>array[j+1]){
                    int elementfirst = array[j]; // Store the current element in a temporary variable
                    array[j] = array[j+1];  // Assign the next element to the current position
                    array[j+1] = elementfirst; // Assign the stored element to the next position
                }
            }
        }
        System.out.println();
        System.out.println("after sorting: ");
        for(int k=0; k<n; k++){
            System.out.print(array[k]+" ");
        }
    }
}