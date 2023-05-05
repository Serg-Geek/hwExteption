//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
//        каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
//        Если длины массивов не равны, необходимо как-то оповестить пользователя.
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//        и возвращающий новый массив, каждый элемент которого равен частному элементов
//        двух входящих массивов в той же ячейке. Если длины массивов не равны,
//        необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
//        которое пользователь может увидеть - RuntimeException, т.е. ваше.

package hw1;

import java.util.Arrays;

import static hw1.ArrayDifDivide.diffArrays;
import static hw1.ArrayDifDivide.divideArrays;

public class Main {


    public static void main(String[] args) {
            int[] arr1 = {10, 2, 3};
            int[] arr2 = {4, 5, 6};

            int[] result = diffArrays(arr1, arr2);

            if (result != null) {
                System.out.println("Результат вычитания массивов:");
                for (int i = 0; i < result.length; i++) {
                    System.out.print(result[i] + " ");
                }
                System.out.println();


            }


            try {
                int[] res = divideArrays(arr1, arr2);
                System.out.println(Arrays.toString(res));
        }   catch (RuntimeException e) {
                System.out.println(e.getMessage());
        }
        }
    }

