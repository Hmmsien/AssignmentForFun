package Strings;

import java.util.stream.Collectors;

public class BasicStrings {

    public String flipConcat(String string1, String string2) {
        return string2.concat(string1);
    }

    public char getChar(String string, int index) {
        return string.charAt(index);
    }

    public String iCantSee(String string) {
        if(string == null) {
            return null;
        }

        int n = string.length();
        final StringBuilder sb = new StringBuilder(string.length());
        for(int i = 0; i < n; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public String loudAndClear(String string) {
        return string.toUpperCase();
    }

    public String reverseCase(String string) {
        return string.chars().mapToObj(c -> {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
            }
            return String.valueOf((char)c);
        }).collect(Collectors.joining());
    }

    public String oneAtATime(String string1, String string2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < string1.length() || i < string2.length(); i++) {
            if (i < string1.length())
                result.append(string1.charAt(i));

            if (i < string2.length())
                result.append(string2.charAt(i));
        }

        return result.toString();
    }
}
