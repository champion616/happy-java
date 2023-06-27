package 섹션5.배열과컬렉션프레임워크;

public class GenericBox<T> {
    private T t;

    public void set(T obj){
        this.t = obj;
    }

    public T get(){
        return this.t;
    }
}
