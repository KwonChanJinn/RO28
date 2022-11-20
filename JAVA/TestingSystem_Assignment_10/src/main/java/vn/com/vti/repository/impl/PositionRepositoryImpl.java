package vn.com.vti.repository.impl;

import vn.com.vti.entity.Position;
import vn.com.vti.entity.PositionName;
import vn.com.vti.repository.IPositionRepository;

import java.util.List;

public class PositionRepositoryImpl implements IPositionRepository {
    @Override
    public List<Position> getAllPosition() {

        return null;
    }

    @Override
    public List<Position> getPositionByPositionName(String name) {

        return null;
    }

    @Override
    public Position getPositionByID(int id) {
        Position position = new Position();
        position.setId(1);
        position.setName(PositionName.DEV);
        return position;
    }


}
