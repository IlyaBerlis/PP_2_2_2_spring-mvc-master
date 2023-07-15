package web.model;

public class Car {
    private String model;
    private String color;
    private int year;
    private int power;

    public Car() {
    }

    public Car(String model, String color, int year, int power) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Car: model = " + model +
                ", color = " + color +
                ", year = " + year +
                ", power=" + power;
    }
}
