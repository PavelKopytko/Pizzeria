package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;

public class MenuRow implements IMenuRow {

    private IPizzaInfo pizzaInfo;
    private double price;

    @Override
    public IPizzaInfo getPizzaInfo() {
        return this.pizzaInfo;
    }

    public void setPizzaInfo(IPizzaInfo pizzaInfo) {
        this.pizzaInfo = pizzaInfo;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    //
    public void setPrice(double price) {
        this.price = price;
    }
}
