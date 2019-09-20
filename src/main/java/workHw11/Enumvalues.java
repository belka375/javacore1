package workHw11;

public class Enumvalues {

    enum testList{
        C,
        RUBY,

        JAVA,
        PYTHON

    }

        enum testList1{
            JAVA;
        }



    private static void print(testList val){
        System.out.println(val);
    }

    enum personInfo{
        NAME,
        ADDRESS,
        EMAIL,
        AGE
    }
}
