package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.IPizzaInfoStorage;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;

import java.util.ArrayList;
import java.util.List;

public class PizzaInfoStorageMemory implements IPizzaInfoStorage {

    private List<IPizzaInfo> data = new ArrayList<>();

    public PizzaInfoStorageMemory() {
    }

    @Override
    public void save(IPizzaInfo pizzaInfo) {
        this.data.add(pizzaInfo);
    }

    @Override
    public List<IPizzaInfo> get() {
        return this.data;
    }

    @Override
    public IPizzaInfo getByName(String name) {
        return this.data.stream().filter(a -> a.getName().equals(name)).findFirst().orElse(null);
    }

    //подумать
    public boolean delete(String name){
        return false;
    }

}
