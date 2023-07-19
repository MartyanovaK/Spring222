package web.model;

public class Car {
    private int id;
    private String name;
    private String model;

    public Car(int id, String name, String model) {
        this.model = model;
        this.name = name;
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return id;
    }

    public void setNumber(String number) {
        this.id = id;
    }
}