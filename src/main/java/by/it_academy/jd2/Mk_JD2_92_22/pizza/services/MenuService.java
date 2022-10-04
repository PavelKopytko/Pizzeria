package by.it_academy.jd2.Mk_JD2_92_22.pizza.services;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.core.dto.MenuDTO;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.services.api.IMenuService;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.IMenuStorage;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.api.StorageFactory;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.Menu;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.storage.entity.api.IMenu;

import java.util.List;

public class MenuService implements IMenuService {

    private final IMenuStorage menuStorage;

    public MenuService() {
        this.menuStorage = StorageFactory.getInstance().getMenuStorage();
    }

    @Override
    public void save(MenuDTO menuDTO) {
        validate(menuDTO);
        Menu menu = new Menu();
        menu.setItems(menuDTO.getItems());
    }

    @Override
    public List<IMenu> getMenu() {
        return this.menuStorage.getMenu();
    }

    @Override
    public void delete() {
        this.menuStorage.delete();
    }

    @Override
    public void validate(MenuDTO menuDTO) {
        if (menuDTO==null || menuDTO.getItems().size()==0){
            throw new IllegalStateException("Вы не передали меню");
        }
    }
}
