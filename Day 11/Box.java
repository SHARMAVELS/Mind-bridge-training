public class Box<T> {
    T item;
    public Box(){
        this.item = item;
    }
    public void setItem(T item){
        this.item = item;
    }
    public T getItem(){
        return this.item;
    }
    public void printItem(){
        System.out.println(item);
    }
  public boolean isTypeOf(Class<?> type){
        return type.isInstance(item);
  }
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setItem("hello");
        box.printItem();
        System.out.println("String: " + box.isTypeOf(String.class));

        Box<Double> box1 = new Box<>();
        box1.setItem(123.123);
        box1.printItem();
        System.out.println("Double: " + box1.isTypeOf(Double.class));

        Box<Integer> box2 = new Box<>();
        box2.setItem(122);
        box2.printItem();
        System.out.println("Integer: " + box2.isTypeOf(Integer.class));
    }
}