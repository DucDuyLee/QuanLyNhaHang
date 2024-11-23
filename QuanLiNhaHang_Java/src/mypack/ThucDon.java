package mypack;

public class ThucDon 
{
	// Automatic properties
	public String maTD;
	public int giaTien;
	public String maKhachHang;
	
	// Constructors
	public ThucDon() { }
	public ThucDon(ThucDon TD)
	{
		this.maTD = TD.maTD;
		this.giaTien = TD.giaTien;
		this.maKhachHang = TD.maKhachHang;
		this.khachhang = TD.khachhang;
	}
	public ThucDon(String maTD, int giaTien, String maKhachHang, KhachHang khachhang)
	{
		this.maTD = maTD;
		this.giaTien = giaTien;
		this.maKhachHang = maKhachHang;
		this.khachhang = khachhang;
	}
	
	// related = singular
	public KhachHang khachhang;
	
	// getter - setter
	public String getMaTD()
	{
		return maTD;
	}
	public void setMaTD(String maTD)
	{
		this.maTD = maTD;
	}
	public int getgiaTien()
	{
		return giaTien;
	}
	public void setgiaTien(int giaTien)
	{
		this.giaTien = giaTien;
	}
	public String getmaKhachHang()
	{
		return maKhachHang;
	}
	public void setmaKhachHang(String maKhachHang)
	{
		this.maKhachHang = maKhachHang;
	}
	public KhachHang getkhachhang()
	{
		return khachhang;
	}
	public void setkhachhang(KhachHang khachhang)
	{
		this.khachhang = khachhang;
	}
}
