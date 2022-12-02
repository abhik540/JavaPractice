package CodeSignal;

public class FindEmailDomain {

    String solution(String address) {
        String[] email = address.split("@");
        return email[email.length - 1];

    }

}
