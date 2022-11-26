package CodeSignal;

import java.util.Stack;

public class ReverseChar {
    public static void main(String[] args) {

        //System.out.println(solutionFinal("foo(bar)baz(blim) "));
        // System.out.println(solutionFinal("foo(bar(baz))blim"));
        System.out.println(reverseParentheses("(bar)"));
    }

    static String solutionFinal(String inputString) {

        while (inputString.contains("(") && inputString.contains(")")) {
            int bracketCount = 0;
            Stack<Character> stack = new Stack<>();
            String outString = "";
            for (int i = 0; i < inputString.length(); i++) {
                if (inputString.charAt(i) == '(') {
                    stack.push(inputString.charAt(i));
                    bracketCount++;
                    continue;
                } else if (inputString.charAt(i) == ')') {
                    stack.push(inputString.charAt(i));
                    bracketCount--;
                    continue;
                }
                if (bracketCount > 0) {
                    stack.push(inputString.charAt(i));
                }
                if (stack.size() > 0 && bracketCount == 0) {
                    String out = "";
                    while (stack.size() > 0) {
                        Character pop = stack.pop();
                        if (pop == '(') {
                            out += ")";
                        } else if (pop == ')') {
                            out += "(";
                        } else {
                            out += pop;
                        }
                    }
                    outString += out.substring(1, out.length() - 1);
                }
                if (stack.size() == 0) {
                    outString += inputString.charAt(i);
                }
            }
            String out = "";
            while (stack.size() > 0) {
                Character pop = stack.pop();
                if (pop == '(') {
                    out += ")";
                } else if (pop == ')') {
                    out += "(";
                } else {
                    out += pop;
                }
            }
            outString += out.substring(1, out.length() - 1);
            inputString = outString;
        }
        return inputString;
    }

    static String reverseParentheses(String str) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {

            // Push the index of the current
            // opening bracket
            if (str.charAt(i) == '(') {
                st.push(i);
            }

            // Reverse the substring starting
            // after the last encountered opening
            // bracket till the current character
            else if (str.charAt(i) == ')') {
                char[] A = str.toCharArray();
                reverse(A, st.peek() + 1, i);
                str = String.copyValueOf(A);
                st.pop();
            }
        }

        // To store the modified string
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')' && str.charAt(i) != '(') {
                res += (str.charAt(i));
            }
        }
        return res;
    }


    static void reverse(char A[], int l, int h) {
        if (l < h) {
            char ch = A[l];
            A[l] = A[h];
            A[h] = ch;
            reverse(A, l + 1, h - 1);
        }
    }

    static String solution(String inputString) {

        int i = 0;
        boolean startPush = false;
        boolean startPop = false;
        String outString = "";
        Stack<Character> stack = new Stack<>();
        while (inputString.contains("(")) {
            while (i < inputString.length()) {
                if (inputString.charAt(i) == '(') {
                    startPush = true;
                    startPop = false;
                } else if (inputString.charAt(i) == ')') {
                    startPush = false;
                    startPop = true;
                }
                if (startPush) {
                    stack.push(inputString.charAt(i));
                } else if (startPop) {
                    while (stack.size() > 0) {
                        outString += stack.pop();
                    }
                    if (stack.size() == 0) {
                        startPop = false;
                    }
                }
                if (!startPush && !startPop) {
                    outString += inputString.charAt(i);
                }
                i++;
            }
        }
        return outString.replace("(", "").replace(")", "");
    }
}
