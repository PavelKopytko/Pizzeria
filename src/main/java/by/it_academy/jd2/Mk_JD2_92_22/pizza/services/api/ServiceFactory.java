package by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.MenuRowService;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.MenuService;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.PizzaInfoService;

public class ServiceFactory implements IServiceFactory {

    private static final IServiceFactory instance = new ServiceFactory();

    private IPizzaInfoService pizzaInfoService;
    private IMenuRowService menuRowService;
    private IMenuService menuService;

    private ServiceFactory() {
        this.pizzaInfoService = new PizzaInfoService();
        this.menuRowService = new MenuRowService();
        this.menuService = new MenuService();

    }

    @Override
    public IPizzaInfoService getPizzaInfoService() {
        return this.pizzaInfoService;
    }

    @Override
    public IMenuRowService getMenuRowService() {
        return this.menuRowService;
    }

    @Override
    public IMenuService getMenuService() {
        return menuService;
    }

    public static IServiceFactory getInstance() {
        return instance;
    }


}
