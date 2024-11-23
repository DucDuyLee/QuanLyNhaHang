package mypack;

public class DoAn
{
	// Automatic properties
	public String tenDA;
	public int donGia;
	public Loai1 LoaiDA;
	
	// Constructors
	public DoAn() { }
	public DoAn(DoAn DA)
	{
		this.tenDA = DA.tenDA;
		this.donGia = DA.donGia;
		this.LoaiDA = DA.LoaiDA;
		this.LDA_DA = DA.LDA_DA;
	}
	public DoAn(String tenDA, int donGia, Loai1 LoaiDA,
			LoaiDoAn LDA_DA)
	{
		this.tenDA = tenDA;
		this.donGia = donGia;
		this.LoaiDA = LoaiDA;
		this.LDA_DA = LDA_DA;
	}
	
	// related singular
	public LoaiDoAn LDA_DA;
	
	// getter - setter
	public String getTenDA()
	{
		return tenDA;
	}
	public void setTenDA(String tenDA)
	{
		this.tenDA = tenDA;
	}
	public int getDonGia()
	{
		return donGia;
	}
	public void setDonGia(int donGia)
	{
		this.donGia = donGia;
	}
	public Loai1 getLoaiDA()
	{
		return LoaiDA;
	}
	public void setLoaiDA(Loai1 LoaiDA)
	{
		this.LoaiDA = LoaiDA;
	}
	public LoaiDoAn getLDA_DA()
	{
		return LDA_DA;
	}
	public void setLDA_DA(LoaiDoAn LDA_DA)
	{
		this.LDA_DA = LDA_DA;
	}
}
