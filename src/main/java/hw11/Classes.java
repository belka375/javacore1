package hw11;

public class Classes {
    public static void main(String[] args) {
        Days[] daysG = new Days[]{Days.MONDAY, Days.WEDNSDAY, Days.SATURDAY};
        Days[] daysP = new Days[]{Days.MONDAY, Days.THURSDAY, Days.SATURDAY};

        YogaClasses[] mondayYoga = new YogaClasses[] {YogaClasses.ASHTANGA, YogaClasses.VINYASA, YogaClasses.IYENGAR};
        YogaClasses[] fridayYoga = new YogaClasses[] {YogaClasses.PILATES, YogaClasses.HATHA};

        Swimming swimingLessonsGroup = new Swimming("Group swimming classes: ", daysG);
        Swimming swimmingLessonsIndividual = new Swimming("Private swimming classes: ", daysP);

        Yoga yoga1 = new Yoga(Days.MONDAY, mondayYoga );
        Yoga yoga2 = new Yoga(Days.FRIDAY, fridayYoga);

        System.out.println("____________________________________");
        swimingLessonsGroup.printSwimmingClassesInfo();
        swimmingLessonsIndividual.printSwimmingClassesInfo();

        System.out.println("____________________________________");
        System.out.println();
        System.out.println("Yoga classes: ");
        yoga1.printYogaClassesInfo();
        yoga2.printYogaClassesInfo();






    }
}