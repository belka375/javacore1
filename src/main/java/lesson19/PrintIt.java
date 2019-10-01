package lesson19;

public class PrintIt<T> {
    public T obj;

    public PrintIt(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
    public  void printInfo(){
        System.out.println(obj);
    }
}
