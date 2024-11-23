package mypack;

import java.time.LocalDate;

public class LichPhucVu {
	 // Automatic Properties
    public String maSoPhucVu; // Primary Key = Foreign Key
    public LocalDate ngay; // Primary Key
    public String soBan;
    public String maLoaiBan; // Foreign Key

    // Constructor
    public LichPhucVu() { }
    public LichPhucVu(LocalDate ngay, String maSoPhucVu, String soBan, String maLoaiBan,
         Ban ban)
    {
        this.ngay = ngay;
        this.maSoPhucVu = maSoPhucVu;          
        this.soBan = soBan;
        this.maLoaiBan = maLoaiBan;
        this.ban = ban;
    }
    public LichPhucVu(LichPhucVu lpv)
    {
        this.ngay = lpv.ngay;
        this.maSoPhucVu = lpv.maSoPhucVu;         
        this.soBan = lpv.soBan;
        this.maLoaiBan = lpv.maLoaiBan;
        this.ban = lpv.ban;
    }

    // Related = Single
    public Ban ban;
    
    // Getter - Setter
    public LocalDate getngay() {
    	return this.ngay;
    }
    public void setngay(LocalDate ngay) {
    	this.ngay = ngay;
    }
    
    public String getmaSoPhucVu() {
    	return this.maSoPhucVu;
    }
    public void setmaSoPhucVu(String maSoPhucVu) {
    	this.maSoPhucVu = maSoPhucVu;
    }
    
    public String getsoBan() {
    	return this.soBan;
    }
    public void setsoBan(String soBan) {
    	this.soBan = soBan;
    }
    
    public String getmaLoaiBan() {
    	return this.maLoaiBan;
    }
    public void setmaLoaiBan(String maLoaiBan) {
    	this.maLoaiBan = maLoaiBan;
    }
    
    public Ban getban() {
    	return this.ban;
    }
    public void setban(Ban ban) {
    	this.ban = ban;
    }
}
