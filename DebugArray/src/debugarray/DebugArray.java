/*
 * Phillip Viau
 * 01/27/2016
 * Gets min and max of user input
 */
package debugarray;
import java.util.Scanner;
/**
 *
 * @author phillip389
 */
public class DebugArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {10,9,8};
        int max = 0, min = 0;
        
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.print("Please enter number " + (i+1) + ": > ");
            array[i] = input.nextInt();
            if(i == array.length-1){
                
            }
        }
        max = getMax(array);
        min = getMin(array);
        System.out.println("The max number is: " + max);
        System.out.println("The min number is: " + min);
    }
    
  // Method for getting the maximum value
  public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i = 1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
 
  // Method for getting the minimum value
  public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
    
}
