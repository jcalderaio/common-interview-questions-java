package Java;
import java.util.*;

class Scrambler {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a message to decrypt");
        String str = scan.nextLine();
        System.out.println("Please input a k value");
        int h = scan.nextInt();
        scramble(str, h);
    } 

    public static void scramble(String message, int k) {
        char ar[] = message.toCharArray();

        for (int i=0; i<ar.length; i++) {

            char chara = ar[i];

            if ( ((int)chara >= 65) && ((int)chara <= 90)) {
                if((int) chara + (k%26) > 90) {
                    int number = (int) ((chara-26) + (k%26));
                    char fin = (char) number;
                    ar[i] = fin;
                }

                else {
                    int number = (int) ((chara) + (k%26));
                    char fin = (char) number;
                    ar[i] = fin;
                }

                
            }

            if ( ((int)chara >= 97) && ((int)chara <= 122)) {
                if((int) chara + (k%26) > 122) {
                    int number = (int) ((chara-26) + (k%26));
                    char fin = (char) number;
                    ar[i] = fin;
                }

                else {
                    int number = (int) ((chara) + (k%26));
                    char fin = (char) number;
                    ar[i] = fin;
                }

                
            }
        }
        
        for(int i=0; i<ar.length; i++)  {
            System.out.print(ar[i]);
        }
    }
}