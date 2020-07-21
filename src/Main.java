import enums.TicketStatus;
import models.*;
import models.OperationClass;
import services.TicketService;
import services.impl.TicketServiceImpl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Date dateOut = null;
        Date dateIn = null;

        try {
            dateOut = sdf.parse("01.01.2020 21:00:00");
            dateIn = sdf.parse("02.01.2020 4:30:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        City cityFrom = new City("Bishkek");
        City cityTo = new City("Moscow");

        Plane plane = new Plane("Aerobus A320", 70);

        Flyght flyght = new Flyght(dateOut, dateIn, cityFrom, cityTo, plane);
        Ticket ticket = new Ticket(14500, true, flyght, false);

        Wallet walletIvan = new Wallet(15000);
        Passager ivan = new Passager("Ivan","+996555111222", walletIvan);

        System.out.println("Денег у пасажира " + ivan.getName() + " в кошельке: " + ivan.getWallet().getSumma());
        System.out.println("Иван хочет купить билет стоимостью: " + ticket.getPrice()
            + " \n На рейс из города: " + ticket.getFlyght().getFromCity().getName()
            + " \n в город: " + ticket.getFlyght().getToCity().getName()
            + " \n дата вылета: " + sdf.format( ticket.getFlyght().getOutDate() )
            + " \n дата посадки: " + sdf.format( ticket.getFlyght().getInDate() )
        );

        OperationClass.buyTicket(ticket,ivan);

        System.out.println("Денег у пассажира " + ivan.getName() + " осталось: " + ivan.getWallet().getSumma());*/

        TicketStatus[] ticketStatuses = TicketStatus.values();
        for(int i = 0; i < ticketStatuses.length; i++){
            System.out.println(ticketStatuses[i].name());
        }

        TicketService.INSTACE.changeTicketStatus(5l, TicketStatus.SOLD);


    }
}
