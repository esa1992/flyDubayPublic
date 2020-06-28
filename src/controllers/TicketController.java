package controllers;

import models.Ticket;
import services.TicketService;

public class TicketController {

    TicketService ticketService = TicketService.INSTACE;

    void saveTicket(){

        Ticket ticket = new Ticket();
        ticketService.saveTicket(ticket);

        /*новые изменения */
        //ваывавыаываывавыа
        /*dsfasdfdsfasdf*/
    }

}
