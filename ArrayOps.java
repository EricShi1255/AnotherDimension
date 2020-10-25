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

public static  int[] largestInRows(int[][] matrix) {
    //largestInRows() takes a nonempty 2D array of int, the inner arrays cannot be empty either, 
    // returns a 1D array of int with each element being the largest element of the individual rows  of the 2D array.   
    int[] result = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
        result[i] = largest(matrix[i]);
    }
    return(result);
}

public static  int sum(int[][] arr) {
    //sum() takes a 2D array of int, and returns the sum of all the individual values in all of the arrays.
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
        total += sum(arr[i]);
    }
    return(total); 
}

public static int[] sumCols(int[][] matrix) {
    //sumCols takes a 2D array that must be rectangular (all rows have the same length)
    //returns a 1D array of int with each element being the sum of the individual columns of the 2D array.
    //array_name.length --> row
    //array_name[0].length --> col
    int[] arr = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
        int sumcol = 0;
        for (int j = 0; j < matrix.length; j++) {
            sumcol += matrix[j][i];
        }
        arr[i] = sumcol;
    }
    return(arr);
}

public static boolean isRowMagic(int[][] matrix) {
    //isRowMagic() takes a rectangular 2d array and returns true when each row has the same sum, and false otherwise
    int[] arr = sumRows(matrix);
    int first = arr[0];
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] != first) {
            return false;
        }
    }
    return true;
}


}
