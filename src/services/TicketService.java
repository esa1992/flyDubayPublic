package services;

import enums.TicketStatus;
import models.Ticket;
import services.impl.TicketServiceImpl;

import java.util.List;

public interface TicketService {

    TicketService INSTACE = new TicketServiceImpl();

    void setTicket(Ticket ticket);

    List<Ticket> getTicketList ();

    boolean saveTicket (Ticket ticket);

    Ticket findTicketById (Long id);

    boolean changeTicketStatus (Long id, TicketStatus ticketStatus);



}
