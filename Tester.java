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
        System.out.println("SumRows(): {{}} --> {0} | " + Arrays.toString( ArrayOps.sumRows(c) ) );  

        System.out.println();

        //testsfor largestinrows
        System.out.println("LargestInRows(): {{5,10}{20,10}{40,60}} --> {10,20,60} | " + Arrays.toString( ArrayOps.largestInRows(a) ) );
        System.out.println("LargestInRows(): {{5,10}} --> {10} | " + Arrays.toString( ArrayOps.largestInRows(b) ) );

        System.out.println();
        
        //testsforsum(2d arrays)
        System.out.println("sum(): {{5,10}{20,10}{40,60}} --> {145} | " + ArrayOps.sum(a) );
        System.out.println("sum(): {5,10} --> {15} | " + ArrayOps.sum(b) );
        System.out.println("sum(): {{}} --> 0 | " + ArrayOps.sum(c) );

        System.out.println();

        //testsforsumCols
        int[][]  A = { {  1,  0, 12, -1 }, {  7, -2,  2,  1 }, { -5, -2,  2, -9 } };
        System.out.println("sumCols(): {{1,0,12,-1}, {7,-2,2,1}, {-5,-2,2,-9}} --> [3, -4, 16, -9] | " +  Arrays.toString(ArrayOps.sumCols(A)) );

        System.out.println();

        //testsfor magics
        int[][] magica = { {  1,  2, 3, 4 },
        {  2, 3,  4,  1 },
        { 3, 4,  1, 2 } };  //this is rowMagic but NOT colMagic
        int[][] magicb = { {  1,  1, 1 },
        {  2, 2, 2 },
        { 3,  3, 3 } };  //this is colMagic but NOT rowMagic
        int[][] magicc = { {  2,  2, 2 },
        {  2, 2, 2 } };  //this is both colMagic AND rowMagic
        System.out.println("isRowMagic(): { {1,2,3,4},{2,3,4,1},{3,4,1,2} } --> true | " + ArrayOps.isRowMagic(magica));
        System.out.println("isRowMagic(): { {1,1,1},{2,2,2},{3,3,3} } --> false | " + ArrayOps.isRowMagic(magicb));
        System.out.println("isRowMagic(): { {2,2,2}, {2,2,2} } --> true | " + ArrayOps.isRowMagic(magicc));

        System.out.println();

        System.out.println("isColMagic(): { {1,2,3,4},{2,3,4,1},{3,4,1,2} } --> false | " + ArrayOps.isColMagic(magica));
        System.out.println("isColMagic(): { {1,1,1},{2,2,2},{3,3,3} } --> true | " + ArrayOps.isColMagic(magicb));
        System.out.println("isColMagic(): { {2,2,2}, {2,2,2} } --> true | " + ArrayOps.isColMagic(magicc));

        System.out.println();

        //testing final one
        int[][]E = { 
            {  2,  4, 2 }, 
            {  2, 2, 2 } };
        System.out.println("isLocationMagic(E, 0, 1) --> False | " + ArrayOps.isLocationMagic(E, 0, 1));
        System.out.println("isLocationMagic(E, 1, 1) --> True | " + ArrayOps.isLocationMagic(E, 1, 1));

        
    }
}
