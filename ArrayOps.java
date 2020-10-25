public class ArrayOps {

    public static int sum(int[] arr) {
//sum() takes an array of int, and returns a sum of the individual values in the array.
    if (arr.length == 0) {
        return 0;
    }
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];
    }
    return sum; 
}

public static  int largest(int[]arr) {
    //largest() takes a non-empty array of int, and returns the largest element of the array
    int big = arr[0];
    for (int i = 0; i < arr.length;i++) {
        if (arr[i] > big) {
            big = arr[i];
        }
    }
    return big; 
}

public static int[] sumRows(int[][] matrix) {
    //sumRows() takes a 2D array of int, and returns a 1D array of int with each element being the sum of the individual rows of the 2D array.
    int[] result = new int[matrix.length]; 
    for (int i = 0; i < matrix.length; i++) { 
        result[i] = sum(matrix[i]);
    }
    return(result);
}
/*
public static  int[] largestInRows(int[][] matrix) {
    
}
public static  int sum(int[][] arr) {
 
}
*/


}
