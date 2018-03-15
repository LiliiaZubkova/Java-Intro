package Lesson2;

class Person {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null) return false;
        return secondName != null ? secondName.equals(person.secondName) : person.secondName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    String firstName;
    String secondName;
    int age;
    private static int count = 0;

    Person (String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        count++;
    }

    void DoSomething (){
        String end = " is doing something.";

        System.out.println(firstName + " " + secondName + end);
    }

    static {
        System.out.println("First class loading.");
    }

    {
        System.out.println(count + " class loading.");
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov", 58);
        Person p2 = new Person("Anna", "Ivanova", 30);
        Person p3 = new Person("Anna", "Ivanova", 35);

        System.out.println(p1.firstName + " " + p2.secondName + " " + p3.age);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
    }
}
