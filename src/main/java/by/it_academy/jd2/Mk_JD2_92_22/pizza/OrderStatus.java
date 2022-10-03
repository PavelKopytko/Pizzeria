package by.it_academy.jd2.Mk_JD2_92_22.pizza;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IOrderStatus;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IStage;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.ITicket;

import java.util.List;

public class OrderStatus implements IOrderStatus {

    private Ticket ticket;
    private List<IStage> history;
    private boolean done;

    public OrderStatus(Ticket ticket, List<IStage> history, boolean done) {
        this.ticket = ticket;
        this.history = history;
        this.done = done;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setHistory(List<IStage> history) {
        this.history = history;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public ITicket getTicket() {
        return null;
    }

    @Override
    public List<IStage> getHistory() {
        return null;
    }

    @Override
    public boolean isDone() {
        return false;
    }
}
