package frontend;

import backend.controller.PositionController;
import backend.repository.IPositionRepository;
import backend.repository.impl.PositionRepositoryImpl;
import backend.service.impl.PositionServiceImpl;
import entity.Position;

import java.sql.SQLException;
import java.util.List;

public class Program1 {
    public static void main(String[] args) throws SQLException {
        System.out.println("B1");

        PositionController repository = new PositionController();
        PositionServiceImpl service = new PositionServiceImpl( repository);
        PositionRepositoryImpl controller = new PositionRepositoryImpl(service);

        List<Position> ls = controller.getListPositions();
        for (Position position: ls) {
            System.out.println(position);
        }
    }
}
