package by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IPizzaInfo;


public class PizzaInfo implements IPizzaInfo {
    private String name;
    private String description;
    private int size;

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
