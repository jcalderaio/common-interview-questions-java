package Java;
import java.util.*;

class Arrays {
    public static void main(String args[]) {
        int a[];

        a = new int[5];

        a[0] = 1;
        a[1] = 4;
        a[2] = 6;

        a[3] = a[1] * a[2];
        System.out.println("a[3] = " + a[3]);
        System.out.println("a[4] = " + a[4]);

        // attempting to access a[5] will cause an ArrayIndexOutOfBoundsException
    }
}

class convertToArrayList {
	
	//An ArrayList, or a dynamically resizing array, is an array that resizes itself as needed while still 
	//providing 0(1) access. A typical implementation is that when the array is full, the array doubles in size. 
	//Each doubling takes0(n) time, but happens so rarely that itsamor- tized time is still O(1
    public void convertArraytoArrayList(String[] ar) {
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i = 0; i<ar.length; i++) {
            list.add(ar[i]);
        }
        
        for(int j = 0; j<list.size(); j++) {
            System.out.println(list.get(j));
        }
    }
}

class searchArrayString {
    String[] str = new String[] {"JOHN","VICTOR","JUAN","JARROD","JEREMY","KEVIN"};

    public void findInArray(String search)  {
        for(int i=0; i<str.length;i++) {
            if(search==str[i]) {
                System.out.println("Found!!! " + str[i] + " was found at index " +i);

            }
        }
    }
}

class charArray {
    public static void main(String args[]) {
        char ch[] = new char[3];

        ch[0] = 'x';
        ch[1] = 'y';
        ch[2] = 'z';

        System.out.println("ch[0] != ch[2]: " + (ch[0] != ch[2]));
        System.out.println("ch[1] = " + ch[1]);
    }
}

class booleanArray {
    public static void main(String args[]) {
        int b[] = new int[] {1, 2, 5, 8};
        int c[] = {1, 2, 5, 8};

        // The declaration of two arrays, b & c, both are initialized to the same starting 
        // values and the size is determined by the number of parameters listed in the {}'s

        System.out.println("b[0] == c[0] is " + (b[0] == c[0]));
        System.out.println("b[1] == c[1] is " + (b[1] == c[1]));
        System.out.println("b[2] == c[2] is " + (b[2] == c[2]));
        System.out.println("b[3] == c[3] is " + (b[3] == c[3]));

        System.out.println("Are the lengths equal?  " + (b.length == c.length));

        System.out.println("Therefore, b & c, each of length " + b.length + 
            " store the same information");

        System.out.println("However b == c is " + (b == c));
    }
}

class arrayAddMenu {

    public void addMenu() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input array size");
        int size = scan.nextInt();
        int[] array = new int [size];
        int sum = 0;
        for(int j = 0; j<size; j++) {
            System.out.println("Add to array at index " + j);
            int a = scan.nextInt();
            array[j] = a;

        }
        
        for(int k = 0; k<size; k++) {
            
            sum = sum + array[k];;
            
            
        }       
        
        System.out.println("Sum = " +sum);
        System.out.println("Average = " +(sum/size));
        System.out.println();
        for(int k = 0; k<size; k++) {
            
            System.out.println("Array at index " +k+ " = " +array[k]);
            
            
        } 
    }

}

class everyThingArray {
    public static void main(String args[]) {
        int[]  a = {1, 2, 1, 3, 3, 4, 1, 2, 4, 5};
        printArray(a);
        int b = findInArray(a,2);
        System.out.println("found in " + b);
        b = countInArray(a,1);
        System.out.println("found " + b + " times");
        addToArray(a,5);
        printArray(a);
        b = findInArray(a,2);
        System.out.println("found in " + b);
        b = countInArray(a,1);
        System.out.println("found " + b + " times");
    }

    // prints the array
    public static int[] printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " +  a[i]);
        }
        return a;
    }

    // adds the same amount to each array position
    public static void addToArray(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + b;
        }
    }

    // finds the count of the number
    public static int countInArray(int[] a, int b) {
        int count = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == b) {
                count ++;
            }
        }
        return count;
    }

    // finds the index of the first equal number
    public static int findInArray(int[] a, int b) {
        int index = -1;
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == b) {
                index = i;
                break;
            }
        }
        return index;
    }
}

/** 
 * class objectArray {
    public static void main(String args[]) {
        Circle c1 = new Circle();
        //c1.
        
        Circle circles[] = new Circle[10];
        
        circles[0] = new Circle();
        // circles[1].getRadius(); //NullPointerException
        // circles[1] = null;
        // circles[2] = null;
        // ...
        /// cirlces[9] = null;
        
        Circle c2; // null
        // c2.getRadius();
        
        c2 = c2;
        
        circle c3 = null;
        c2 = c3;
    }
}
 */

class TwoDArrays {
    public static void main(String args[]) {
        int matrix[][] = new int[4][6], row, col;

        for (row = 0; row < matrix.length; row++) {
            for (col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = row * col;
            }
        }

        System.out.println("The Matrix is:");
        System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + 
            matrix[0][2] + " " + matrix[0][3] + " " +
            matrix[0][4] + " " + matrix[0][5]);

        System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + 
            matrix[1][2] + " " + matrix[1][3] + " " +
            matrix[1][4] + " " + matrix[1][5]);

        System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + 
            matrix[2][2] + " " + matrix[2][3] + " " +
            matrix[2][4] + " " + matrix[2][5]);

        System.out.println(matrix[3][0] + " " + matrix[3][1] + " " + 
            matrix[3][2] + " " + matrix[3][3] + " " +
            matrix[3][4] + " " + matrix[3][5]);
    }
}