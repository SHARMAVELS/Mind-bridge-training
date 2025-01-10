public class Box<T> {
    private T item; 

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void printItem() {
        if (item != null) {
            System.out.println("Item in the box: " + item.toString());
        } else {
            System.out.println("The box is empty.");
        }
    }

    public boolean isTypeOf(Class<?> type) {
        return type.isInstance(item);
    }

    public static void main(String[] args) {
        Box<String> str = new Box<>();
        str.setItem("Hello, World");
        str.printItem();
        System.out.println( str.isTypeOf(String.class));
              System.out.println( str.isTypeOf(Integer.class));

Box<Integer> intBox = new Box<>();
           intBox.setItem(42);
        intBox.printItem();
           System.out.println( intBox.isTypeOf(Integer.class));
        System.out.println( intBox.isTypeOf(Double.class));

        Box<Person> personBox = new Box<>();
       personBox.setItem(new Person("John ", 30));
        personBox.printItem();
             System.out.println("Is the item a person " + personBox.isTypeOf(Person.class));
    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String toString() {
        return "Person name='" + name + "', age=" + age ;
    }
}
