package projects.parkingLot.controller;

import projects.parkingLot.dto.IssueTicketRequestDTO;
import projects.parkingLot.dto.IssueTicketResponseDTO;
import projects.parkingLot.dto.ResponseStatus;
import projects.parkingLot.exception.InvalidRequestDataException;
import projects.parkingLot.models.Ticket;
import projects.parkingLot.service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO getTicket(IssueTicketRequestDTO issueTicketRequestDTO){
        IssueTicketResponseDTO issueTicketResponseDTO = new IssueTicketResponseDTO();
        Ticket ticket;
        try{
            if(issueTicketRequestDTO.getGateId() == 0 ||
            issueTicketRequestDTO.getVehicleType() == null ||
            issueTicketRequestDTO.getVehicleNumber() == null ) {
                throw new InvalidRequestDataException("Ticket generation request data is invalid");
            }
            ticket = ticketService.getTicket(issueTicketRequestDTO.getVehicleType(),
                    issueTicketRequestDTO.getVehicleNumber(),
                    issueTicketRequestDTO.getVehicleColor(),
                    issueTicketRequestDTO.getVehicleMake(),
                    issueTicketRequestDTO.getGateId());
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            issueTicketResponseDTO.setTicket(ticket);
        } catch (Exception e ){
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
            issueTicketResponseDTO.setFailureReason(e.getMessage());
        }

        return issueTicketResponseDTO;
    }
}

