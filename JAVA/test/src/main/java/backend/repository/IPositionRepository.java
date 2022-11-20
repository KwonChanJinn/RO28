package backend.repository;

import entity.Position;

import java.sql.SQLException;
import java.util.List;

public interface IPositionRepository {

    List<Position> getListPositions() throws SQLException;

    Position getDepartmentByID(int id) throws SQLException;



}
