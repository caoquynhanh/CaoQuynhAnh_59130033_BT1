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
public abstract class CaNhan 
{
    String Hoten;
    int Tuoi;
    String DiaChi;
    String Sdt;

    public CaNhan(String Hoten, int Tuoi, String DiaChi, String Sdt) 
    {
        this.Hoten = Hoten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
    }

    public CaNhan() 
    {}
    public String getHoten() 
    {
        return Hoten;
    }
    public void setHoten(String Hoten) 
    {
        this.Hoten = Hoten;
    }
    public int getTuoi() 
    {
        return Tuoi;
    }
    public void setTuoi(int Tuoi) 
    {
        this.Tuoi = Tuoi;
    }
    public String getDiaChi() 
    {
        return DiaChi;
    }
    public void setDiaChi(String DiaChi) 
    {
        this.DiaChi = DiaChi;
    }
    public String getSdt() 
    {
        return Sdt;
    }
    public void setSdt(String Sdt) 
    {
        this.Sdt = Sdt;
    }
  public abstract String HienthiTT();   
}
