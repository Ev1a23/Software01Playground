import java.util.stream.Stream;

public class Q8 {
    public static int[] modifyArray(int[] arr)
    {
        arr[0] = 9;
        return arr;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println((arr1==arr2)+" ");
        int[] arr3 = modifyArray(arr1);
        System.out.println((arr1[0]==arr2[0])+" ");
        System.out.println(arr1==arr3);
    }
}
