package by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto;


import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenu;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;

import java.util.List;

public class MenuDTO {

    private List<IMenuRow> items;

    public List<IMenuRow> getItems() {
        return items;
    }

    public void setItems(List<IMenuRow> items) {
        this.items = items;
    }
}
