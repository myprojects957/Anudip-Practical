public class PhoneWordConverter {

    public static void main(String[] args) {
        String input = "800888TEST";
        String numericPhone = convertToPhoneNumber(input);
        System.out.println(numericPhone); 
    }

    public static String convertToPhoneNumber(String phoneword) {
        String[] keypad = {
            "ABC", "DEF",    
            "GHI", "JKL",    
            "MNO", "PQRS",   
            "TUV", "WXYZ"    
        };

        StringBuilder numeric = new StringBuilder();

        for (char c : phoneword.toUpperCase().toCharArray()) {
            if (Character.isDigit(c)) {
                numeric.append(c);
            } else if (Character.isLetter(c)) {
                for (int i = 0; i < keypad.length; i++) {
                     if (keypad[i].indexOf(c) != -1) {
                        numeric.append(i + 2);
                        break;
                     }
                 }
             }
         }
        if (numeric.length() == 10) {
            return String.format("(%s) %s-%s",
                numeric.substring(0, 3),
                numeric.substring(3, 6),
                numeric.substring(6, 10)
            );
        } else {
            return "Invalid phoneword length.";
        }
    }
}
