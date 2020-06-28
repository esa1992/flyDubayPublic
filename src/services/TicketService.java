package services;

import models.Ticket;
import services.impl.TicketServiceImpl;

import java.util.List;

public interface TicketService {

    TicketService INSTACE = new TicketServiceImpl();

    void saveTicket (Ticket ticket);
    List<Ticket> getTicketList ();

}
