package mypack;

import java.util.ArrayList;
import java.util.List;

public class Ban 
{
	// Automatic Properties
    public String soBan; // Primary Key
    public String maLoaiBan; // Primary Key = Foreign Key

    // Constructor
    public Ban() { }
    public Ban(String soBan, String maLoaiBan,
    		LoaiBan loaiban, ArrayList<LichPhucVu> dslichphucvu )
    {
        this.soBan = soBan;
        this.maLoaiBan = maLoaiBan;         
        this.loaiban = loaiban;
        this.dslichphucvu = dslichphucvu;
    }
    public Ban(Ban mb)
    {
        this.soBan = mb.soBan;
        this.maLoaiBan = mb.maLoaiBan;         
        this.loaiban = mb.loaiban;
        this.dslichphucvu = mb.dslichphucvu;
    }

    // Related = Singular
    public LoaiBan loaiban;
    // Related = Plural
    public List<LichPhucVu> dslichphucvu;
    
    // Getter - Setter
    public String getSoBan() {
    	return this.soBan;
    }
    public void setSoBan(String soBan) {
    	this.soBan = soBan;
    }
    
    public String getMaLoaiBan() {
    	return this.maLoaiBan;
    }
    public void setMaLoaiBan(String maLoaiBan) {
    	this.maLoaiBan = maLoaiBan;
    }
    
    public LoaiBan getLoaiBan() {
    	return this.loaiban;
    }
    public void setLoaiBan(LoaiBan loaiban) {
    	this.loaiban = loaiban;
    }
    
    public List<LichPhucVu> getDslichphucvu() {
    	return this.dslichphucvu;
    }
    public void setDslichphucvu(List<LichPhucVu> dslichphucvu) {
    	this.dslichphucvu = dslichphucvu;
    }
}
