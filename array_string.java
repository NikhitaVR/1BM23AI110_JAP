import java.util.*;

public class array_string {

    public static int compare_string(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static Boolean equals_string(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String concatenate_string(String str1, String str2) {
        return str1 + str2;
    }

    public static String copy_string(String str1) {
        String str2 = new String(str1);
        return str2;
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println("String one is : " + str1);
        System.out.println("String two is : " + str2);
        System.out.println("Comparision of String : " + compare_string(str1, str2));
        System.out.println("Checking if the strings are equal : " + equals_string(str1, str2));
        System.out.println("String we are concatenating is world");
        System.out.println("The final string after concatenating both the strings : " +concatenate_string(str1, "world"));
        System.out.println("The copied string : " +copy_string("bye"));
    }
}
