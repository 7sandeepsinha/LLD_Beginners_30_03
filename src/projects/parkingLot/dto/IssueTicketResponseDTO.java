package projects.parkingLot.dto;

import projects.parkingLot.models.Ticket;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class IssueTicketResponseDTO {
    private ResponseStatus responseStatus;
    private String failureReason;
    private Ticket ticket;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        HashMap<String, String> ticketData = new HashMap<>();
        ticketData.put("Response", responseStatus.toString());
        if(responseStatus.equals(ResponseStatus.FAILURE))
            ticketData.put("Failure message", failureReason);

        ticketData.put("Ticket Id", String.valueOf(ticket.getId()));
        ticketData.put("Vehicle Number", ticket.getVehicle().getNumber());
        ticketData.put("Vehicle Make", ticket.getVehicle().getMake());
        ticketData.put("Parking Spot", String.valueOf(ticket.getParkingSpot().getNumber()));

        LocalDateTime entryDateTime = ticket.getEntryTime();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        ticketData.put("Entry Time", entryDateTime.format(formatter));

        return ticketData.toString();
    }
}
