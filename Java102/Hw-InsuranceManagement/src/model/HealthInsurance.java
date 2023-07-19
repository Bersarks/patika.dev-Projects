package model;

public class HealthInsurance extends Insurance {
    public HealthInsurance(String name, int price, String dateStart, String dateFinish) {
        super(name, price, dateStart, dateFinish);
    }

    @Override
    public void calculate() {

    }
}
