using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class PhanCong
    {
        // Automatic Properties
        public string maSoPhucVu { get; set; }
        public DateTime ngay { get; set; }
        public string maNV { get; set; }

        // Constructor
        public PhanCong(string maNV, DateTime ngay, string maSoPhucVu, LichPhucVu lichphucvu, NhanVien nhanvien)
        {
            this.maSoPhucVu = maSoPhucVu;
            this.maNV = maNV;
            this.ngay = ngay;
            this.lichphucvu = lichphucvu;
            this.nhanvien = nhanvien;
        }

        // related = singular
        public LichPhucVu lichphucvu { get; set; }
        public NhanVien nhanvien { get; set; }
    }
}
