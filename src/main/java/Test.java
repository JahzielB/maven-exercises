import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: \"" + userInput + "\"");
        if (!StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\"" + " is not a number");
        } else if (StringUtils.isNumeric(userInput)) {
            System.out.println("\"" + userInput + "\"" + " is a number");
        }
        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
