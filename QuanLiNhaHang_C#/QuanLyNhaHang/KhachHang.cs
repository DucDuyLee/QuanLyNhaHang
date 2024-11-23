using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class KhachHang
    {
        // Automatic properties
        public string maKhachHang { get; set; }
        public string tenKH { get; set; }
        public string diaChi { get; set; }
        public string soDienThoai { get; set; }
        // Constructor
        public KhachHang() { }
        public KhachHang(KhachHang KH)
        {
            this.maKhachHang = KH.maKhachHang;
            this.tenKH = KH.tenKH;
            this.diaChi = KH.diaChi;
            this.soDienThoai = KH.soDienThoai;
        }
        public KhachHang(string maKhachHang, string tenKH, string diaChi, string soDienThoai)
        {
            this.maKhachHang = maKhachHang;
            this.tenKH = tenKH;
            this.diaChi = diaChi;
            this.soDienThoai = soDienThoai;
        }

    }
}
