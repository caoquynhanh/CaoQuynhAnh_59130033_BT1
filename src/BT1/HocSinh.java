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
public class HocSinh extends CaNhan
{
    String Lop;
    String Nangkhieu;
    public HocSinh(String Lop, String Nangkhieu, String Hoten, int Tuoi, String DiaChi, String Sdt) 
    {
        super(Hoten, Tuoi, DiaChi, Sdt);
        this.Lop = Lop;
        this.Nangkhieu = Nangkhieu;
    }
    public HocSinh(String Lop, String Nangkhieu) 
    {
        this.Lop = Lop;
        this.Nangkhieu = Nangkhieu;
    }
    public HocSinh()
    {
        super();
        this.Lop = "";
        this.Nangkhieu = "";
    }
    @Override
    public String HienthiTT() 
    {
      return "Họ tên học sinh: "    +Hoten+
                ";Tuổi: "           +Tuoi+
                ";Địa chỉ: "        +DiaChi+
                ";Số điện thoại: "  +Sdt+
                ";Lớp: "            +Lop+
                ";Năng khiếu: "     +Nangkhieu;
    }  
}
