package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;

import java.util.List;

public interface IMenuRowStorage {

    void save(IMenuRow menuRow);

    List<IMenuRow> get();

}
