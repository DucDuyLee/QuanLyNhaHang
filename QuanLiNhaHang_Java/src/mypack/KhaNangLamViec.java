package mypack;

public class KhaNangLamViec {
	// Automatic properties
	public String maNV; // primary key = Foreign Key
	public String maLoaiBan; // primary key = Foreign Key

	// constructor
	public KhaNangLamViec(String maNV, String maLoaiBan, LoaiBan loaiban, NhanVien nhanvien) {
		this.maLoaiBan = maLoaiBan;
		this.maNV = maNV;
		this.nhanvien = nhanvien;
		this.loaiban = loaiban;
	}

	// related = singular
	public NhanVien nhanvien;
	public LoaiBan loaiban;

	// getter -setter
	public String getmaLoaiBan() {
		return maLoaiBan;
	}

	public void setmaLoaiBan(String maLoaiBan) {
		this.maLoaiBan = maLoaiBan;
	}

	public String getManv() {
		return maNV;
	}

	public void setManv(String maNV) {
		this.maNV = maNV;
	}

	public NhanVien getNhanvien() {
		return nhanvien;
	}

	public void setNhanvien(NhanVien nhanvien) {
		this.nhanvien = nhanvien;
	}

	public LoaiBan getLoaiBan() {
		return loaiban;
	}

	public void setLoaiBan(LoaiBan loaiban) {
		this.loaiban = loaiban;
	}
}
