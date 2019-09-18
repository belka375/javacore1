package hw11;

public class Work {
    public static void main(String[] args){
        PrintType Offset = new PrintType("Offset", 1000, new int[]{20, 30}, new OffsetCollors[]{OffsetCollors.Cyan,OffsetCollors.Magenta,OffsetCollors.Yellow,OffsetCollors.Key});

        Offset.printClass();

        SingleCollorPrintType Yellow = new SingleCollorPrintType("Single Yellow",500, new int[]{20, 30}, OffsetCollors.Yellow);
        Yellow.printClass();
    }

}

//    Сделать Enum (или 2 enum)
//Сделать 2 класса - в первом классе атрибут сделать типа Enum
//        Во  втором классе - атрибут типа Enum[]