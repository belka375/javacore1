package homework.hw15;

public class WorkHw15 {
    public static void main(String[] args){

        Draw paintingPortrait1= new Painting("Mona Lisa","Leonardo","oils",21,30,"renaissance", "portrait",true);
        Draw paintingMine1=new Painting("Flying","NP","oils",24,36,"abstract","abstract",false);

        Draw installationEx1= new Installation("intallation","canvas",1,false);
        Draw istallationEx2=new Installation("installation","board",1,true);

        Draw drawingWork1=new Drawing("Lela","N.P.","pencil",8,10,"Ex1",false);
        Draw drawingWork2=new Drawing("Obormotki","N.P.","gouache",8,8,"Ex2",true);

        System.out.println("PAINTINGS");

        paintingPortrait1.printInfo();

        paintingMine1.printInfo();
        paintingMine1.printMedium();

        System.out.println("INSTALLATIONS");

        installationEx1.printInfo();

        istallationEx2.printInfo();
        istallationEx2.printMedium();

        System.out.println("DRAWINGS");

        drawingWork1.printInfo();
        drawingWork1.printMedium();

        drawingWork2.printInfo();






    }
}
