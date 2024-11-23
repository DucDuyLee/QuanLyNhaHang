package mypack;

import java.util.ArrayList;
import java.util.List;

enum Loai1
{
	Trang_Mieng,
	Thuc_An_Nhanh,
	Do_Man,
	Do_Chay
}

public class LoaiDoAn 
{
	// Automatic properties
	public Loai1 LoaiDA;
	public int Min1;
	public int Max1;
	
	// Constructors
	public LoaiDoAn() { }
	public LoaiDoAn(LoaiDoAn LDA)
	{
		this.LoaiDA = LDA.LoaiDA;
		this.Min1 = LDA.Min1;
		this.Max1 = LDA.Max1;
		this.dsDA_LDA = LDA.dsDA_LDA;
	}
	public LoaiDoAn(Loai1 LoaiDA, int Min1, int Max1,
			ArrayList<DoAn> dsDA_LDA)
	{
		this.LoaiDA = LoaiDA;
		this.Min1 = Min1;
		this.Max1 = Max1;
		this.dsDA_LDA = dsDA_LDA;
	}
	
	// related - plural
	public List<DoAn> dsDA_LDA;
	
	// getter - setter
	public Loai1 getLoaiDA()
	{
		return LoaiDA;
	}
	public void setLoaiDA(Loai1 LoaiDA)
	{
		this.LoaiDA = LoaiDA;
	}
	public int getMin1()
	{
		return Min1;
	}
	public void setMin1(int Min1)
	{
		this.Min1 = Min1;
	}
	public int getMax1()
	{
		return Max1;
	}
	public void setMax1(int Max1)
	{
		this.Max1 = Max1;
	}
	public List<DoAn> getdsDA_LDA()
	{
		return dsDA_LDA;
	}
	public void setdsDA_LDA(List<DoAn> dsDA_LDA)
	{
		this.dsDA_LDA = dsDA_LDA;
	}
}

