package hw10;

public class Pool {
    private String form;
    private double volume;
    private boolean full;
    private String[] access;

    public Pool(){}
    public Pool(String form, double volume, boolean full, String[] access){
        this.form=form;
        this.volume=volume;
        this.full=full;
        this.access=access;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setAccess(String[] access) {
        this.access = access;
    }

    public String getForm() {
        return form;
    }

    public String[] getAccess() {
        return access;
    }
    public void printPoolInfo() {
        System.out.println("-------------");
        System.out.println("Pools info: " +form + ", " + volume + ", " + full);
        for (String acc : access) {
            System.out.print(acc + ", ");
        }
    }
}
