package by.it_academy.jd2.Mk_JD2_92_22.pizza;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IDoneOrder;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IPizza;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.ITicket;

import java.util.List;

public class DoneOrder implements IDoneOrder {

    private ITicket ticket;
    private List<IPizza> item;

    public void setTicket(ITicket ticket) {
        this.ticket = ticket;
    }

    public void setItem(List<IPizza> item) {
        this.item = item;
    }

    @Override
    public ITicket getTicket() {
        return this.ticket;
    }

    @Override
    public List<IPizza> getItems() {
        return this.item;
    }
}
