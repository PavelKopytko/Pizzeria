package by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.MenuDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenu;

import java.util.List;

public interface IMenuService {

    void save(MenuDTO menuDTO);

    List<IMenu> getMenu();

    void delete();

    void validate(MenuDTO pizzaInfo);
}
