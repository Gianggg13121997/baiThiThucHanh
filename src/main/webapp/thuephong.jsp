<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quản Lý Thuê Phòng Trọ</title>
</head>
<body>
<h1>Danh Sách Thuê Phòng</h1>

<table border="1">
    <tr>
        <th>Mã Phòng</th>
        <th>Tên Người Thuê</th>
        <th>Số Điện Thoại</th>
        <th>Ngày Thuê</th>
        <th>Hình Thức Thanh Toán</th>
        <th>Ghi Chú</th>
    </tr>
    <c:forEach var="thuePhong" items="${danhSach}">
        <tr>
            <td>${thuePhong.id}</td>
            <td>${thuePhong.tenNguoiThue}</td>
            <td>${thuePhong.soDienThoai}</td>
            <td>${thuePhong.ngayThue}</td>
            <td>${thuePhong.hinhThucThanhToan.tenHinhThuc}</td>
            <td>${thuePhong.ghiChu}</td>
        </tr>
    </c:forEach>
</table>

<h2>Tạo Mới Thông Tin Thuê Phòng</h2>
<form action="thuePhong" method="post">
    Tên Người Thuê: <input type="text" name="tenNguoiThue" required/><br>
    Số Điện Thoại: <input type="text" name="soDienThoai" required/><br>
    Ngày Bắt Đầu Thuê: <input type="date" name="ngayThue" required/><br>
    Hình Thức Thanh Toán:
    <select name="hinhThucThanhToanId">
        <option value="1">Theo Tháng</option>
        <option value="2">Theo Quý</option>
        <option value="3">Theo Năm</option>
    </select><br>
    Ghi Chú: <input type="text" name="ghiChu"/><br>
    <input type="submit" value="Tạo Mới"/>
</form>
</body>
</html>