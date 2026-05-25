package models;

import java.util.Arrays;

public class CarModel {
    private String modelName;
    private CarYear[] years;
    // Contructor
    public CarModel(String modelName, CarYear[] years) {
        this.modelName = modelName;
        this.years = years;
    }
    // Getter y Setters
    public String getModelName() {
        return modelName;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
    public CarYear[] getYears() {
        return years;
    }
    public void setYears(CarYear[] years) {
        this.years = years;
    }
    //toString
    @Override
    public String toString() {
        return "CarModel [modelName=" + modelName + ", years=" + Arrays.toString(years) + "]";
    }
    

  
}




