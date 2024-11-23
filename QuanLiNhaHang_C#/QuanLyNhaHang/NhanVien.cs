using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class NhanVien
    {
        // Automatic Properties
        public string maNhanVien { get; set; } // Primary Key
        public string tenNV { get; set; }
        public string diaChi { get; set; }
        public double Luong { get; set; }
        public string soDT { get; set; }
        public int loaiNV { get; set; }

        // Constructor
        public NhanVien() { }
        public NhanVien(string maNhanVien, string tenNV, string diaChi, double Luong,
            string soDT, int loaiNV)
        {
            this.maNhanVien = maNhanVien;
            this.tenNV = tenNV;
            this.diaChi = diaChi;
            this.Luong = Luong;
            this.soDT = soDT;
            this.loaiNV = loaiNV;
        }
        public NhanVien(NhanVien nv)
        {
            this.maNhanVien = nv.maNhanVien;
            this.tenNV = nv.tenNV;
            this.diaChi = nv.diaChi;
            this.Luong = nv.Luong;
            this.soDT = nv.soDT;
            this.loaiNV = nv.loaiNV;
        }
    }
}
