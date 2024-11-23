package mypack;

public class ThucDonChiTiet
{
	// Automatic properties
	public String maTD;
	public String tenDoAn;
	public int soLuongDA;
	public int thanhTienDA;
	public String tenDoUong;
	public int soLuongDU;
	public int thanhTienDU;
	
	//Constructors
	public ThucDonChiTiet() { }
	public ThucDonChiTiet(ThucDonChiTiet TDCT)
	{
		this.maTD = TDCT.maTD;
		this.tenDoAn = TDCT.tenDoAn;
		this.soLuongDA = TDCT.soLuongDA;
		this.thanhTienDA = TDCT.thanhTienDA;
		this.tenDoUong = TDCT.tenDoUong;
		this.soLuongDU = TDCT.soLuongDU;
		this.thanhTienDU = TDCT.thanhTienDU;
		this.thucdon = TDCT.thucdon;
		this.doan = TDCT.doan;
		this.douong = TDCT.douong;
	}
	public ThucDonChiTiet(String maTD, String tenDoAn, int soLuongDA,
			int thanhTienDA, String tenDoUong, int soLuongDU, int thanhTienDU, 
			ThucDon thucdon, DoAn doan, DoUong douong)
	{
		this.maTD = maTD;
		this.tenDoAn = tenDoAn;
		this.soLuongDA = soLuongDA;
		this.thanhTienDA = thanhTienDA;
		this.tenDoUong = tenDoUong;
		this.soLuongDU = soLuongDU;
		this.thanhTienDU = thanhTienDU;
		this.thucdon = thucdon;
		this.doan = doan;
		this.douong = douong;
	}
	
	// related = singular
	public ThucDon thucdon;
	public DoAn doan;
	public DoUong douong;
	
	// getter - setter
	public String getMaTD()
	{ 
		return maTD;
	}
	public void setMaTD(String maTD)
	{
		this.maTD = maTD;
	}
	public String gettenDoAn()
	{
		return tenDoAn;
	}
	public void settenDoAn(String tenDoAn)
	{
		this.tenDoAn = tenDoAn;
	}
	public int getsoLuongDA()
	{
		return soLuongDA;
	}
	public void setsoLuongDA(int soLuongDA)
	{
		this.soLuongDA = soLuongDA;
	}
	public int getthanhTienDA()
	{
		return thanhTienDA;
	}
	public void setthanhTienDA(int thanhTienDA)
	{
		this.thanhTienDA = thanhTienDA;
	}
	public String gettenDoUong()
	{
		return tenDoUong;
	}
	public void settenDoUong(String tenDoUong)
	{
		this.tenDoUong = tenDoUong;
	}
	public int getsoLuongDU()
	{
		return soLuongDU;
	}
	public void setsoLuongDU(int soLuongDU)
	{
		this.soLuongDU = soLuongDU;
	}
	public int getthanhTienDU()
	{
		return thanhTienDU;
	}
	public void setthanhTienDU(int thanhTienDU)
	{
		this.thanhTienDU = thanhTienDU;
	}
	public ThucDon getThucdon()
	{
		return thucdon;
	}
	public void setThucdon(ThucDon thucdon)
	{
		this.thucdon = thucdon;
	}
	public DoAn getdoan()
	{
		return doan;
	}
	public void setdoan(DoAn doan)
	{
		this.doan = doan;
	}
	public DoUong getdouong()
	{
		return douong;
	}
	public void setdouong(DoUong douong)
	{
		this.douong = douong;
	}
}
