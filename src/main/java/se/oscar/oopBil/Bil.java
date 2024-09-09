package se.oscar.oopBil;

public class Bil {
    private String model;
    private int price;
    private String color;
    private int buildYear;
    private int speed;
    boolean start = true;

    public Bil(String model, int price, String color, int buildYear, int speed) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.buildYear = buildYear;
        this.speed = speed;
    }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getBuildYear() { return buildYear; }
    public void setBuildYear(int buildYear) { this.buildYear = buildYear; }

    public void start() throws InterruptedException {
        while(start) {
            accelerate(5);
            System.out.println("Din hastighet är: " + speed + "km/h");
            Thread.sleep(500);
            if (speed > 100) {
                stop();
            }
        }
    }
    public void stop() {
        start = false;
        System.out.println("Du kör för fort! Du har kraschat");
    }
    public void accelerate(int increase) {
        this.speed += increase;
    }
}
