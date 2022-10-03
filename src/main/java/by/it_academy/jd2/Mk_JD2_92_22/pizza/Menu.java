package by.it_academy.jd2.Mk_JD2_92_22.pizza;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IMenu;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IMenuRow;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {
    private List<IMenuRow> items;

    public void setItems(List<IMenuRow> items) {
        this.items = items;
    }

    @Override
    public List<IMenuRow> getItems() {
        return this.items;
    }
}
