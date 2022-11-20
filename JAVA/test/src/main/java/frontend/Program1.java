package frontend;

import backend.controller.PositionController;
import backend.repository.impl.PositionRepositoryImpl;
import backend.service.impl.PositionServiceImpl;
import entity.Position;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) throws SQLException {

        Program1 p = new Program1();
        p.question();

    }

    public void question() throws SQLException {
        PositionRepositoryImpl repository = new PositionRepositoryImpl();
        PositionServiceImpl service = new PositionServiceImpl(repository);
        PositionController controller = new PositionController(service);

        List<Position> ls = controller.getListPosition();
        for (Position account : ls) {
            System.out.println(account);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("nhaaoj id ");
        System.out.println(repository.getDepartmentByID(scanner.nextInt()));
    }


}
