package backend.repository;

import entity.Position;

import java.sql.SQLException;
import java.util.List;

public interface IPositionRepository {
    // thằng này là thằng cuối để liên kết với dtb đổ vào db để lấy dl về

    // tạo 1 cái gì đó để chứa dl về

    List<Position> getListPositions() throws SQLException;

}
