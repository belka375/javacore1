package homework10;

public class Work {
    public static void main(String[] args) {

        RequiredFields loginField = new RequiredFields("Login", 25, true);
        loginField.typeFieldInfo();

        RequiredFields passwordField = new RequiredFields("Password", 10, true);
        passwordField.typeFieldInfo();

        loginField.setFieldName("Username");
        loginField.setRequired(false);
        loginField.typeFieldInfo();

        Store Alibaba = new Store("Alibaba", 4,  true);
        Alibaba.setNumberOfEmployees(255);
        Alibaba.getNumberOfEmployees();
        Alibaba.storeInfo();

        Store JustInCase = new Store("Just in case", 15, false);
        JustInCase.storeInfo();

        Travel Thailand = new Travel ("USA", 24, 1500);
        Thailand.travelInfo();
        Thailand.setCountry("Thailand");
        Thailand.travelInfo();


    }

}
