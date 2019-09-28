import lesson18.Person;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPerson {

    @Test
    public void TestPerson_AgeMultiWeight_Returned(){
        //Arrange
        Person person = new Person("Ivan","Ivanov","Some address",30,75,175);

        //Act
        double answer = person.getAgeMultipleByWeight();

        //Assert
        Assert.assertEquals(answer,2250.0);
    }

    @Test
    public void TestPerson_getLastName_LastNameReturned(){
        //Arrange
        Person person = new Person("Ivan","Ivanov","Some address",30,75,175);

        //Act
        String lastName=person.getLastName();

        //Assert
        Assert.assertEquals(lastName,"Ivanov");
    }

    @Test
    public void TestPerson_getName_NameReturned(){
        //Arrange
        Person person = new Person("Ivan","Ivanov","Some address",30,75,175);

        //Act
        String name=person.getName();

        //Assert
        Assert.assertEquals(name,"Ivan");
    }

    @Test
    public void TestPerson_getAddress_AddressReturned(){
        //Arrange
        Person person = new Person("Ivan","Ivanov","Some address",30,75,175);

        //Act
        String adr=person.getAddress();

        //Assert
        Assert.assertEquals(adr,"Some address");
    }

}
