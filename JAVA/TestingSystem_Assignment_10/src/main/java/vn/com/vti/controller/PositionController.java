package vn.com.vti.controller;

import vn.com.vti.entity.Position;
import vn.com.vti.service.IPositionService;
import vn.com.vti.service.imp.PositionServiceImpl;

import java.util.List;

public class PositionController {

    private IPositionService positionService;

    public PositionController() {
        this.positionService = new PositionServiceImpl();
    }

    public List<Position> getAllPositions(){
        List<Position> positions = positionService.getAllPositions();
        return  positions;
    }

    public List<Position> getPositionByPositionName(String name) {

        return positionService.getPositionByPositionName(name);
    }

    public Position getPositionByID(int id) {
        return positionService.getPositionByID(id);
    }
}
