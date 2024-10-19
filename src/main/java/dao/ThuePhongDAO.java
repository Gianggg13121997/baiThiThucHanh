package dao;

import jdk.internal.jimage.ImageStream;
import model.HinhThucThanhToan;
import model.ThongTinThuePhong;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ThuePhongDAO {
    private Connection connection;

    public ThuePhongDAO() {
        connection = ConnectionToMySQL.getConnection();
    }


}
