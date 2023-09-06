import Linked_List.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    /*
    Задача №1
    Запрос к БД:
    SELECT MAX(surname) FROM greenatom.workers
    WHERE surname < (SELECT MAX(surname) FROM greenatom.workers);
     */


    // Задача №2
    // Реализация № 1
    // Метод, меняющий две целочисленные переменные местами не используя третьей.
    public static void XORSwap(int a, int b){
        System.out.println("a = " + a + " b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("a = " + a + " b = " + b);
    }

    // Задача №2
    // Реализация № 2
    // Метод, меняющий две целочисленные переменные местами не используя третьей.
    public static void SwapInteger(int a, int b){
        System.out.println("a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }

    // Задача №3.1
    // Реализация связного списка, а также метод, инвертирующий его, находится в папке LinkedList

    // Задача №3.2
    // Метод, проверяющий строку на палиндром.
    public static boolean IsPalindrome(String str){
        String formattedStr = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = formattedStr.length() - 1;
        while ( right > left){
            if (formattedStr.charAt(left) != formattedStr.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        XORSwap(4,5);

        SwapInteger(4,5);

        System.out.println(IsPalindrome("ta$r$at"));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.Add(1);
        linkedList.Add(2);
        linkedList.Add(3);
        linkedList.Print();
        linkedList.Reverse();
        linkedList.Print();
    }
}