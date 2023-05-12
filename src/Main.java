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
        System.out.println("Задача 4");
        int first4 = 3;
        int second4 = 56;
        composeStrings(first4, second4);
        System.out.println();

        // Задача 5.вызов метода
        System.out.println("Задача 5");
        String strFifth = "3 + 56 = 59";
        replaceEqual(strFifth);

        // Задача 6.вызов метода
        System.out.println("Задача 6");
        String strSixth = "3 + 56 = 59";
        System.out.println(replaceEqual2(strSixth));

        // Задача 7.вызов метода
        System.out.println("Задача 7");
        String strSeventh = fillStr();
        long start = System.currentTimeMillis();
        replaceEqual2(strSeventh);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        replaceEqStr(strSeventh);
        System.out.println(System.currentTimeMillis()-start);
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
// Задача 4. Метод
    static void composeStrings(int n1, int n2){
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();
        StringBuilder res3 = new StringBuilder();

        res1.append(n1);
        res1.append(" + ");
        res1.append(n2);
        res1.append(" = ");
        res1.append(n1 + n2);

        res2.append(n1);
        res2.append(" - ");
        res2.append(n2);
        res2.append(" = ");
        res2.append(n1 - n2);

        res3.append(n1);
        res3.append(" * ");
        res3.append(n2);
        res3.append(" = ");
        res3.append(n1 * n2);

        System.out.println(res1.toString());
        System.out.println(res2.toString());
        System.out.println(res3.toString());
    }
// Задача 5. Метод
    static void replaceEqual(String x) {
        StringBuilder sb = new StringBuilder(x);
        int eq = sb.indexOf("=");
        sb.deleteCharAt(eq);
        sb.insert(eq,"равно");
        System.out.println(sb.toString());
    }
// Задача 6. Метод
     static String replaceEqual2(String x) {
        StringBuilder sb = new StringBuilder(x);
        int eq = sb.indexOf("=");
        sb.replace(eq,eq+1,"равно");
        return sb.toString();
        }
// Задача 7. Метод
     static String fillStr(){
        String str = "";
         for (int i = 0; i <= 10000 ; i++) {
             str += " = ";
         }
        return str;
     }
     static String replaceEqStr(String x){
        x.replace("=", "равно");
        return x;
     }
}