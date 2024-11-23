package mypack;

import java.time.LocalDate;

public class PhanCong {
	 // Automatic Properties
    public String maSoPhucVu;
    public LocalDate ngay;
    public String maNV;

    // Constructor
    public PhanCong(String maNV, LocalDate ngay, String maSoPhucVu, LichPhucVu lichphucvu, NhanVien nhanvien)
    {
        this.maSoPhucVu = maSoPhucVu;
        this.maNV = maNV;
        this.ngay = ngay;
        this.lichphucvu = lichphucvu;
        this.nhanvien = nhanvien;
    }

    // Related = Singular
    public LichPhucVu lichphucvu;
    public NhanVien nhanvien;
    
    // Getter - Setter
    public String getmaSoPhucVu() {
		return this.maSoPhucVu;
	}
	public void setmaSoPhucVu(String maSoPhucVu) {
		this.maSoPhucVu = maSoPhucVu;
	}
	
	public String getMaNV() {
		return this.maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	
	public LocalDate getNgay() {
		return this.ngay;
	}
	public void setNgay(LocalDate ngay) {
		this.ngay = ngay;
	}
	
	public LichPhucVu getLichPhucVu() {
		return this.lichphucvu;
	}
	public void setLichPhucVu(LichPhucVu lichphucvu) {
		this.lichphucvu = lichphucvu;
	}
	
	public NhanVien getNhanvien() {
		return this.nhanvien;
	}
	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}
}
