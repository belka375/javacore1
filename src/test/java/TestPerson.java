import lesson18.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPerson {
    @Test
    public void TestPerson_AgeMultiWeight_Returned(){
        //Arrange
        Person person = new Person("Ivan", "Ivanov","Some address",30,75,175);

        //Act
        double answer = person.getAgeMultiplyByWeight();
        //Asserts
        Assert.assertEquals(answer,2250.0);
    }
    @Test
    public void TestPerson_LastName_Returned(){
        //Arrange
        Person person = new Person("Ivan", "Ivanov","Some address",30,75,175);

        //Act
        String lastName=person.getLastName();
        //Asserts
        Assert.assertEquals(lastName,"Ivanov");
    }
    @Test
    public void TestPerson_Name_Returned(){
        //Arrange
        Person person = new Person("Ivan", "Ivanov","Some address",30,75,175);

        //Act
        String name=person.getName();
        //Asserts
        Assert.assertEquals(name,"Ivan");
    }
    @Test
    public void TestPerson_Address_Returned(){
        //Arrange
        Person person = new Person("Ivan", "Ivanov","Some address",30,75,175);

        //Act
        String address=person.getAddress();
        //Asserts
        Assert.assertEquals(address,"Some address");
    }
}
