package hw8;

public class Work {
    public static void main(String[] args){
        Dog moyaSoba=new Dog();
        moyaSoba.name="Taylor";
        moyaSoba.age="2";
        moyaSoba.weight="65lb";
        moyaSoba.coatColor="Golden";
        moyaSoba.Breed="Golden Retriever";

        Dinner moyaEda=new Dinner();
        moyaEda.nameOfMeal="Plovchik";
        moyaEda.timeOfCooking="1.5";

        moyaSoba.printBreed();
        moyaSoba.printPhysicalConditions();


        moyaEda.printTimeOfCooking();
        moyaEda.printListOfIngridient();

        Building turma=new Building();
        turma.nameOfBuilding="Sovet";
        turma.country="Ujas";
        turma.city="neStolica";
        turma.printAmenities();
        turma.printGeneralInformation();
    }
}
