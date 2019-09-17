package homework10;

public class Work {
    public static void main(String[] args) {

        RequiredFields LoginField = new RequiredFields(new String[]{"Login","Username"}, 25, true);
        LoginField.typeFieldInfo();

        RequiredFields PasswordField = new RequiredFields();
        PasswordField.setFieldName(new String[]{"Password","Parole"});
        PasswordField.setFieldLength(10);
        PasswordField.setRequired(true);

        PasswordField.typeFieldInfo();

        Store Alibaba = new Store(new String[]{"Alibaba","Amazon","Ebay"}, 4,  true);
        Alibaba.getNumberOfEmployees();
        Alibaba.storeInfo();

        Store JustInCase = new Store();
        JustInCase.setName(new String[]{"1000 Things","Good luck"});
        JustInCase.setNumberOfEmployees(15);
        JustInCase.setProfited(false);
        JustInCase.storeInfo();


        Travel Thailand = new Travel ("USA", new int[]{2, 3, 4, 5, 6}, 1500);
        Thailand.travelInfo();
        Thailand.setCountry("Thailand");
        Thailand.travelInfo();

        Travel Brazil = new Travel();
        Brazil.setCountry("Brazil");
        Brazil.setDuration(new int[] {10,11,12,13});
        Brazil.setExpenses(2500);
        Brazil.travelInfo();





    }

}
