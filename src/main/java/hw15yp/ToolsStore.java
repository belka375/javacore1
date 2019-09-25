package hw15yp;

public class ToolsStore extends Store {
    private String country;
    public boolean installationService;

    public ToolsStore(String name, String location, int numberOfEmployees, String country,  boolean installationService) {
        super(name, location, numberOfEmployees);
        this.country = country;
        this.installationService = installationService;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public boolean isInstallationService() {
        return installationService;
    }

    public void setInstallationService(boolean installationService) {
        this.installationService = installationService;
    }

    @Override
    public void printStoreInfo() {
        super.printStoreInfo();
        System.out.println("Country: "+country+"\nInstallation Service: "+installationService+"");
    }
}




