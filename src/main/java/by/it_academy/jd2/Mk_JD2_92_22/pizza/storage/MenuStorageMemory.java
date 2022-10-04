package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.IMenuStorage;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuStorageMemory implements IMenuStorage {

    private List<IMenu> menuList = new ArrayList<>();


    @Override
    public void save(IMenu menu) {
        this.menuList.add(menu);
    }

    @Override
    public List<IMenu> getMenu() {
        return this.menuList;
    }

    @Override
    public void delete() {
        this.menuList = new ArrayList<>();
    }
}
