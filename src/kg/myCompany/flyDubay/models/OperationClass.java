package kg.myCompany.flyDubay.models;

/**
 * Created by s.elistratov on 18/06/2020.
 */
public class OperationClass {

    public static int counter;

    public static void buyTicket (Ticket ticket, Passager passager){

        if(ticket.isActiv() & !ticket.isSold()){

            if(passager.getWallet().getSumma() - ticket.getPrice() >= 0){
                System.out.println("\nПокупка совершена успешна\n");

                Wallet wallet = passager.getWallet();
                wallet.setSumma(passager.getWallet().getSumma() - ticket.getPrice());
                passager.setWallet(wallet);
                ticket.setSold(true);

            }else{
                System.out.println("\nУ пасажира " + passager.getName() + " не хватает денег для покупки\n");
            }

        }else{
            System.out.println("\nБилет не активен или выкуплен ранее, покупка невозможна\n");
        }

    }

}
