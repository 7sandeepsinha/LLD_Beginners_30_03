package projects.parkingLot.repository;

import projects.parkingLot.exception.TicketNotFoundException;
import projects.parkingLot.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    private Map<Integer, Ticket> ticketMap;

    public TicketRepository() {
        this.ticketMap = new HashMap<>();
    }

    public Ticket get(int TicketId){
        Ticket Ticket  = ticketMap.get(TicketId);
        if(Ticket == null){
            throw new TicketNotFoundException("Ticket not found for : "
                    + Ticket);
        }
        return Ticket;
    }

    public void put(Ticket Ticket) {
        ticketMap.put(Ticket.getId(), Ticket);
        System.out.println("Ticket has been added successfully");
    }
}
