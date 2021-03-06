package ua.lviv.iot;

public class Accommodation {
    private int numberOfRooms;
    private double price;
    private double area;
    private final Location location = new Location();

    public Accommodation(int numberOfRooms, double price, double area, double latitude, double height,
                         double longitude) {
        this.numberOfRooms = numberOfRooms;
        this.price = price;
        this.area = area;
        this.setLocation(latitude, height, longitude);
    }

    @Override
    public String toString() {
        return "\n\nAccommodation:"
                + "\nnumberOfRooms = " + numberOfRooms
                + "\nprice = " + price
                + "\narea = " + area;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(double latitude, double height, double longitude) {
        this.location.setLocation(latitude, height, longitude);
    }
}

