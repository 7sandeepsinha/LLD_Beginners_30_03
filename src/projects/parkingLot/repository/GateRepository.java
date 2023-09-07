package projects.parkingLot.repository;

import projects.parkingLot.exception.GateNotFoundException;
import projects.parkingLot.models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    private Map<Integer, Gate> gateMap;

    public GateRepository() {
        this.gateMap = new HashMap<>();
    }

    public Gate get(int gateId){
        Gate gate  = gateMap.get(gateId);
        if(gate == null){
            throw new GateNotFoundException("Gate not found for : "
                    + gate);
        }
        return gate;
    }

    public void put(Gate gate) {
        gateMap.put(gate.getId(), gate);
    }
}
