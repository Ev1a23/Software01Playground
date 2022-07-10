package AA2021;

public class Q01 {
    public static void replaceArr(int[] arr1, int[] arr2) {
        arr1[0] = 10;
        arr2 = arr1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] arr3 = {1,2,3};
        int[] arr4 = arr2;
        boolean b1 = arr1 == arr3;
        replaceArr(arr1, arr2);
        boolean b2 = arr1[0] == arr3[0];
        boolean b3 = arr2 == arr4;
        System.out.print(b1 + " " + b2 + " " + b3);
    }


}
