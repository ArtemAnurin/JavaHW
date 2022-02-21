/**
* Java 1. Home Work #2
*
* @author Artem Anurin
* @version 21.02.2022
*/
import java.util.Arrays;
import java.util.Random;

class HomeWork3 {
    
    static Random random = new Random();
    
   public static void main(String[] args) {
      //..1 
       int[] arr1 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
       System.out.println(Arrays.toString(arr1));
       System.out.println(Arrays.toString(arrFirst(arr1)));
       
      //..2 
       int[] arrTwo = createAndFillArray(100, false, 1);
       System.out.println(Arrays.toString(arrTwo));
       
      //..3 
       int[] arrNum = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrNum));
        arrThree(arrNum);
        System.out.println(Arrays.toString(arrNum));
        
      //..4  
        createSquareArray(3);
        
        
      //..5  
        System.out.println();

       
       
        
   }
   
   //..1
   static int[] arrFirst(int[] array){
        for(int i = 0; i < array.length; i++) {
            array[i] = (array[i] == 0)? 1 : 0;
        }
        return array;
    }
    
    //..2
    static int[] createAndFillArray(int length, boolean rnd, int value) {
        int[] arr = new int[length];
        for(int i = 0; i < arr.length; i++) {
            if (rnd) {
                arr[i] = random.nextInt(value);
            } else {
                arr[i] = i + value;
            }
        }
        return arr;
    }
    
    //..3
    static void arrThree(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] < 6){
                array[i] *= 2;
            }
        }
    }
    
    
    //..4
    static void createSquareArray(int size){
        int[][] sqrArray = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                sqrArray[i][j] = (i == j || j == (size - i - 1))? 1 : (int)(Math.random()*100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
            System.out.println();
        }
    }
    
    
    //..5
    static int[] arrFive (int len, int initialValue) {
    int arr[] = new int[len];
    for (int i = 0; i < arr.length; i++){
        arr[i] = initialValue;
    }
    return arr;
    }
    
    
}

