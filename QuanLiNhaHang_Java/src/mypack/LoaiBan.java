package mypack;

import java.util.ArrayList;
import java.util.List;

public class LoaiBan {
	
	// Automatic Properties
    public String maLoaiBan; // Primary Key
    public String hangSanXuat;

    // Constructor
    public LoaiBan() { }
    public LoaiBan(String maLoaiBan, String hangSanXuat, ArrayList<Ban> dsLoaiBan)
    {
        this.maLoaiBan = maLoaiBan;
        this.hangSanXuat = hangSanXuat;
        this.dsLoaiBan = dsLoaiBan;
    }
    public LoaiBan(LoaiBan lb)
    {
        this.maLoaiBan = lb.maLoaiBan;
        this.hangSanXuat = lb.hangSanXuat;
        this.dsLoaiBan = lb.dsLoaiBan;
    }

    // Related = Plural
    public List<Ban> dsLoaiBan;
    
    // Getter - Setter
    public String getmaLoaiBan() {
    	return this.maLoaiBan;
    }
    public void setmaLoaiBan(String maLoaiBan) {
    	this.maLoaiBan = maLoaiBan;
    }
    
    public String gethangSanXuat() {
    	return this.hangSanXuat;
    }
    public void sethangSanXuat(String hangSanXuat) {
    	this.hangSanXuat = hangSanXuat;
    }
    
    public List<Ban> getdsLoaiBan() {
    	return this.dsLoaiBan;
    }
    public void setdsLoaiBan(List<Ban> dsLoaiBan) {
    	this.dsLoaiBan = dsLoaiBan;
    }
}

