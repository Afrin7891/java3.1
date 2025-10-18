class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    // Override toString() to display food name
    @Override
    public String toString() {
        return "My favorite food is: " + name;
    }

    public static void main(String[] args) {
        Food myFood = new Food("Apple");
        System.out.println(myFood);  // automatically calls toString()
    }
}
