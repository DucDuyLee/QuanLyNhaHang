using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class Ban
    {
        // Automatic properties
        public int soBan { get; set; } // primary key
        public string maLoaiBan { get; set; } // primary key = foreign key

        // constructor
        public Ban() { }
        public Ban(Ban b)
        {
            this.soBan = b.soBan;
            this.maLoaiBan = b.maLoaiBan;
            this.loaiban = b.loaiban;
            this.lichphucvu = b.lichphucvu;
        }
        public Ban(int soBan, string maLoaiBan, LoaiBan loaiban, ICollection<LichPhucVu> lichphucvu)
        {
            this.soBan = soBan;
            this.maLoaiBan = maLoaiBan;
            this.loaiban = loaiban;
            this.lichphucvu = lichphucvu;
        }
        // related = singular 
        public LoaiBan loaiban { get; set; }
        // related = plural
        public ICollection<LichPhucVu> lichphucvu { get; set; }
    }
}
