import java.util.Scanner;

public class VowelOrConsonant {
    public static String defineLetter(char letter) {

        String msg = "This is not letter";

        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u', 'y':
                msg = "Your letter is vowel";
                break;
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                    'q', 'r', 's', 't', 'v', 'w', 'x', 'z':
                msg = "Your letter is consonant";

        }
        return msg + "";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please, input your letter\n");
        char letter = scanner.next().charAt(0);

        String result = defineLetter(letter);

        System.out.println(result);
        scanner.close();
    }
}


