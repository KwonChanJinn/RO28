package backend.controller;

import backend.service.IPositionService;
import entity.Position;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionController {
    private final IPositionService iPositionService;

    public PositionController(IPositionService iPositionService) {
        this.iPositionService = iPositionService;
    }

    // trả về 1 danh sách gọi mà ko trả thì gọi làm gì

    public List<Position> getListPosition() throws SQLException {
        // tạo 1 cái list mới
        List<Position> positions = new ArrayList<>();
        try {
            positions = iPositionService.getListPositions();
        } catch (Exception e) {
            System.out.println("Lấy danh sách pos không thành công " + e.getMessage());
        }
        return positions;
    }
}
