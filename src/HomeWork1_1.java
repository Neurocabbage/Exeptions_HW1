//1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

import java.util.Scanner;
public class HomeWork1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите числитель a");
        double a = sc.nextDouble();
        System.out.println("Введите знаменатель b");
        double b = sc.nextDouble();
        int[] myArray = {75, 88, 95, 14, 27, 33};
        System.out.println("Введите индекс ячейки массива");
        int index = sc.nextInt();
        divide(a, b);
        findElementByIndex(myArray, index);
        System.out.println();
        String str = null;
        sizeOut(str);
        sc.close();
    }

    public static void divide(double a, double b) {
        if (b == 0){
            throw new ArithmeticException("Деление на ноль невозможно");
        }
        else {
            System.out.println("a/b = "+ a/b);
        }
    }

    private static void findElementByIndex(int[] myArray, int index) {
        if(index > myArray.length-1){
            throw new ArrayIndexOutOfBoundsException("Введенный индекс больше длины массива.");
        } else {
            System.out.print("Элемент с введенным индексом: " + myArray[index]);
        }
    }

    private static void sizeOut(String myString) {
        if (myString == null){
            throw new NullPointerException("Строка пустая");
        }
        else{
            System.out.print("Элемент с введенным индексом: " + myString.length());
        }
    }
}