using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public enum Loai2
    {
        Nuoc_Uong_Co_Gas,
        Nuoc_Uong_Khong_Gas,
        Nuoc_Ep,
        Nuoc_Khoang,
    }
    public class LoaiDoUong
    {
        // Automatic properties
        public Loai2 LoaiDU { get; set; } // Primary Key
        public int MIN2 { get; set; }
        public int MAX2 { get; set; }
        // constructor
        public LoaiDoUong() { }
        public LoaiDoUong(LoaiDoUong LDU)
        {
            this.LoaiDU = LDU.LoaiDU;
            this.MIN2 = LDU.MIN2;
            this.MAX2 = LDU.MAX2;
            this.dsDU_LDU = LDU.dsDU_LDU;
        }
        public LoaiDoUong(Loai2 LoaiDU, int MIN2, int MAX2,
            ICollection<DoUong> dsDU_LDU)
        {
            this.LoaiDU = LoaiDU;
            this.MIN2 = MIN2;
            this.MAX2 = MAX2;
            this.dsDU_LDU = dsDU_LDU;
        }
        // related = plural
        public ICollection<DoUong> dsDU_LDU { get; set; }
    }
}
