package by.it_academy.jd2.Mk_JD2_92_22.pizza.services;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.PizzaInfoDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.IPizzaInfoService;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.IPizzaInfoStorage;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.StorageFactory;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.PizzaInfo;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;

import java.util.List;

public class PizzaInfoService implements IPizzaInfoService {

    private final IPizzaInfoStorage infoStorage;

    public PizzaInfoService() {
        this.infoStorage = StorageFactory.getInstance().getPizzaInfoStorage();
    }

    @Override
    public void save(PizzaInfoDTO p) {
        validate(p);

        PizzaInfo pizzaInfo = new PizzaInfo();
        pizzaInfo.setName(p.getName());
        pizzaInfo.setDescription(p.getDescription());
        pizzaInfo.setSize(p.getSize());

        infoStorage.save(pizzaInfo);

    }

    @Override
    public List<IPizzaInfo> get() {
        return this.infoStorage.get();
    }

    @Override
    public IPizzaInfo getByName(String name) {
        return this.infoStorage.getByName(name);
    }

    @Override
    public void validate(PizzaInfoDTO p) {

        if (p == null) {
            throw new IllegalStateException("Вы не передали пиццу");
        }
        if (p.getName() == null || p.getName().isBlank()) {
            throw new IllegalArgumentException("Вы не заполнили название пиццы");
        }

        if (p.getDescription() == null || p.getDescription().isBlank()) {
            throw new IllegalArgumentException("Вы не заполнили состав пиццы");
        }
        if (p.getSize() <= 0) {
            throw new IllegalArgumentException("Неверное значение размера");
        }


    }
}
