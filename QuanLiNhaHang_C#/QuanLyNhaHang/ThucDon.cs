using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class ThucDon
    {
        // Automatic properties
        public string maTD { get; set; } // Primary Key
        public int giaTien { get; set; }
        public string maKhachHang { get; set; } // Foreign Key
        // constructor
        public ThucDon() { }
        public ThucDon(ThucDon TD)
        {
            this.maTD = TD.maTD;
            this.giaTien = TD.giaTien;
            this.maKhachHang = TD.maKhachHang;
            this.khachhang = TD.khachhang;
        }
        public ThucDon(string maTD, int giaTien, string maKhachHang, KhachHang khachhang)
        {
            this.maTD = maTD;
            this.giaTien = giaTien;
            this.maKhachHang = maKhachHang;
            this.khachhang = khachhang;
        }
        // related = singular
        public KhachHang khachhang { get; set; }
    }
}
