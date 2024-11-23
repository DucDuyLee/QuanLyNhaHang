package mypack;

import java.util.ArrayList;
import java.util.List;

public class KhachHang 
{
	// Automatic Properties
	public String maKhachHang;
	public String tenKH;
	public String diaChi;
	public String soDienThoai;
	
	// Constructors
	public KhachHang() { }
	public KhachHang(KhachHang KH)
	{
		this.maKhachHang = KH.maKhachHang;
		this.tenKH = KH.tenKH;
		this.diaChi = KH.diaChi;
		this.soDienThoai = KH.soDienThoai;
	}
	public KhachHang(String maKhachHang, String tenKH, String diaChi,
			String soDienThoai)
	{
		this.maKhachHang = maKhachHang;
		this.tenKH = tenKH;
		this.diaChi = diaChi;
		this.soDienThoai = soDienThoai;
	}
	
	
	// getter -setter
	public String getmaKhachHang()
	{
		return maKhachHang;
	}
	public void setmaKhachHang(String maKhachHang)
	{
		this.maKhachHang = maKhachHang;
	}
	public String getTenKH()
	{
		return tenKH;
	}
	public void setTenKH(String tenKH)
	{
		this.tenKH = tenKH;
	}
	public String getDiaChi()
	{
		return diaChi;
	}
	public void setDiaChi(String diaChi)
	{
		this.diaChi = diaChi;
	}
	public String getSoDienThoai()
	{
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai)
	{
		this.soDienThoai = soDienThoai;
	}
}
