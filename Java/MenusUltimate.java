package Java;
import java.util.*;

class MenusUltimate {
    public static void main(String args[]) {
        NumberSystem ns = new NumberSystem();
        ns.doWhilemenu();
    }
}

class NumberSystem {

    public void doWhilemenu() {
        Scanner scanner = new Scanner(System.in);
        int selection;

        do {
            System.out.println();
            System.out.println("1. Print one column of numbers");
            System.out.println("2. Print two column of numbers");
            System.out.println("3. Print three column of numbers");
            System.out.println("4. Quit");

            System.out.println("\nEnter a selection");
            selection = scanner.nextInt();

            if(selection == 1) {
                System.out.println("Enter a number system from 1-10");
                int number = scanner.nextInt();
                printList1(number);

            }

            if(selection == 2) {
                System.out.println("Enter a number system");
                int number = scanner.nextInt();
                printList2(number);

            }

            if(selection == 3) {
                System.out.println("Enter a number system");
                int number = scanner.nextInt();
                printList3(number);

            }

        }while(selection != 4);
    }

    public void whileSwitchMenu() {
        Scanner sc = new Scanner(System.in);
        int selection=0;

        while(selection != 4) {
            System.out.println();
            System.out.println("1. Print one column of numbers");
            System.out.println("2. Print two column of numbers");
            System.out.println("3. Print three column of numbers");
            System.out.println("4. Quit");

            System.out.println("\nEnter a selection");
            selection = sc.nextInt();

            switch(selection) {
                case 1: System.out.println("Enter a number system from 1-10");
                int number = sc.nextInt();
                printList1(number);
                break;

                case 2: System.out.println("Enter a number system from 1-10");
                int number2 = sc.nextInt();
                printList2(number2);
                break;

                case 3: System.out.println("Enter a number system from 1-10");
                int number3 = sc.nextInt();
                printList3(number3);
                break;

            }

        }
    }

    public void printList1(int number) {
        if(number<=10) {
            System.out.println();
            for (int col1=0; col1<number; col1++) {
                System.out.println(col1);
            }
        }
    }

    public void printList2(int number) {
        if(number<=10) {
            System.out.println();
            for (int col1=0; col1<number; col1++) {

                for(int col2=0; col2<number; col2++) {
                    System.out.print(col1);
                    System.out.println(col2);
                }

            }
        }
    }

    public void printList3(int number) {
        if(number<=10) {
            System.out.println();
            for (int col1=0; col1<number; col1++) {

                for(int col2=0; col2<number; col2++) {

                    for(int col3=0; col3<number; col3++) {
                        System.out.print(col1);
                        System.out.print(col2);
                        System.out.println(col3);

                    }
                }
            }
        }

    }
}
