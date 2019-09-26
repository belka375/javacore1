package homework.hw14;

public class Gift {
    private String department;
    private Camera camera;
    private String card;


    public Gift(String depart,Camera camera,String card){
         this.department=depart;
        this.camera=camera;
        this.card=card;
           }

    public Camera getCamera() {
        return camera;
    }

    public String getDepartment() {
        return department;
    }

    public String getMCard() {
        return card;
    }






}


