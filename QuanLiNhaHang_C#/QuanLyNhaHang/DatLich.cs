using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class DatLich
    {
        // Automatic properties
        public string maKhachHang { get; set; }
        public DateTime ngay { get; set; }
        public string maSoPhucVu { get; set; }
        // constructor
        public DatLich(string maKhachHang, DateTime ngay, string maSoPhucVu, LichPhucVu lichphucvu, KhachHang khachhang)
        {
            this.maSoPhucVu = maSoPhucVu;
            this.maKhachHang = maKhachHang;
            this.ngay = ngay;
            this.lichphucvu = lichphucvu;
            this.khachhang = khachhang;
        }
        // related = singular
        public LichPhucVu lichphucvu { get; set; }
        public KhachHang khachhang { get; set; }
    }
}
