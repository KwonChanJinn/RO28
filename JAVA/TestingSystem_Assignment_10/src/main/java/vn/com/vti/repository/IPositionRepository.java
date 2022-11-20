package vn.com.vti.repository;

import vn.com.vti.entity.Position;

import java.util.List;

public interface IPositionRepository {
    List<Position> getAllPosition();

    List<Position> getPositionByPositionName(String name);

    Position getPositionByID(int id);
}
