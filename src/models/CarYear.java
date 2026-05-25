package models;

public class CarYear {
    private int year;
    private boolean isValid;
    
    // constructor
    public CarYear(int year, boolean isValid) {
        this.year = year;
        this.isValid = isValid;
    }
    // Getters y Setters

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean isValid) {
        this.isValid = isValid;
    }
    // toString 

    @Override
    public String toString() {
        return "CarYear [year=" + year + ", isValid=" + isValid + "]";
    }
    
}
