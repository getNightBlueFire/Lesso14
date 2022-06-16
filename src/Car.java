import java.util.Objects;

public class Car {
    private String model;

    public boolean isAirCondition() {
        return airCondition;
    }

    public void setAirCondition(boolean airCondition) {
        this.airCondition = airCondition;
    }

    private boolean airCondition;

    public Car(String model, boolean airCondition) {
        this.model = model;
        this.airCondition = airCondition;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", airCondition=" + airCondition +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getModel().equals(car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), airCondition);
    }
}
