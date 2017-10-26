/**
 * This program simulates a traffic light using superclasses and inheritance. 
 * 
 * @John Calderaio 
 * 10/21/13
 */

package Java;
import java.util.*;

public class Polymorphism2 {
    
    
    public static void main(String args[]) {
        
        TrafficLight traffic = new TrafficLight();
        RailroadCrossingLight rail = new RailroadCrossingLight();
        
        
        Scanner scan = new Scanner(System.in);
        int input = 0;

        while(input != 5) {
            System.out.println();
            System.out.println("1. Change light");
            System.out.println("2. Get light color");
            System.out.println("3. Change flashing");
            System.out.println("4. Get flashing status");
            System.out.println("5. Quit");
            input = scan.nextInt();

            if(input == 1) {
                traffic.change();
            }
            else if(input == 2) {
                System.out.print(traffic.getSuperColor());
                System.out.println();
            }
            else if(input == 3) {
                rail.changeFlashing();
            }
            else if(input == 4) {
                System.out.print(rail.getFlashing());
                System.out.println();
            }
            
        }
    }
}

class Light {
    protected String color;

    public Light() {
        color = "red";
    }

    public void changeToRed() {
        this.color = "red";
    }

    public void changeToGreen() {
        this.color = "green";
    }

    public void changeToYellow() {
        this.color = "yellow";
    }

    public String getColor() {
        return color;
    }
}
class TrafficLight extends Light {
    public TrafficLight() {
        super();
    }

    public void change() {
        if(super.getColor().equals("red")) {
            super.changeToGreen();

        }
        else if(super.getColor().equals("green")) {
            super.changeToYellow();

        }
        else if(super.getColor().equals("yellow")) {
            super.changeToRed();

        }
    }
    
    public String getSuperColor() {
        return super.getColor();
    }
}
class RailroadCrossingLight extends Light {
    private String flashing;

    public RailroadCrossingLight() {
        super();
        flashing = "flashing red";
    }

    public void changeFlashing() {
        if(flashing == "flashing red") {
            flashing = "off";
        }
        else if(flashing == "off") {
            flashing = "flashing red";
        }

    }
    
    public String getFlashing() {
        return flashing;
    }
}