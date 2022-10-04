package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api;


/**
 * Информация о пицце
 */
public interface IPizzaInfo {
    /**
     * Название пиццы
     *
     * @return
     */
    String getName();

    /**
     * Описание/состав пиццы
     *
     * @return
     */
    String getDescription();

    /**
     * Итоговый размер пиццы которую приготовят
     *
     * @return
     */
    int getSize();

}
