package homework11;



public class StudentLife {
    public static void main(String[] args) {
        Classes[] clas = new Classes[]{Classes.BIOLOGY, Classes.CHEMISTRY, Classes.MATH};
        {
            for (Classes cl : clas
            ) {
                System.out.println(cl);

            }
        }
        System.out.println("______________");
        Classes c = clas[0];
        System.out.println(c);



        ShoeDescription bashmak = new ShoeDescription();
        bashmak.setPrice(350);
        bashmak.setShoeMaterial(ShoeMaterial.LEATHER);
        bashmak.print();

        }




    }







