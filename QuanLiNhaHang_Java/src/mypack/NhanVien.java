package mypack;

public class NhanVien {
	// Automatic Properties
	public String maNhanVien; // Primary Key
	public String tenNV;
	public String diaChi;
	public double Luong;
	public String soDT;
	public int loaiNV;

	// Constructor
	public NhanVien() {
	}

	public NhanVien(String maNhanVien, String tenNV, String diaChi, double Luong, String soDT, int loaiNV) {
		this.maNhanVien = maNhanVien;
		this.tenNV = tenNV;
		this.diaChi = diaChi;
		this.Luong = Luong;
		this.soDT = soDT;
		this.loaiNV = loaiNV;
	}

	public NhanVien(NhanVien nv) {
		this.maNhanVien = nv.maNhanVien;
		this.tenNV = nv.tenNV;
		this.diaChi = nv.diaChi;
		this.Luong = nv.Luong;
		this.soDT = nv.soDT;
		this.loaiNV = nv.loaiNV;
	}

	// getter -setter
	public String getmaNhanVien() {
		return maNhanVien;
	}

	public void setmaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTennv() {
		return tenNV;
	}

	public void setTennv(String tenNV) {
		this.tenNV = tenNV;
	}

	public String getDiachi() {
		return diaChi;
	}

	public void setDiachi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getLuong() {
		return Luong;
	}

	public void setLuong(double Luong) {
		this.Luong = Luong;
	}

	public String getSodt() {
		return soDT;
	}

	public void setSodt(String soDT) {
		this.soDT = soDT;
	}

	public int getLoainv() {
		return loaiNV;
	}

	public void setLoainv(int loaiNV) {
		this.loaiNV = loaiNV;
	}
}
