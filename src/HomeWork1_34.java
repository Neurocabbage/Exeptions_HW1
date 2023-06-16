// 3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
//4. * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,
// т.е. ваше.
import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork1_34 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {3, 1, 2, 3, 4, 3, 2, 1, 3};
        System.out.println("Первый массив " + Arrays.toString(array1));
        System.out.println("Второй массив " + Arrays.toString(array2));
        System.out.println("Разница двух массив " + differenceArray(array1, array2));
        System.out.println("Частное двух массивов " + divideArray(array1, array2));
    }

    public static ArrayList<Integer> differenceArray(int[] arr1, int [] arr2) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Math.min (arr1.length, arr2.length);
        int max = Math.max(arr1.length, arr2.length);
        if (min<1){
            throw new RuntimeException ("Один из массив пуст");
        }
        if (min<max) {
            throw new RuntimeException ("Длины массивов не равны");
        }
        for (int i =0; i<min; i++){
            res.add(arr1[i]-arr2[i]);
        }
        return res;
    }

    public static ArrayList<Float> divideArray(int[] arr1, int[] arr2){
        ArrayList<Float> res = new ArrayList<>();
        int min = Math.min(arr1.length, arr2.length);
        int max = Math.max(arr1.length, arr2.length);
        if (min<1){
            throw new RuntimeException ("Один из массив пуст");
        }
        if (min < max){
            throw new RuntimeException ("Длины массивов не равны");
        }
        for (int i=0; i<min;i++){
            if (arr2[i] != 0){
                res.add((float) (arr1[i] / arr2[i]));
            } else {
                throw new RuntimeException("Деление на ноль невозможно");
            }
        }
        return res;
    }
}