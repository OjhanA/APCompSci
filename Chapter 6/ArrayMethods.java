public class ArrayMethods{
    public static void main(String[] args){
        System.out.print("\f");
        int[] [] ArrayTest = {{0,1,2,3,4,5},{1,2,3,4,5,6,},{2,3,4,5,6,7},{3,4,5,6,7,8}};
        print2DArray(ArrayTest);
    }

    public static void print2DArray(int[][] array){
        for (int[] a : array){
            for (int b : a)
                System.out.print ("[" + b + "]");
            System.out.println();
        }
    }
}

