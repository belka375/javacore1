package hw11;

public class Work {
    public static final int TEMP = 55;

    public static void main (String [] args) {


        Toaster toast = new Toaster();

        toast.setBrand("Kitchen aid");
        toast.setType("Stainless steel");
        toast.setPrice(55);
        toast.setHeatLevel(HeatLevel.HIGH);

        System.out.println("Toaster details:");
        toast.printToasterInfo();




        Store st = new Store();
        st.setName("Express");
        st.setHours(9);
        st.setEmployees(10);
        st.setStoreClosed( new WeekDays[] {WeekDays.MONDAY, WeekDays.THURSDAY});

        System.out.println("Store info:");
        st.printStoreInfo();

    }

}

