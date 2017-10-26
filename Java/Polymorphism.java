package Java;

public class Polymorphism
{

}

/**
 * This program adds a class Ship and subclasses AircraftCarrier, Battleship, Destroyer, Submarine, and PatrolBoat. This will be used on the next assignment to implement the game "BattleShip."
 * 
 * Author: John Calderaio 
 * Section: 11H5
 * Assignment #: 8
 * Due Date: November 22, 2013
 */

class Ship {
    protected int column;
    protected boolean horizontal;
    protected int positions;
    protected char row;

    public Ship() {
        
    }

    public Ship(int column, boolean horizontal, int positions, char row) {
        this.column = column;
        this. horizontal = horizontal;
        this.positions = positions;
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void setHorizontal(boolean horizontal) {
        this.horizontal = horizontal;
    }

    public boolean getHorizontal() {
        return horizontal;
    }

    public void setPositions(int positions) {
        this.positions = positions;
    }

    public int getPositions() {
        return positions;
    }

    public void setRow(char row) {
        this.row = row;
    }

    public char getRow() {
        return row;
    }

    public void printInfo() {
        System.out.print(toString());
    }

    public String toString() {
        return "Column: " + column + "\n" + "Horizontal: " + horizontal + "\n" + 
        "Position: " + positions + "\n" + "Row: " + row + "\n";
    }
}

class AircraftCarrier extends Ship {
    public AircraftCarrier() {     //This adds an AircraftCarrier with defaults in the superclass as well as a set position of 5
        super.setColumn(3);
        super.setHorizontal(true);
        super.setPositions(5);
        setRow('A');
    }

    public AircraftCarrier(int column, boolean horizontal, char row) {
        super(column, horizontal, 5, row);

    }
    
    public void printInfo() {
        System.out.print(toString());
    }

    public String toString() {      //This return a String describing the type of ship as well as calling the toString method of the superclass
        return "Ship Type: AircraftCarrier" + "\n" + super.toString();
    }
    
}

class Battleship extends Ship {
    public Battleship() {  //This adds an Battleship with defaults in the superclass as well as a set position of 4
        super.setColumn(6);
        super.setHorizontal(false);
        super.setPositions(4);
        setRow('B');
    }

    public Battleship(int column, boolean horizontal, char row) {
        super(column, horizontal, 4, row);

    }
    
    public void printInfo() {
        System.out.print(toString());
    }

    public String toString() {   //This return a String describing the type of ship as well as calling the toString method of the superclass
        return "Ship Type: Battleship" + "\n" + super.toString();
    }
    
}

class Destroyer extends Ship {
    public Destroyer() {    //This adds an Destroyer with defaults in the superclass as well as a set position of 3
        super.setColumn(8);
        super.setHorizontal(true);
        super.setPositions(3);
        setRow('C');
    }

    public Destroyer(int column, boolean horizontal, char row) {
        super(column, horizontal, 3, row);

    }
    
    public void printInfo() {
        System.out.print(toString());
    }

    public String toString() {   //This return a String describing the type of ship as well as calling the toString method of the superclass
        return "Ship Type: Destroyer" + "\n" + super.toString();
    }
    
}

class Submarine extends Ship {
    public Submarine() {    //This adds an Submarine with defaults in the superclass as well as a set position of 3
        super.setColumn(3);
        super.setHorizontal(false);
        super.setPositions(3);
        setRow('D');
    }

    public Submarine(int column, boolean horizontal, char row) {
        super(column, horizontal, 3, row);

    }
    
    public void printInfo() {
        System.out.print(toString());
    }

    public String toString() {    //This return a String describing the type of ship as well as calling the toString method of the superclass
        return "Ship Type: Submarine" + "\n" + super.toString();
    }
    
}

class PatrolBoat extends Ship {  
    public PatrolBoat() {    //This adds an PatrolBoat with defaults in the superclass as well as a set position of 2
        super.setColumn(5);
        super.setHorizontal(true);
        super.setPositions(2);
        setRow('E');
    }

    public PatrolBoat(int column, boolean horizontal, char row) {
        super(column, horizontal, 2, row);

    }
    
    public void printInfo() {
        System.out.print(toString());
    }

    public String toString() {      //This return a String describing the type of ship as well as calling the toString method of the superclass
        return "Ship Type: PatrolBoat" + "\n" + super.toString();
    }
    
}








