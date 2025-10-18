class Food {
    private String name;

    // Constructor to initialize food name
    public Food(String name) {
        this.name = name;
    }

    // Getter only
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Food myFood = new Food("Apple");
        System.out.println("My favorite food is: " + myFood.getName());
    }
}
