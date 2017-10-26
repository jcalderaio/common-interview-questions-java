package Java;
import java.util.*;

class TryCatch {
    static boolean g = true;
    
    public static void main(String args[]) {
    	boolean flag = true;
        Scanner scanner  = new Scanner(System.in);
        int i;
        
        while(flag) {

        	System.out.println("Please enter an integer value");
        //"123"
        //"123.45 => NumberFormatException

        try{

            i = Integer.parseInt(scanner.nextLine());
        }

        catch (Exception e) {
        	flag = false;
            System.out.println("NOT an integer value");
        }

        try {
            //circle.getRadius();
        }
        catch(NullPointerException npe) {
            //circle = new Circle();
        }
        }
    }
    }
