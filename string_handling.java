import java.util.*;
public class string_handling {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        System.out.println("The capacity of string is "+str.capacity());
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string to be reversed :");
        String revstr = in.nextLine();
        StringBuffer str1 = new StringBuffer(revstr);
        System.out.println("String after reversing is : "+ str1.reverse());
        String revupper = revstr.toString().toUpperCase();
        System.out.println("String after reversing and converting to uppercase is : "+ revupper);
        System.out.println("Enter the string to be appended :");
        String appstr = in.nextLine();
        StringBuffer str2 = new StringBuffer(appstr);
        System.out.println("String after reversing is : "+ str1.append(str2));




    }

}
