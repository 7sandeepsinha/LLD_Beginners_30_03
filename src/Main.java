import projects.parkingLot.controller.TicketController;
import projects.parkingLot.dto.IssueTicketRequestDTO;
import projects.parkingLot.dto.IssueTicketResponseDTO;
import projects.parkingLot.models.ParkingLot;
import projects.parkingLot.models.VehicleType;
import projects.parkingLot.repository.*;
import projects.parkingLot.service.InitialisationService;
import projects.parkingLot.service.TicketService;

public class Main {

    private InitialisationService initialisationService;
    private TicketController ticketController;

    public Main() {
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        TicketRepository ticketRepository = new TicketRepository();
        GateRepository gateRepository = new GateRepository();
        ParkingFloorRepository parkingFloorRepository = new ParkingFloorRepository();
        ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

        this.initialisationService = new InitialisationService(gateRepository, parkingFloorRepository, parkingSpotRepository, parkingLotRepository);
        this.ticketController = new TicketController(new TicketService(ticketRepository, parkingLotRepository, gateRepository));
    }

    public static void main(String[] args) {
        Main main = new Main();
        ParkingLot parkingLot = main.initialisationService.initialise();
        IssueTicketRequestDTO issueTicketRequestDTO =
                new IssueTicketRequestDTO(VehicleType.Four_Wheeler, "ABCD1234", "Black", "Mercedez", 1);
        IssueTicketResponseDTO responseDTO = main.ticketController.getTicket(issueTicketRequestDTO);
        System.out.println(responseDTO);

    }
}