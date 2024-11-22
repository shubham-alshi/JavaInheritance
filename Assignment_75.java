package assignments_package;

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public void displayModel() {
        System.out.println("Car Model: " + this.model);
    }
}
