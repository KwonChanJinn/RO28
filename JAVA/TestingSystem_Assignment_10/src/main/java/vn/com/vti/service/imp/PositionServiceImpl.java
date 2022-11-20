package vn.com.vti.service.imp;

import vn.com.vti.entity.Position;
import vn.com.vti.repository.IPositionRepository;
import vn.com.vti.repository.impl.PositionRepositoryImpl;
import vn.com.vti.service.IPositionService;

import java.util.List;

public class PositionServiceImpl implements IPositionService {

    private IPositionRepository positionRepository;

    public PositionServiceImpl() {
        this.positionRepository = new PositionRepositoryImpl();
    }

    @Override
    public List<Position> getAllPositions() {
        List<Position> positions = positionRepository.getAllPosition();
        return positions;
    }

    @Override
    public List<Position> getPositionByPositionName(String name) {
        return positionRepository.getPositionByPositionName(name);
    }

    @Override
    public Position getPositionByID(int id) {
        return positionRepository.getPositionByID(id);
    }
}
