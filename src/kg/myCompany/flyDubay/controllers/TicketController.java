package kg.myCompany.flyDubay.controllers;

import kg.myCompany.flyDubay.models.Ticket;
import kg.myCompany.flyDubay.services.TicketService;

public class TicketController {

    TicketService ticketService = TicketService.INSTACE;

    void saveTicket(){

        Ticket ticket = new Ticket();
        ticketService.saveTicket(ticket);





    }

}
