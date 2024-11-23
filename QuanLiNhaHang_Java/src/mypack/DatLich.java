package mypack;

import java.time.LocalDate;

public class DatLich 
{
	// Automatic properties
	public String maKhachHang;
	public LocalDate ngay;
	public String maSoPhucVu;
	
	// Constructors
	public DatLich() { }
	public DatLich(DatLich DL)
	{
		this.maKhachHang = DL.maKhachHang;
		this.ngay = DL.ngay;
		this.maSoPhucVu = DL.maSoPhucVu;
		this.lichphucvu = DL.lichphucvu;
		this.khachhang = DL.khachhang;
	}
	public DatLich(String maKhachHang, LocalDate ngay, String maSoPhucVu,
			LichPhucVu lichphucvu, KhachHang khachhang)
	{
		this.maKhachHang = maKhachHang;
		this.ngay = ngay;
		this.maSoPhucVu = maSoPhucVu;
		this.lichphucvu = lichphucvu;
		this.khachhang = khachhang;
	}
	
	// related = singular
	public LichPhucVu lichphucvu;
	public KhachHang khachhang;
	
	// getter - setter
	public String getmaKhachHang()
	{
		return maKhachHang;
	}
	public void setmaKhachHang(String maKhachHang)
	{
		this.maKhachHang = maKhachHang;
	}
	public LocalDate getNgay()
	{
		return ngay;
	}
	public void setNgay(LocalDate ngay)
	{
		this.ngay = ngay;
	}
	public String getmaSoPhucVu()
	{
		return maSoPhucVu;
	}
	public void setmaSoPhucVu(String maSoPhucVu)
	{
		this.maSoPhucVu = maSoPhucVu;
	}
	public LichPhucVu getLichPhucVu()
	{
		return lichphucvu;
	}
	public void setLichPhucVu(LichPhucVu lichphucvu)
	{
		this.lichphucvu = lichphucvu;
	}
	public KhachHang getkhachHang()
	{
		return khachhang;
	}
	public void setkhachHang(KhachHang khachhang)
	{
		this.khachhang = khachhang;
	}
}
