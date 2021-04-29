package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {

        if (input.equals("") || input.equals(null)) {
            return -1;
        }
        int sumDigits = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                int x = Integer.parseInt(String.valueOf(c));
                sumDigits = sumDigits + x;
            }
        }
        return sumDigits;
    }
}


