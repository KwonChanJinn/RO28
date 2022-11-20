package vn.com.vti.service;

import vn.com.vti.entity.Position;

import java.util.List;

public interface IPositionService {
    List<Position> getAllPositions();

    List<Position> getPositionByPositionName(String name);

    Position getPositionByID(int id);
}
