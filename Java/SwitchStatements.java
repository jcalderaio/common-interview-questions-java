package Java;
public class SwitchStatements
{

    public SwitchStatements() {
    }

    public void SwitchStatments(char letter) {

        switch (letter) {
            case 'Y': System.out.println("Yes");
            break;
            case 'y': System.out.println("Yes");
            break;
            case 'N':
            case 'n': System.out.println("No");
            break;
            default: System.out.println("Enter y or n");

        }
    }

    public void ifStatement(int score) {

        switch (score) {
            case 100: 
            case 99:
            //...case 90: System.out.println(:No");
            break;
            case 80: //...
        }

        switch (score/10) {
            case 10:
            case 9: System.out.println("A");
            break;
            case 8: System.out.println("B");
            break;
            case 7: System.out.println("C");
            break;
            case 6: System.out.println("D");
            break;   
            default: System.out.println("E");

        }
    }

    public void Switch(char grade) {

        switch(grade) {
            case 'A':
            case 'B':
            case 'C':  System.out.println("PASS");
            break;
            case 'D':
            case 'F':  System.out.println("FAIL");
            break;
            default:   System.out.println("Invalid");
        }
    }

}
