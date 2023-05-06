/*
Домашнее задание 2, предмет - знакомство с языком программирования Java
Задача 1.Напишите программу, чтобы найти наименьшее окно в строке, содержащей все символы другой строки
Задача 2.Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
Задача 3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
Задача 4.Дано два числа, например 3 и 56, необходимо составить следующие
         строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
Задача 5.Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),
         StringBuilder.deleteCharAt().
Задача 6.*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
Задача 7.**Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

*/


import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        // Задача 1.вызов метода.
        System.out.println("Задача 1");
        String string1First = "find the minimum window in the string";
        String string1Second = "window";
        searchStr(string1First,string1Second);

        // Задача 2.вызов метода

        // Задача 3.вызов метода
        // Задача 4.вызов метода
        // Задача 5.вызов метода
        // Задача 6.вызов метода
        // Задача 7.вызов метода
    }

// Задача 1. Метод.
    static void searchStr(String s1, String s2){
        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");
        String[] arr3 = new String[arr1.length < arr2.length ? arr1.length : arr2.length];

        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].compareTo(arr2[j]) == 0){
                    arr3[count++] = arr1[i];
                }
            }
        }
        System.out.println(Arrays.toString(arr3));
    }
// Задача 2. Метод.



}