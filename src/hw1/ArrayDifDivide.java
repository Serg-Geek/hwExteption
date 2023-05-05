package hw1;

public class ArrayDifDivide {

    public static int[] diffArrays(int[] arrA, int[] arrB) {
        if (arrA.length != arrB.length) {
            System.out.println("Длины массивов не равны!");
            return null;
        }

        int[] result = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++) {
            result[i] = arrA[i] - arrB[i];
        }

        return result;
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] / arr2[i];
        }
        return result;
    }



}

