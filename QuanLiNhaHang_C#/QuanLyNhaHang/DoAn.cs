using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static QuanLyNhaHang.LoaiDoAn;

namespace QuanLyNhaHang
{
    public class DoAn
    {
        // Automatic properties
        public string tenDA { get; set; } // Primary Key
        public int donGia { get; set; }
        public Loai1 loaiDA { get; set; } // Foreign Key
        // constructor
        public DoAn() { }
        public DoAn(DoAn DA)
        {
            this.tenDA = DA.tenDA;
            this.donGia = DA.donGia;
            this.loaiDA = DA.loaiDA;
            this.LDA_DA = DA.LDA_DA;
        }
        public DoAn(string tenDA, int donGia, Loai1 loaiDA, LoaiDoAn LDA_DA)
        {
            this.tenDA = tenDA;
            this.donGia = donGia;
            this.loaiDA = loaiDA;
            this.LDA_DA = LDA_DA;
        }
        // related = singular
        public LoaiDoAn LDA_DA { get; set; }
    }
}
