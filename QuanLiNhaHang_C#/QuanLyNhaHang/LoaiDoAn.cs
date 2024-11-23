using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class LoaiDoAn
    {
        public enum Loai1
        {
            Trang_Mieng,
            Thuc_An_Nhanh,
            Do_Man,
            Do_Chay
        }
        // Automatic properties
        public Loai1 loaiDA { get; set; } // Primary Key
        public int MIN1 { get; set; }
        public int MAX1 { get; set; }
        // constructor
        public LoaiDoAn() { }
        public LoaiDoAn(LoaiDoAn LDA)
        {
            this.loaiDA = LDA.loaiDA;
            this.MIN1 = LDA.MIN1;
            this.MAX1 = LDA.MAX1;
            this.dsDA_LDA = LDA.dsDA_LDA;
        }
        public LoaiDoAn(Loai1 loaiDA, int MIN1, int MAX1,
            ICollection<DoAn> dsDA_LDA)
        {
            this.loaiDA = loaiDA;
            this.MIN1 = MIN1;
            this.MAX1 = MAX1;
            this.dsDA_LDA = dsDA_LDA;
        }
        // related = plural
        public ICollection<DoAn> dsDA_LDA { get; set; }
    }
}
