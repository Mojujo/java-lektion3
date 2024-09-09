package se.oscar.oop;

public class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    //Set&Get Name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    //Set&Get Age
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    //Set&Get City
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public void introduce() {
        System.out.println("Hej, jag heter " + name + ", är " + age + " gammal och bor i " + city);
    }
}
