/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ogrenciServlet;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Toshiba
 */
public class ogrenciBean implements Serializable {
    
    
    
    private String ogrenciNo, ogrenciAd, ogrenciSoyad, ogrenciEposta;
    
    public ogrenciBean() 
    {
        ;
    }
    
    
    
    public ogrenciBean(String ogrenciNo, String ogrenciAd, String ogrenciSoyad,  String ogrenciEposta ) 
    {
        
        this.ogrenciNo = ogrenciNo;
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
      
        this.ogrenciEposta = ogrenciEposta;
    }
    
    public void setOgrenciNo(String ogrenciNo)           
    {
        this.ogrenciNo = ogrenciNo;
        
    }
    
    public void setOgrenciAd(String ogrenciAd)           
    {
        this.ogrenciAd = ogrenciAd;
        
    }
    
    public void setOgrenciSoyad(String ogrenciSoyad)           
    {
        this.ogrenciSoyad = ogrenciSoyad;
        
    }
    
    
    
    public void setOgrenciEposta(String ogrenciEposta)           
    {
        this.ogrenciEposta = ogrenciEposta;
        
    }
    
    public String getOgrenciNo()
    {
        return this.ogrenciNo;
        
    }
    
    public String getOgrenciAd()
    {
        return this.ogrenciAd;
        
    }
    
    public String getOgrenciSoyad()
    {
        return this.ogrenciSoyad;
        
    }
    
    
    
    public String getOgrenciEposta()
    {
        return this.ogrenciEposta;
        
    }
    
}
