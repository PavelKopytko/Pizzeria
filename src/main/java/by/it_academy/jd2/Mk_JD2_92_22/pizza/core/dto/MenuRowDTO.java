package by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;

public class MenuRowDTO {

    private IPizzaInfo pizzaInfo;
    private double price;

    public IPizzaInfo getPizzaInfo() {
        return pizzaInfo;
    }

    public void setPizzaInfo(IPizzaInfo pizzaInfo) {
        this.pizzaInfo = pizzaInfo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
