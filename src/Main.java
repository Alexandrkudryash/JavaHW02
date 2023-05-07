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
        System.out.println("Задача 2");
        String string2First ="boolean";
        String string2Second ="naeloob";
        checkRotationStrings(string2First, string2Second);
        String string2Third ="openspace";
        String string2Fourth ="spaceopen";
        checkRotationStrings(string2Third, string2Fourth);


        // Задача 3.вызов метода
        System.out.println("Задача 3");
        StringBuilder sb3 = new StringBuilder("я пишу письмо ласипан ежу омьсип я");
        recurseRevers(sb3);
        System.out.println();

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
    static void checkRotationStrings(String s1, String s2){
        StringBuilder sTemp = new StringBuilder();
        for (int i = s1.length()-1; i >=0; i--) {
            sTemp.append(s1.charAt(i));
        }
        System.out.println(sTemp);
        System.out.println(s2.compareTo(sTemp.toString())==0);
        }
// Задача 3. Метод.
    static StringBuilder recurseRevers(StringBuilder sb){
        System.out.print(sb.charAt(sb.length()-1));
        if (sb.length()== 1) {
           return sb;
        }
        return recurseRevers(sb.deleteCharAt(sb.length()-1));

         }

}