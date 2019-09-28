package homework.hm11;

public class WorkHw11 {
    public static void main(String[]args){
//        1. Enums: categories of art "ArtExhibit" & categories of museums "Category";
//         2. Classes : 1) Gallery with Emnum[] ArtExhibit
//                      2) Museum with Enum Category;
//        3. Default constructs" "perception" and moma;
//           Full constructs: expansion and dolls;



        Gallery  perception=new Gallery();
        perception.setName("Perception");
        perception.setOwner("Ben Don");
        perception.setYearFounded(2000);
        perception.setArtExhibit(new ArtExhibit[]{ArtExhibit.PHOTOGRAPHY,ArtExhibit.GRAPHICS});


       Gallery  expansion=new Gallery("Expansion","Charles Cue",1995, new ArtExhibit[]{ArtExhibit.PAINTING,ArtExhibit.GRAPHICS,ArtExhibit.PHOTOGRAPHY});

       Museum moma=new Museum();
       moma.setName("MoMA");
       moma.setCategory(Category.PRIVATE);
       moma.setYearFounded(1929);

       Museum dolls=new Museum("Doll World", Category.COMMUNITY,1985);

       perception.printGallery();
       expansion.printGallery();
       moma.printMuseum();
       dolls.printMuseum();





    }
}
