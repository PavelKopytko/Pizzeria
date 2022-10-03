package by.it_academy.jd2.Mk_JD2_92_22.pizza;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IOrder;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.ISelectedItem;

import java.util.List;

public class Order implements IOrder {

    private List<ISelectedItem> items;

    public Order(List<ISelectedItem> items) {
        this.items = items;
    }

    public void setItems(List<ISelectedItem> items) {
        this.items = items;
    }

    @Override
    public List<ISelectedItem> getSelected() {
        return this.items;
    }
}
