package mypack;

import java.util.ArrayList;
import java.util.List;

enum Loai2
{
	Nuoc_Uong_Co_Gas,
	Nuoc_Uong_Khong_Gas,
	Nuoc_Ep,
	Nuoc_Khoang
}

public class LoaiDoUong
{
	// Automatic properties
	public Loai2 LoaiDU;
	public int Min2;
	public int Max2;
	
	// Constructors
	public LoaiDoUong() { }
	public LoaiDoUong(LoaiDoUong LDU)
	{
		this.LoaiDU = LDU.LoaiDU;
		this.Min2 = LDU.Min2;
		this.Max2 = LDU.Max2;
		this.dsDU_LDU = LDU.dsDU_LDU;
	}
	public LoaiDoUong(Loai2 LoaiDU, int Min2, int Max2,
			ArrayList<DoUong> dsDU_LDU)
	{
		this.LoaiDU = LoaiDU;
		this.Min2 = Min2;
		this.Max2 = Max2;
		this.dsDU_LDU = dsDU_LDU;
	}
	
	// related - plural
	public List<DoUong> dsDU_LDU;
	
	// getter - setter
	public Loai2 getLoaiDU()
	{
		return LoaiDU;
	}
	public void setLoaiDU(Loai2 LoaiDU)
	{
		this.LoaiDU = LoaiDU;
	}
	public int getMin2()
	{
		return Min2;
	}
	public void setMin2(int Min2)
	{
		this.Min2 = Min2;
	}
	public int getMax2()
	{
		return Max2;
	}
	public void setMax2(int Max2)
	{
		this.Max2 = Max2;
	}
	public List<DoUong> getdsDU_LDU()
	{
		return dsDU_LDU;
	}
	public void setdsDU_LDU(List<DoUong> dsDU_LDU)
	{
		this.dsDU_LDU = dsDU_LDU;
	}
}
