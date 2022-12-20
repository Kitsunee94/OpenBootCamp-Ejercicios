public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Carles");
        System.out.println(person.getName());

        person.setAge("28");
        System.out.println(person.getAge());

        person.setNumber("6777889");
        System.out.println(person.getNumber());
    }

}

  class Person {

    private String age;

    private String name;

    private String number;

    //Getter

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    //Setter

    public void setAge(String age) {
        this.age = age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}