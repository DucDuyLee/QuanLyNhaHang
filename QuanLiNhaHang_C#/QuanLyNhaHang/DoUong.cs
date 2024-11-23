using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static QuanLyNhaHang.LoaiDoAn;

namespace QuanLyNhaHang
{
    public class DoUong
    {
        // Automatic properties
        public string tenDU { get; set; } // Primary Key
        public int donGia { get; set; }
        public Loai2 LoaiDU { get; set; } // Foreign Key
        // constructor
        public DoUong() { }
        public DoUong(DoUong TU)
        {
            this.tenDU = TU.tenDU;
            this.donGia = TU.donGia;
            this.LoaiDU = TU.LoaiDU;
            this.LDU_DU = TU.LDU_DU;
        }
        public DoUong(string tenDU, int donGia, Loai2 LoaiDU, LoaiDoUong LDU_DU)
        {
            this.tenDU = tenDU;
            this.donGia = donGia;
            this.LoaiDU = LoaiDU;
            this.LDU_DU = LDU_DU;
        }
        // related = singular
        public LoaiDoUong LDU_DU { get; set; }
    }
}
