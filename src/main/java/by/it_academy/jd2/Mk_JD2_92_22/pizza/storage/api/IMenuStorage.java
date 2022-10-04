package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenu;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;

import java.util.List;

public interface IMenuStorage {

    void save(IMenu menu);

    List<IMenu> getMenu();

    void delete();
}
