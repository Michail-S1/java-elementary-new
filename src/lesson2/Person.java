package lesson2;

public class Person {
    public String name;
    public int age = 10;
    public static int PERSON_COUNT;

    public Person() {
        name = "Default Name";
        age = 10;
        PERSON_COUNT++;
    }

    public Person(String name) {

        this.name = name;
        PERSON_COUNT++;
    }

    public Person(int age) {

        this.age = 7;
        PERSON_COUNT++;
    }

    public Person(String name, int age) {
        this.age = 7;
        this.name = name;
        PERSON_COUNT++;
    }

    public static void main(String[] args) {



        Person person = new Person();
        System.out.println(person.name);
        System.out.println(person.age);

        Person person1 = new Person("With name");
        System.out.println(person1.name);
        System.out.println(person1.name);

        Person person2 = new Person(12);
        System.out.println(person2.name);
        System.out.println(person2.age);

        String someName = "Some name";
        int someAge = 10;
        Person person3 = new Person();
        System.out.println(person3.name);
        System.out.println(person3.age);

    }
    public static void printPersonCount() {
        System.out.println(PERSON_COUNT);
    }

}
