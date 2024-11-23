using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class LichPhucVu
    {
        // Automatic Properties
        public string maSoPhucVu { get; set; } // Primary Key = Foreign Key
        public DateTime ngay { get; set; }    // Primary Key
        public int soBan { get; set; }      // Foreign Key
        public string maLoaiBan { get; set; }      // Foreign Key

        // Constructor
        public LichPhucVu() { }
        public LichPhucVu(DateTime ngay, string maSoPhucVu, int soBan, string maLoaiBan,
             Ban ban)
        {
            this.ngay = ngay;
            this.maSoPhucVu = maSoPhucVu;
            this.soBan = soBan;
            this.maLoaiBan = maLoaiBan;
            this.ban = ban;
        }
        public LichPhucVu(LichPhucVu lpv)
        {
            this.ngay = lpv.ngay;
            this.maSoPhucVu = lpv.maSoPhucVu;
            this.soBan = lpv.soBan;
            this.maLoaiBan = lpv.maLoaiBan;
            this.ban = lpv.ban;
        }

        // related = singular
        public Ban ban { get; set; }
    }
}

