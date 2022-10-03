package by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.PizzaInfoService;

public class ServiceFactory implements IServiceFactory{

    private static final IServiceFactory instance = new ServiceFactory();

    private IPizzaInfoService pizzaInfoService;

    private ServiceFactory() {
        this.pizzaInfoService = new PizzaInfoService();
    }

    @Override
    public IPizzaInfoService getPizzaInfoService() {
        return this.pizzaInfoService;
    }

    public static IServiceFactory getInstance() {
        return instance;
    }


}
