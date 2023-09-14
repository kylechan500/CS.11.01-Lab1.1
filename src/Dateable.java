import java.util.Scanner;

public class Dateable {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
System.out.println("Please enter your age:");
int UserAge = scanner.nextInt();
int DataAge = (7 +(UserAge/2));
System.out.println(UserAge + "-year olds should date someone who is at least " + DataAge + "-years old");



    }
}
