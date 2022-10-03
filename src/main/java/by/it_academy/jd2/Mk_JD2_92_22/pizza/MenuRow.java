package by.it_academy.jd2.Mk_JD2_92_22.pizza;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IMenuRow;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.ISelectedItem;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;

public class MenuRow implements IMenuRow {

    private IPizzaInfo info;
    private double price;

    public MenuRow(IPizzaInfo info, double price) {
        this.info = info;
        this.price = price;
    }

    public void setInfo(IPizzaInfo info) {
        this.info = info;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public IPizzaInfo getInfo() {
        return this.info;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
