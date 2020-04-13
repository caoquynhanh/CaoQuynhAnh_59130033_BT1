/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author Asus
 */
public class GiaoVien extends CaNhan
{
    String monDay;
    String toBoMon;

    public GiaoVien() 
    {}
    
    public GiaoVien(String monDay, String toBoMon, String Hoten, int Tuoi, String DiaChi, String Sdt) 
    {
        super(Hoten, Tuoi, DiaChi, Sdt);
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    public GiaoVien(String monDay, String toBoMon) 
    {
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }

    @Override
    public String HienthiTT() 
    {
       return "Họ tên giaovien: "   +Hoten+
                ";Tuổi: "           +Tuoi+
                ";Địa chỉ: "        +DiaChi+
                ";Số điện thoại: "  +Sdt+
                ";Mon day: "        +monDay+
                "To bo mon: "       +toBoMon;
    }
    
}
