package by.it_academy.jd2.Mk_JD2_92_22.pizza.services;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.MenuRowDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.IMenuRowService;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.IMenuRowStorage;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.StorageFactory;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.MenuRow;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenuRow;

import java.util.List;

public class MenuRowService implements IMenuRowService {

    private final IMenuRowStorage menuRowStorage;

    public MenuRowService() {
        this.menuRowStorage = StorageFactory.getInstance().getMenuRowStorage();
    }

    @Override
    public void save(MenuRowDTO menuRowDTO) {
        validate(menuRowDTO);
        MenuRow menuRow = new MenuRow();
        menuRow.setPizzaInfo(menuRowDTO.getPizzaInfo());
        menuRow.setPrice(menuRow.getPrice());

    }

    @Override
    public List<IMenuRow> get() {
        return null;
    }

    @Override
    public void validate(MenuRowDTO menuRowDTO) {

        if (menuRowDTO == null) {
            throw new IllegalStateException("Вы не передали строку меню");
        }
        if (menuRowDTO.getPizzaInfo() == null) {
            throw new IllegalArgumentException("Вы не заполнили инфу о пицце");
        }

        if (menuRowDTO.getPrice() <= 0) {
            throw new IllegalArgumentException("Неверное значение цены");
        }

    }
}
