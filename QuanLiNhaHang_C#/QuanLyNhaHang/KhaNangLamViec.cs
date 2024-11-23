using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class KhaNangLamViec
    {
        // Automatic properties
        public string maNV { get; set; } // primary key = Foreign Key
        public string maLoaiBan { get; set; } // primary key = Foreign Key

        // constructor
        public KhaNangLamViec(string maNV, string maLoaiBan, LoaiBan loaiban, NhanVien nhanvien)
        {
            this.maLoaiBan = maLoaiBan;
            this.maNV = maNV;
            this.nhanvien = nhanvien;
            this.loaiban = loaiban;
        }
        // related = singular 
        public NhanVien nhanvien { get; set; }
        public LoaiBan loaiban { get; set; }
    }
}
