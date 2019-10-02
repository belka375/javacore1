package lesson19;

public class PrintIt<T> {
    //generics  используют когда мы заранее не знаем тип препеменной,
    // это как враппер - который создает что то вокруг объекта
    public T obj;

    public PrintIt(T obj){
        this.obj=obj;

    }
    public void printInfo(){

    }


}
