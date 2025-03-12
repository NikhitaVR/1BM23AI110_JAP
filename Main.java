import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age, duration, fee, i;
        String name;
        for(i = 0; i < 3; i++) {
            System.out.println("Enter the name of the person ");
            name = in.nextLine();  // Read the name of the person
            System.out.println("Enter the age of the person ");
            age = in.nextInt();  // Read age
            in.nextLine();  // Consume the leftover newline character

            System.out.println("Enter the duration of the gym membership in number of months ");
            duration = in.nextInt();  // Read duration
            in.nextLine();  // Consume the leftover newline character

            System.out.println("Enter the status of the gym ");
            Boolean status = in.nextBoolean();  // Read status
            in.nextLine();  // Consume the leftover newline character

            System.out.println("A standard fee of 500 is mandatory plus an additional 200 is added for each month ");
            fee = 500 + 200 * duration;  // Calculate the fee
            System.out.println("The total membership fee is: " + fee);
        }
    }
}

//OUTPUT :
// "C:\Program Files\Java\jdk-18.0.1.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4\lib\idea_rt.jar=53265" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\Admin\IdeaProjects\JAVA_LAB\out\production\JAVA_LAB Main
//Enter the name of the person
//q
//Enter the age of the person
//19
//Enter the duration of the gym membership in number of months
//2
//Enter the status of the gym
//true
//A standard fee of 500 is mandatory plus an additional 200 is added for each month
//The total membership fee is: 900
//Enter the name of the person
//w
//Enter the age of the person
//20
//Enter the duration of the gym membership in number of months
//4
//Enter the status of the gym
//true
//A standard fee of 500 is mandatory plus an additional 200 is added for each month
//The total membership fee is: 1300
//Enter the name of the person
//e
//Enter the age of the person
//22
//Enter the duration of the gym membership in number of months
//3
//Enter the status of the gym
//true
//A standard fee of 500 is mandatory plus an additional 200 is added for each month
//The total membership fee is: 1100
//
//Process finished with exit code 0