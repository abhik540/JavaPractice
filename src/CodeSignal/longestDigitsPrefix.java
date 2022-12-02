package CodeSignal;

public class longestDigitsPrefix {

    String solution(String inputString) {

        String out = "";
        for(int i=0;i<inputString.length();i++) {
            if(Character.isDigit(inputString.charAt(i))){
                out += inputString.charAt(i);
            } else {
                return out;
            }
        }
        return out;

    }
}
