package Kodlama_io.Entities;

public class Course {
    private String title;
    private String startingDate;
    public double price;

    public Course() {

    }

    public Course(String title, String startingDate, double price) {
        this.title = title;
        this.startingDate = startingDate;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
