import java.lang.System;
import java.util.Scanner;
import java.util.ArrayList;

class bubblesort{
    public static void main(String args[]){
        
        System.out.print("Enter the input: ");
        Scanner scan = new Scanner(System.in);
        String inputs = scan.nextLine();

        String[] splitstring = inputs.split(" ");
        int n = splitstring.length;

        ArrayList<Integer> integerList = new ArrayList<>();

        for(int k=0; k<n; k++){
            int number = Integer.parseInt(splitstring[k]);
            integerList.add(number);
        }
        
        
        for (int i=0; i<n-1; i++){
            // Inner loop for comparing adjacent elements in the array
            for (int j=0; j<n-i-1; j++){
                if(integerList.get(j)>integerList.get(j+1)){
                    int elementfirst = integerList.get(j); // Store the current element in a temporary variable
                    integerList.set(j,integerList.get(j+1));  // Assign the next element to the current position
                    integerList.set(j+1,elementfirst); // Assign the stored element to the next position
                }
            }
        }
        
        System.out.print("after sorting: ");
        for(int k=0; k<n; k++){
            System.out.print(integerList.get(k)+" ");
        }
    }
}