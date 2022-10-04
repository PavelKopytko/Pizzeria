package by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.MenuRowDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;

import java.util.List;

public interface IMenuRowService {

    void save(MenuRowDTO menuRowDTO);

    List<IMenuRow> get();

    void validate(MenuRowDTO menuRowDTO);
}
