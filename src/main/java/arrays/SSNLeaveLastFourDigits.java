package arrays;

// Input: String SSN = "1231234040";
// Output: ******4040 or ***-***-4040

public class SSNLeaveLastFourDigits {

    public static void main(String[] args) {
        String SSN = "1231234040";
        if (SSN.length() < 4) {
            System.out.println(SSN);
        } else {
            String result = "";
            for (int i = 0; i < SSN.length(); i++) {
                if (i >= 4) {
                    result = result + "#";
                }
            }
            result = result + SSN.substring(SSN.length() - 4);
            System.out.println(result);
        }
    }

}

