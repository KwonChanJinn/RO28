package backend.service.impl;

import backend.repository.IPositionRepository;
import backend.service.IPositionService;
import entity.Position;

import java.sql.SQLException;
import java.util.List;

public class PositionServiceImpl implements IPositionService {

    private final IPositionRepository iPositionRepository;

    public PositionServiceImpl(IPositionRepository iPositionRepository) {
        this.iPositionRepository = iPositionRepository;
    }

    @Override
    public List<Position> getListPositions() throws SQLException {
        return iPositionRepository.getListPositions();
    }
}
