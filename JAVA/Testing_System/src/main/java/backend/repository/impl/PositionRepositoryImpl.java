package backend.repository.impl;

import backend.repository.IPositionRepository;
import backend.service.impl.PositionServiceImpl;
import backend.ultis.DatabaseUtils;
import entity.Position;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements IPositionRepository {
    // tạo mới 1 phương thức mà ko cần đung new
    private final Connection con = DatabaseUtils.getInstance().getDatabaseConnection();


    @Override
    public List<Position> getListPositions() throws SQLException {
        //tạo 1 cái gì đó để chứa dl đổ về

        List<Position> positions = new ArrayList<>();

        // tạo 1 câu lệnh
        String sql = "Select * from position ";
        // tiếp theo đưa nó vào 1 cái hàm statesment
        Statement st = con.createStatement();
        // tạo 1 cái gì đó để bắt đầu truy cập dl
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            Position position = new Position();
            position.setId(rs.getInt("1"));
            return positions;
        }
        return positions;
    }

    public static void main(String[] args) throws SQLException {
        PositionRepositoryImpl ac = new PositionRepositoryImpl();
        List<Position> ls = ac.getListPositions();
        for (Position account: ls) {
            System.out.println(account);
        }
    }
    // thằng này muốn lấy dl từ databassr thì phỉa liên kết với databasse


}
