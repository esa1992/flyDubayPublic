package kg.myCompany.flyDubay.services;

import kg.myCompany.flyDubay.enums.TicketStatus;
import kg.myCompany.flyDubay.models.Ticket;
import kg.myCompany.flyDubay.services.impl.TicketServiceImpl;

import java.util.List;

public interface TicketService {

    TicketService INSTACE = new TicketServiceImpl();

    void setTicket(Ticket ticket);

    List<Ticket> getTicketList ();

    boolean saveTicket (Ticket ticket);

    Ticket findTicketById (Long id);

    boolean changeTicketStatus (Long id, TicketStatus ticketStatus);



}
