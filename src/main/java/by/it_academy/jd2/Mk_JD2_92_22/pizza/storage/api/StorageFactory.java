package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.PizzaInfoStorageMemory;

public class StorageFactory implements IStorageFactory{

    private static final IStorageFactory instance = new StorageFactory();

    private IPizzaInfoStorage pizzaInfoStorage;

    private StorageFactory() {
        this.pizzaInfoStorage = new PizzaInfoStorageMemory();
    }

    @Override
    public IPizzaInfoStorage getPizzaInfoStorage() {
        return this.pizzaInfoStorage;
    }

    public static IStorageFactory getInstance() {
        return instance;
    }
}
