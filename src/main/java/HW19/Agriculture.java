package HW19;

public class Agriculture {
    private String name;
    private int fieldNumber;


public Agriculture (String name, int fieldNumber) {
    this.name = name;
    this.fieldNumber = fieldNumber;
}
public void printAgriculture() {

    System.out.println(name + " " + fieldNumber);

}

}