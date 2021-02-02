import java.util.Scanner;

public class Average {


    public static void main(String[] args) {
        int total = 0;
        int counter = 1;
        int average;

        while(counter <= 10) {
            System.out.println("enter the next grade");
            Scanner scanner = new Scanner(System.in);
            int grade = scanner.nextInt();

            total = total + grade;
            counter++;


        }
        average = total/10;
        System.out.println(average);
    }

}
