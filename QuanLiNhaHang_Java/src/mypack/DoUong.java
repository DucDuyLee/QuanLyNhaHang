package mypack;

public class DoUong 
{
	// Automatic properties
	public String tenDU;
	public int donGia;
	public Loai2 loaiDU;
	
	// Constructors
	public DoUong() { }
	public DoUong(DoUong DU)
	{
		this.tenDU = DU.tenDU;
		this.donGia = DU.donGia;
		this.loaiDU = DU.loaiDU;
		this.LDU_DU = DU.LDU_DU;
	}
	public DoUong(String tenDU, int donGia, Loai2 loaiDU,
			LoaiDoUong LDU_DU)
	{
		this.tenDU = tenDU;
		this.donGia = donGia;
		this.loaiDU = loaiDU;
		this.LDU_DU = LDU_DU;
	}
	
	// related = singular
	public LoaiDoUong LDU_DU;
	
	// getter - setter
	public String getTenDU()
	{
		return tenDU;
	}
	public void setTenDU(String tenDU)
	{
		this.tenDU = tenDU;
	}
	public int getDonGia()
	{
		return donGia;
	}
	public void setDonGia(int donGia)
	{
		this.donGia = donGia;
	}
	public Loai2 getLoaiDU()
	{
		return loaiDU;
	}
	public void setLoaiDU(Loai2 loaiDU)
	{
		this.loaiDU = loaiDU;
	}
	public LoaiDoUong getLDU_DU()
	{
		return LDU_DU;
	}
	public void setLDU_DU(LoaiDoUong LDU_DU)
	{
		this.LDU_DU = LDU_DU;
	}
	
}
