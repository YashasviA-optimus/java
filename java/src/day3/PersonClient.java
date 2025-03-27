package day3;

public class PersonClient {
    public static void main(String[] args) {

        Person p = new Person("ravi", 16);
        System.out.println(p.getName());
        p.setAge(19);
        System.out.println(p.getAge());
        System.out.println("hello");
    }
}
