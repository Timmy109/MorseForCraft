package tim.lol.blockchange.commands;

public class MorseClass {

    public static String encode(char toEncode)
    {

        char toEncode_caps = Character.toLowerCase(toEncode);

        String morse = "";
        switch (toEncode_caps) {
            case 'a':
                morse = ".-";
                break;
            case 'b':
                morse = "-...";
                break;
            case 'c':
                morse = "-.-.";
                break;
            case 'd':
                morse = "-..";
                break;
            case 'e':
                morse = ".";
                break;
            case 'f':
                morse = "..-.";
                break;
            case 'g':
                morse = "--.";
                break;
            case 'h':
                morse = "....";
                break;
            case 'i':
                morse = "..";
                break;
            case 'j':
                morse = ".---";
                break;
            case 'k':
                morse = "-.-";
                break;
            case 'l':
                morse = ".-..";
                break;
            case 'm':
                morse = "--";
                break;
            case 'n':
                morse = "-.";
                break;
            case 'o':
                morse = "---";
                break;
            case 'p':
                morse = ".--.";
                break;
            case 'q':
                morse = "--.-";
                break;
            case 'r':
                morse = ".-.";
                break;
            case 's':
                morse = "...";
                break;
            case 't':
                morse = "-";
                break;
            case 'u':
                morse = "..-";
                break;
            case 'v':
                morse = "...-";
                break;
            case 'w':
                morse = ".--";
                break;
            case 'x':
                morse = "-..-";
                break;
            case 'y':
                morse = "-.--";
                break;
            case 'z':
                morse = "--..";
                break;
            case '0':
                morse = "-----";
                break;
            case '1':
                morse = ".----";
                break;
            case '2':
                morse = "..---";
                break;
            case '3':
                morse = "...--";
                break;
            case '4':
                morse = "....-";
                break;
            case '5':
                morse = ".....";
                break;
            case '6':
                morse = "-....";
                break;
            case '7':
                morse = "--...";
                break;
            case '8':
                morse = "---..";
                break;
            case '9':
                morse = "----.";
                break;
            case '.':
                morse = ".-.-";
                break;
            case ',':
                morse = "--..--";
                break;
            case '?':
                morse = "..--..";
                break;
            case ' ':
                morse = "*";
                break;
            default:
                break;
        }
        return morse;
    }


    public static String toMorse(String message){
        char[] ch = new char[message.length()];
        for (int i = 0; i < message.length(); i++){
            ch[i] = message.charAt(i);
        }
        String morse = "";
        for (char letter : ch) {
            morse = morse.concat(encode(letter));
            morse = morse.concat(" ");
        }
        return morse;
    }

    public static void main(String args[]){

        System.out.println(toMorse("Yo mum is faaaat"));

    }
}
