public class Tester {
    public static void main(String[] args) {
        //tests for sum function 
        int[]arr1 = new int[]{10,10,10,10,10}; 
        int[]arr2 = new int[]{5,10,5}; 
        int[]arr3 = new int[]{10}; 
        int[]arr4 = new int[]{};
        System.out.println("Sum function: {10,10,10,10,10} --> 50 | " + ArrayOps.sum(arr1) );
        System.out.println("Sum function: {5,10,5} --> 20 | " + ArrayOps.sum(arr2) );
        System.out.println("Sum function: {10} --> 10 | " + ArrayOps.sum(arr3) );
        System.out.println("Sum function: {} --> 0 | " + ArrayOps.sum(arr4));
    }

}
