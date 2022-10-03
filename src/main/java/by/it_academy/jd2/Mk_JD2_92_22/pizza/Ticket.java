package by.it_academy.jd2.Mk_JD2_92_22.pizza;

import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.IOrder;
import by.it_academy.jd2.Mk_JD2_92_22.pizza.api.ITicket;

import java.time.LocalDateTime;

public class Ticket implements ITicket {

    private String number;
    private LocalDateTime creatAt;
    private Order order;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCreatAt(LocalDateTime creatAt) {
        this.creatAt = creatAt;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String getNumber() {
        return this.number;
    }

    @Override
    public LocalDateTime getCreatAt() {
        return this.creatAt;
    }

    @Override
    public IOrder getOrder() {
        return this.order;
    }
}
