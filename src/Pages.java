import java.util.Scanner;

public class Pages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int UserAge = scanner.nextInt();
        int DataAge = (100 - (UserAge));
        System.out.println(UserAge + "-year olds should should read at least " + DataAge + " pages before giving up on a book.");



    }
}
