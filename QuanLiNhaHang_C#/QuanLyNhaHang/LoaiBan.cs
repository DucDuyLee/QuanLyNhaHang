using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace QuanLyNhaHang
{
    public class LoaiBan
    {
        // Automatic properties
        public string maLoaiBan { get; set; } // primary key
        public string hangSanXuat { get; set; }

        // constructor
        public LoaiBan() { }
        public LoaiBan(LoaiBan lb)
        {
            this.maLoaiBan = lb.maLoaiBan;
            this.hangSanXuat = lb.hangSanXuat;
            this.ds_ban = lb.ds_ban;
        }
        public LoaiBan(string maLoaiBan, string hangSanXuat, ICollection<Ban> ds_ban)
        {
            this.maLoaiBan = maLoaiBan;
            this.hangSanXuat = hangSanXuat;
            this.ds_ban = ds_ban;
        }
        // related = plural
        public ICollection<Ban> ds_ban { get; set; }
    }
}
