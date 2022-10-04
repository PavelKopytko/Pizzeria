package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.IMenuRowStorage;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;

import java.util.ArrayList;
import java.util.List;

public class MenuRowStorageMemory implements IMenuRowStorage {

    private List<IMenuRow> data = new ArrayList<>();


    @Override
    public void save(IMenuRow menuRow) {
        this.data.add(menuRow);
    }

    @Override
    public List<IMenuRow> get() {
        return this.data;
    }
}
