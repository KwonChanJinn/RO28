package backend.controller;

import backend.service.IPositionService;
import entity.Position;

import java.util.ArrayList;
import java.util.List;

public class PositionController {
    // trỏ xuống thằng service lấy dl lên

    private final IPositionService positionService ;


    public PositionController(IPositionService positionService) {
        this.positionService = positionService;
    }


    // như này tạm xong
    public List<Position> getListPositions() {
        // tạo 1 cái list mới
        List<Position> positions = new ArrayList<>();
        try {
            positions = positionService.getListPositions();
        } catch (Exception e) {
            System.out.println("Lấy danh sách account không thành công " + e.getMessage());
        }
        return positions;
    }

}
