public class Car {

    private String color;
    private String model;
    private String dateOfManufacture;

    public Car (String color,  String model, String dateOfManufacture) {
        this.color=color;
        this.model=model;
        this.dateOfManufacture=dateOfManufacture;

    }


    public void setColor(String color) {this.color = color;}
    public void setModel(String model) {this.model = model;}
    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;    }

    public String getColor() {return this.color;}
    public String getModel() {return this.model;}
    public String getDateOfManufacture() {return this.dateOfManufacture;}

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", dateOfManufacture='" + dateOfManufacture + '\'' +
                '}';
    }
}

