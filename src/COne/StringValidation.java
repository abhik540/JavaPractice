package COne;


import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

// er3?asdf??7asdf -> true
// asdf2?asdf??4?asdf -> false
// asdf34??2asdf -> false
// er4?asdf?asdf?6???asdf9 -> false
// er4?asdf?asdf?6???asdf4 -> true
public class StringValidation {

    static boolean isValid(String input) {

        String inputString = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i)) || input.charAt(i) == '?') {
                inputString = inputString + (input.charAt(i));
            }
        }
        inputString = inputString.replace("???", "+");

        System.out.print(inputString + ":");
        if (!inputString.contains("+") || inputString.contains("?") || inputString.length() < 3) {
            return false;
        }
        if (inputString.charAt(0) == '+' || inputString.charAt(inputString.length() - 1) == '+') {
            return false;
        }
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '+' && i != 0 && i != inputString.length() - 1) {
                if (Integer.parseInt(inputString.charAt(i - 1) + "") + Integer.parseInt(inputString.charAt(i + 1) + "") != 10) {
                    return false;
                }
            }
        }

        //  System.out.println(inputString);
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("?asdf??7asdf")); // false
        System.out.println(isValid("e33?asdf??")); // false
        System.out.println(isValid("e33?asdf??7asdf")); // true
        System.out.println(isValid("er3?asdf??7asdf")); // true
        System.out.println(isValid("asdf2?asdf??4?asdf"));// false
        System.out.println(isValid("asdf34??2asdf")); // false
        System.out.println(isValid("er4?asdf?asdf?6???asdf9")); // false
        System.out.println(isValid("er4?asdf?asdf?6???asdf4???asdfasdfasdfasdfasdfasdf6")); // true
        System.out.println(isValid("er4?asdf?asdf?6???asdf4")); // trye
    }
}
