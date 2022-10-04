package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenu;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;

import java.util.List;

public class Menu implements IMenu {
    private List<IMenuRow> items;

    @Override
    public List<IMenuRow> getItems() {
        return this.items;
    }

    public void setItems(List<IMenuRow> items) {
        this.items = items;
    }
}
