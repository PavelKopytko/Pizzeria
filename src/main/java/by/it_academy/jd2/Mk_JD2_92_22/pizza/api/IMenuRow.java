package by.it_academy.jd2.Mk_JD2_92_22.pizza.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;

/**
 * Строчка меню
 */
public interface IMenuRow {
    /**
     * Информация о пицце
     * @return
     */
    IPizzaInfo getInfo();

    /**
     * Стоимость пиццы
     * @return
     */
    double getPrice();
}
