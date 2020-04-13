/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class QLDS implements IQLDS
{  
    ArrayList<CaNhan> dsCaNhan= new ArrayList<>();           
    @Override
    public int them(CaNhan p) 
    {
        dsCaNhan.add(p);
        return 1;
    }
    @Override
    public int xoa(String ten) 
    {
        if (dsCaNhan.removeIf(cn -> (cn.Hoten == null ? ten == null : cn.Hoten.equals(ten)))) 
        {
      return 1;
    }
    return 0;
    }
    @Override
    public void inDS() 
    {
        dsCaNhan.forEach(cn -> cn.HienthiTT());
    }    
}
