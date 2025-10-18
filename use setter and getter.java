class Food {
    private String name;  // private variable

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Food myFood = new Food();
        myFood.setName("Apple");  // set the food name
        System.out.println("My favorite food is: " + myFood.getName());
    }
}
