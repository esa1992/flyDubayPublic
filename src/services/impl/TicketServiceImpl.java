package services.impl;

import enums.TicketStatus;
import models.Ticket;
import services.TicketService;

import java.util.List;

public class TicketServiceImpl implements TicketService {
    @Override
    public void setTicket(Ticket ticket) {
    }

    @Override
    public List<Ticket> getTicketList() {
        return null;
    }

    @Override
    public boolean saveTicket(Ticket ticket) {
        return false;
    }

    @Override
    public Ticket findTicketById(Long id) {
        return new Ticket(12000, TicketStatus.ACTIV);
    }

    @Override
    public boolean changeTicketStatus(Long id, TicketStatus ticketStatus) {


        Ticket ticket = findTicketById(5l);
        System.out.println("Стоимость билета: " + ticket.getPrice() + ", статус: " + ticket.getTicketStatus());

        if (ticket.getTicketStatus().equals(TicketStatus.ACTIV) & ticketStatus.equals(TicketStatus.USED)){
            System.out.println("Смена статуса с Активный на Использован запрещена!");
        }else{
            ticket.setTicketStatus(ticketStatus);
        }

        System.out.println("Стоимость билета: " + ticket.getPrice() + ", статус: " + ticket.getTicketStatus());


        return true;
    }
}
