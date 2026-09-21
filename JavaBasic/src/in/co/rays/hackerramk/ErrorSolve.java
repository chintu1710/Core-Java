package in.co.rays.hackerramk;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErrorSolve {

    public static void main(String[] args) {

        // Case-sensitive regex (no CASE_INSENSITIVE flag)
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Agar repeat word mila to turant replace karo
            while (m.find()) {
                input = input.replaceAll(regex, m.group(1));
            }

            // Direct print
            System.out.println(input);
        }

        in.close();
    }
}
