class Food {
    public String name;  // public variable

    public static void main(String[] args) {
        Food myFood = new Food();
        myFood.name = "Apple";  // directly assign
        System.out.println("My favorite food is: " + myFood.name);
    }
}
