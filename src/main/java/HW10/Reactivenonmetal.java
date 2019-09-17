package HW10;

public class Reactivenonmetal {
    private String name;
    private int[] oxidationStates;
    private double electronegativity;

    public Reactivenonmetal(){}

    public Reactivenonmetal(String name, int[] oxidationStates, double electronegativity){
        this.name = name;
        this.oxidationStates = oxidationStates;
        this.electronegativity = electronegativity;
    }

    public void setName(String name){this.name=name;}
    public void setOxidationStates(int[] oxidationStates){this.oxidationStates=oxidationStates;}
    public void setElectronegativity(double electronegativity){this.electronegativity=electronegativity;}

    public String getName(){return name;}
    public int[] getOxidationStates(){return oxidationStates;}
    public double getElectronegativity(){return electronegativity;}

    public void printClass(){
        System.out.println("Name = "+name+"; Electronegativity = "+electronegativity);
        System.out.print("Oxidation States = ");
        for (int i:oxidationStates) {System.out.print(i+", ");}
        System.out.println("  ");
    }
}

//Create 3 classes - in itch class create minimum 3 attributes (one of this attributes need be array).
//        Create getters and setter fro every attribute.
//        Create minimum 2 contractors in every Class - default and complete (you can create more constructors)
//        Create in Class Work/ main() minimum 2 objects for every class - one with complete constructor and other its default one.
//        Print all this objects with function printClass().
