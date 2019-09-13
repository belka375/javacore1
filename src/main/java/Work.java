public class Work {
    public static void main(String[] args) {
        QaSchool Portnov = new QaSchool();
        Portnov.name = "Portnov Computer School";
        Portnov.establishedAt = "01.09.1994";
        Portnov.address = "4970 El Camino real, Los Altoc, CA";
        Portnov.numberOfStudents = 10000;
        Portnov.numberEmlpoyedGraduates = 1000;

        Portnov.schoolName();
        Portnov.quality();

        QaSchool TestPro = new QaSchool();
        TestPro.name = "TestPro";
        TestPro.establishedAt = "2018";
        TestPro.address = "online";
        TestPro.numberOfStudents = 1000;
        TestPro.numberEmlpoyedGraduates = 1000;

        TestPro.schoolName();
        TestPro.quality();

        Baba Luba = new Baba();
        Luba.name1 = "Luba";
        Luba.age = 45;
        Luba.whoIsIt();
        Luba.yagodka(45, 125, true);

        Baba Sara = new Baba();
        Sara.name1 = "Sarochka";
        Sara.age = 40;
        Sara.whoIsIt();
        Sara.yagodka(40, 135, false);

    }
}
