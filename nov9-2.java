public class Person {
    private String name;    // private field — can't be accessed directly outside
    private int age;

    // public getter
    public String getName() {
        return name;
    }

    // public setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {      // validation
            this.age = age;
        }
    }
}
