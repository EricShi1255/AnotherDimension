import java.util.Arrays; //this is to help with printing!
public class Tester {
    public static void main(String[] args) {
        
        //tests for sum function 
        int[]arr1 = new int[]{10,10,10,10,10}; 
        int[]arr2 = new int[]{5,15,5,7,-2}; 
        int[]arr3 = new int[]{10}; 
        int[]arr4 = new int[]{};
        int[]arr5 = new int[]{-5,-4,-6};
        int[]arr6 = new int[]{-5, -4, -6, 10, 13, 100, -2};
        System.out.println("Sum(): {10,10,10,10,10} --> 50 | " + ArrayOps.sum(arr1) );
        System.out.println("Sum(): {5,15,5,7,-2} --> 30 | " + ArrayOps.sum(arr2) );
        System.out.println("Sum(): {10} --> 10 | " + ArrayOps.sum(arr3) );
        System.out.println("Sum(): {} --> 0 | " + ArrayOps.sum(arr4));

        System.out.println();

        //tests for largest function
        System.out.println("Largest(): {10,10,10,10,10} --> 10 | " + ArrayOps.largest(arr1) );
        System.out.println("Largest(): {5,15,5,7,-2} --> 15 | " + ArrayOps.largest(arr2) );
        System.out.println("Largest(): {10} --> 10 | " + ArrayOps.largest(arr3) );
        System.out.println("Largest(): {-5,-4,-6} --> -4 | " + ArrayOps.largest(arr5) );
        System.out.println("Largest(): {-5, -4, -6, 10, 13, 100, -2} --> 100 | " + ArrayOps.largest(arr6) );

        System.out.println();

        //tests for sumRows
        int[][] a = new int[][]{ {5,10}, {20,10}, {40,60} };
        int[][] b = new int[][]{ {5,10} };
        int[][] c = new int[][]{{}};
        System.out.println("SumRows(): {{5,10}{20,10}{40,60}} --> {15,30,100} | " + Arrays.toString( ArrayOps.sumRows(a) ) );
        System.out.println("SumRows(): {{5,10}} --> {15,30,100} | " + Arrays.toString( ArrayOps.sumRows(b) ) );  
        System.out.println("SumRows(): {{}} --> {} | " + Arrays.toString( ArrayOps.sumRows(c) ) );  

        System.out.println();

        //testsfor largestinrows
        System.out.println("LargestInRows(): {{5,10}{20,10}{40,60}} --> {10,20,60} | " + Arrays.toString( ArrayOps.largestInRows(a) ) );
        System.out.println("LargestInRows(): {{5,10}} --> {10} | " + Arrays.toString( ArrayOps.largestInRows(b) ) );
    }

}
