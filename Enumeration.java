import java.util.Scanner;

public class Enumeration {

    public enum DayOfWeek{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public Boolean isWorkDay(){
            return (this !=SATURDAY && this != SUNDAY);

        }
    }

    public static void main(String[] args){

        System.out.println("is monday a workday : "+DayOfWeek.MONDAY.isWorkDay());
        System.out.println("is sunday a workday : "+DayOfWeek.SUNDAY.isWorkDay());
    }


}
