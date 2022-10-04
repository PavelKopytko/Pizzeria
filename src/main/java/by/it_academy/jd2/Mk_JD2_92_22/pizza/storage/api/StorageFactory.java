package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.MenuRowStorageMemory;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.MenuStorageMemory;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.PizzaInfoStorageMemory;

public class StorageFactory implements IStorageFactory{

    private static final IStorageFactory instance = new StorageFactory();

    private IPizzaInfoStorage pizzaInfoStorage;
    private IMenuRowStorage menuRowStorage;
    private IMenuStorage menuStorage;

    private StorageFactory() {
        this.pizzaInfoStorage = new PizzaInfoStorageMemory();
        this.menuRowStorage = new MenuRowStorageMemory();
        this.menuStorage = new MenuStorageMemory();
    }

    @Override
    public IPizzaInfoStorage getPizzaInfoStorage() {
        return this.pizzaInfoStorage;
    }

    @Override
    public IMenuRowStorage getMenuRowStorage() {
        return this.menuRowStorage;
    }
    @Override
    public IMenuStorage getMenuStorage() {
        return this.menuStorage;
    }

    public static IStorageFactory getInstance() {
        return instance;
    }
}
