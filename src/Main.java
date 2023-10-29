public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("ElezthemDev", 16);

        String s1 = "Anton";
        Person person2 = new Person();
        person2.setNameAndAge(s1, 19);

        person1.speak();
        person2.speak();
    }
}
class Person {
    String name;
    int age;

    void setNameAndAge(String username, int userage) {
        name = username;
        age = userage;
    }

    int calculatorTipa() {
        int years = 65-age;
        return years;
    }

    void speak() {
        for(int i = 0; i<3; i++)
            System.out.println("Меня зовут " + name + ", мне " +age+" лет");
    }
    void sayHi() {
        System.out.println("Hi!");
    }
}