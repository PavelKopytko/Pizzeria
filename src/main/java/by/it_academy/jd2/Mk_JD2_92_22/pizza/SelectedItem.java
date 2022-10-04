package by.it_academy.jd2.Mk_JD2_92_22.pizza;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.ISelectedItem;

public class SelectedItem implements ISelectedItem {

    private IMenuRow row;
    private int count;

    @Override
    public IMenuRow getRow() {
        return this.row;
    }

    @Override
    public int getCount() {
        return this.count;
    }
}
