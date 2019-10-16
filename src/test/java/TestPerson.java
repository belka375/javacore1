import lesson18.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPerson {

    @Test
    public void TestPerson_GetBMI_BMIReturn(){
        //Arrange
        Person aibek = new Person("Aibek", "Dosym", "122 Mapleton ave.", 21, 90.5, 180.8);

        //Act
        double answer = aibek.index();
        double answer1 = aibek.ageMultWeight();

        //Assert
        Assert.assertEquals(answer, 27.685458923956457);
        Assert.assertEquals(answer1, 1900.5);


    }
    @Test
    public void TestPerson_GetLastName(){
        //Arrange
        Person aibek = new Person("Aibek", "Dosym", "122 Mapleton ave.", 21, 90.5, 180.8);

        //Act
        String answer = aibek.getLastName();
        String answer1 = aibek.getName();
        String answer2 = aibek.getAddress();
        int answer3 = aibek.getAge();


        //Assert
        Assert.assertEquals(answer, "Dosym");
        Assert.assertEquals(answer1, "Aibek");
        Assert.assertEquals(answer2, "122 Mapleton ave.");
        Assert.assertEquals(answer3, 21);

    }
}
