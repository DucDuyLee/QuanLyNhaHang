using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class ThucDonChiTiet
    {
        // Automatic properties
        public string maTD { get; set; } // Primary Key
        public string tenDoAn { get; set; } // Primary Key
        public string tenDoUong { get; set; } // Primary Key
        public int soLuongDA { get; set; }
        public int thanhTienDA { get; set; }
        public int soLuongDU{ get; set; }
        public int thanhTienDU { get; set; }
        // constructor
        public ThucDonChiTiet() { }
        public ThucDonChiTiet(ThucDonChiTiet TDCT)
        {
            this.maTD           = TDCT.maTD;
            this.tenDoAn        = TDCT.tenDoAn;
            this.soLuongDA      = TDCT.soLuongDA;
            this.thanhTienDA    = TDCT.thanhTienDA;
            this.tenDoUong      = TDCT.tenDoUong;
            this.soLuongDU      = TDCT.soLuongDU;
            this.thanhTienDU    = TDCT.thanhTienDU;
            this.thucdon        = TDCT.thucdon;
            this.doan           = TDCT.doan;
            this.douong         = TDCT.douong;
        }
        public ThucDonChiTiet(string maTD, string tenDoAn, int soLuongDA, int thanhTienDA,
            string tenDoUong, int soLuongDU, int thanhTienDU,
            ThucDon thucdon, DoAn doan, DoUong douong)
        {
            this.maTD           = maTD;
            this.tenDoAn        = tenDoAn;
            this.soLuongDA      = soLuongDA;
            this.thanhTienDA    = thanhTienDA;
            this.tenDoUong      = tenDoUong;
            this.soLuongDU      = soLuongDU;
            this.thanhTienDU    = thanhTienDU;
            this.thucdon        = thucdon;
            this.doan           = doan;
            this.douong         = douong;
        }
        // related = singular
        public ThucDon thucdon { get; set; }
        public DoAn doan { get; set; }
        public DoUong douong { get; set; }
    }
}
