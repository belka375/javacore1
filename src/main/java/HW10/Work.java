package HW10;

public class Work {
    public static void main(String[] args){

        Reactivenonmetal phosphorus = new Reactivenonmetal("phosphorus", new int[]{-3,-2,-1,1,2,3,4,5}, 2.19);

        Reactivenonmetal carbon = new Reactivenonmetal();
        carbon.setName("carbon");
        carbon.setOxidationStates(new int[]{-4,-3,-2,-1,0,1,2,3,4});
        carbon.setElectronegativity(2.55);

        carbon.printClass();
        phosphorus.printClass();

        Engine toyotasupra = new Engine("2JZ","Toyota", 6, new int[]{1,5,3,6,2,4});

        Engine nissanrogue = new Engine();
        nissanrogue.setModel("qr25de");
        nissanrogue.setManufacturer("Nissan");
        nissanrogue.setCylindercount(4);
        nissanrogue.setFiringorder(new int[]{1,3,4,2});

        toyotasupra.printClass();
        nissanrogue.printClass();

        Carpet persidskiy = new Carpet("Persidskiy", new int[]{10,12}, "wool");

        Carpet kitayskiy = new Carpet();
        kitayskiy.setName("Kitayskiy");
        kitayskiy.setDimensions(new int[]{12,15});
        kitayskiy.setMaterial("polyester");

        persidskiy.printClass();
        kitayskiy.printClass();





    }

}
