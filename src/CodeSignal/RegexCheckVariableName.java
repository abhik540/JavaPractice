package CodeSignal;

public class RegexCheckVariableName {

    static boolean solution(String name) {
        if (Character.isDigit(name.charAt(0))) {
            return false;
        }
        return name.matches("^[a-zA-Z0-9_]*$");
    }
}
