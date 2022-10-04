package by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.PizzaInfoDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;

import java.util.List;

public interface IPizzaInfoService {

    void save(PizzaInfoDTO pizzaInfo);

    List<IPizzaInfo> get();

    IPizzaInfo getByName(String name);

    void validate(PizzaInfoDTO pizzaInfo);
}
