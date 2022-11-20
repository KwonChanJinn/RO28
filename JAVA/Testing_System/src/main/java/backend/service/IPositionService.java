package backend.service;

import entity.Position;

import java.sql.SQLException;
import java.util.List;

public interface IPositionService {

    // thằng này để taạo 1 cái gì đó chung chung vd chưa các method rồi cấc thằng khác thừa kế rồi pht sau

    // tạo 1 cái list chứa

    List<Position> getListPositions() throws SQLException;

}
