package backend.service.impl;

import backend.repository.IPositionRepository;
import backend.service.IPositionService;
import entity.Position;

import java.sql.SQLException;
import java.util.List;

public class PositionServiceImpl implements IPositionService {
    // muốn có dl đổ về phải cho nó xuống thằng Repository

    private final IPositionRepository positionRepository;

    public PositionServiceImpl(IPositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    @Override
    public List<Position> getListPositions() throws SQLException {
        return positionRepository.getListPositions();
    }
    // vô đây thể hiện tính thừa kê cho nó
}
