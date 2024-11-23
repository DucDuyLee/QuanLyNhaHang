using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;
using static QuanLyNhaHang.LoaiDoAn;

namespace QuanLyNhaHang
{
    public class Program
    {
        //Tạo đữ liệu
        public static List<NhanVien> dsNhanVien = new List<NhanVien>();
        public static List<LoaiBan> dsLoaiBan = new List<LoaiBan>();
        public static List<KhaNangLamViec> dsKhaNang = new List<KhaNangLamViec>();
        public static List<Ban> dsBan = new List<Ban>();
        public static List<LichPhucVu> dsLichPhucVu = new List<LichPhucVu>();
        public static List<PhanCong> dsPhanCong = new List<PhanCong>();
        public static List<KhachHang> dsKhachHang = new List<KhachHang>();
        public static List<DatLich> dsDatLich = new List<DatLich>();
        public static List<LoaiDoAn> dsLoaiDoAn = new List<LoaiDoAn>();
        public static List<DoAn> dsDoAn = new List<DoAn>();
        public static List<LoaiDoUong> dsLoaiDoUong = new List<LoaiDoUong>();
        public static List<DoUong> dsDoUong = new List<DoUong>();
        public static List<ThucDon> dsThucDon = new List<ThucDon>();
        public static List<ThucDonChiTiet> dsThucDonChiTiet = new List<ThucDonChiTiet>();
        //
        // Hàm tạo dữ liệu

        //Tạo danh sách nhân viên
        // nhân viên lương >= 20tr loại 1 và là đầu bếp, dưới 20tr loại 2 và là nhân viên
        public static void Taods_NhanVien()
        {
            dsNhanVien.Add(new NhanVien("01", "Duy", "20 Do Xuan Hop", 20000000,
                "0836907339", 1));
            dsNhanVien.Add(new NhanVien("02", "Kim", "74C Lang Tang Phu", 25000000,
               "0935769791", 2));
            dsNhanVien.Add(new NhanVien("03", "Duyen", "100 Dien Bien", 10000000,
               "0837218379", 2));
            dsNhanVien.Add(new NhanVien("04", "Quyen", "45 Dien May Xanh", 15000000,
               "0988197284", 2));
            dsNhanVien.Add(new NhanVien("05", "Vu", "33 Vo Van Ngan", 19000000,
               "0875657433", 2));
            dsNhanVien.Add(new NhanVien("06", "Nam", "16 Dang Van Bi", 17000000,
               "0987766547", 2));
            dsNhanVien.Add(new NhanVien("07", "Quang", "39 Quoc Lo 13", 21000000,
               "0876456738", 1));
            dsNhanVien.Add(new NhanVien("08", "Anh", "12 Nguyen Thai Hoc", 16000000,
               "0877175643", 2));
            dsNhanVien.Add(new NhanVien("09", "Thanh", "16/2 Nguyen Trai", 15000000,
               "0976548321", 2));
            dsNhanVien.Add(new NhanVien("10", "Tien", "43 Gia Dinh", 15000000,
               "0956738274", 1));
        }
        //
        //Tạo danh sách loại bàn
        public static void Taods_LoaiBan()
        {
            dsLoaiBan.Add(new LoaiBan("A01", "ECO", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("A02", "ECO", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("A03", "ECO", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("A04", "EOC", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("B01", "HOAPHAT", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("B02", "HOAPHAT", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("B03", "HOAPHAT", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("C01", "PHONGNGHI", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("C02", "PHONGNGHI", new List<Ban>()));
            dsLoaiBan.Add(new LoaiBan("C03", "PHONGNGHI", new List<Ban>()));
        }
        //
        // Tạo danh sách khả năng làm
        public static void Taods_KhaNang()
        {
            dsKhaNang.Add(new KhaNangLamViec("01", "B01", dsLoaiBan[4], dsNhanVien[2]));
            dsKhaNang.Add(new KhaNangLamViec("03", "B02", dsLoaiBan[5], dsNhanVien[2]));
            dsKhaNang.Add(new KhaNangLamViec("02", "C01", dsLoaiBan[7], dsNhanVien[2]));
            dsKhaNang.Add(new KhaNangLamViec("01", "C02", dsLoaiBan[8], dsNhanVien[2]));
            dsKhaNang.Add(new KhaNangLamViec("07", "A01", dsLoaiBan[1], dsNhanVien[3]));
            dsKhaNang.Add(new KhaNangLamViec("02", "A02", dsLoaiBan[3], dsNhanVien[3]));
            dsKhaNang.Add(new KhaNangLamViec("04", "B03", dsLoaiBan[6], dsNhanVien[3]));
            dsKhaNang.Add(new KhaNangLamViec("06", "C03", dsLoaiBan[8], dsNhanVien[3]));
            dsKhaNang.Add(new KhaNangLamViec("03", "A03", dsLoaiBan[0], dsNhanVien[5]));
            dsKhaNang.Add(new KhaNangLamViec("03", "A04", dsLoaiBan[8], dsNhanVien[5]));
        }
        //
        //Tạo bàn
        public static void Taods_Ban()
        {
            dsBan.Add(new Ban(6 , "B01", dsLoaiBan[5], new List<LichPhucVu>()));
            dsBan.Add(new Ban(7 , "B02", dsLoaiBan[4], new List<LichPhucVu>()));
            dsBan.Add(new Ban(9 , "B02", dsLoaiBan[4], new List<LichPhucVu>()));
            dsBan.Add(new Ban(13, "B01", dsLoaiBan[5], new List<LichPhucVu>()));
            dsBan.Add(new Ban(10, "C01", dsLoaiBan[7], new List<LichPhucVu>()));
            dsBan.Add(new Ban(8 , "C02", dsLoaiBan[8], new List<LichPhucVu>()));
            dsBan.Add(new Ban(11, "B03", dsLoaiBan[6], new List<LichPhucVu>()));
            dsBan.Add(new Ban(14, "C02", dsLoaiBan[8], new List<LichPhucVu>()));
            dsBan.Add(new Ban(17, "C02", dsLoaiBan[8], new List<LichPhucVu>()));
            dsBan.Add(new Ban(12, "C03", dsLoaiBan[8], new List<LichPhucVu>()));
            dsBan.Add(new Ban(18, "A01", dsLoaiBan[0], new List<LichPhucVu>()));
            dsBan.Add(new Ban(15, "A02", dsLoaiBan[0], new List<LichPhucVu>()));
            dsBan.Add(new Ban(16, "A03", dsLoaiBan[6], new List<LichPhucVu>()));
            //Thêm bàn theo loại
            dsLoaiBan[5].ds_ban.Add(dsBan[0]);
            dsLoaiBan[5].ds_ban.Add(dsBan[3]);

            dsLoaiBan[4].ds_ban.Add(dsBan[1]);
            dsLoaiBan[4].ds_ban.Add(dsBan[2]);

            dsLoaiBan[7].ds_ban.Add(dsBan[4]);

            dsLoaiBan[8].ds_ban.Add(dsBan[5]);
            dsLoaiBan[8].ds_ban.Add(dsBan[7]);
            dsLoaiBan[8].ds_ban.Add(dsBan[8]);
            dsLoaiBan[8].ds_ban.Add(dsBan[9]);

            dsLoaiBan[6].ds_ban.Add(dsBan[6]);
            dsLoaiBan[6].ds_ban.Add(dsBan[12]);

            dsLoaiBan[0].ds_ban.Add(dsBan[11]);
            dsLoaiBan[0].ds_ban.Add(dsBan[10]);
        }
        //
        //Tạo lịch phục vụ
        public static void Taods_LichPhucVu()
        {
            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 01, 11), "120", // 0
                dsBan[11].soBan, dsBan[11].maLoaiBan, dsBan[11]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 01, 11), "112", // 1
                dsBan[4].soBan, dsBan[4].maLoaiBan, dsBan[4]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 01, 11), "206", // 2
                dsBan[7].soBan, dsBan[7].maLoaiBan, dsBan[7]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 01, 11), "334", // 3
                dsBan[0].soBan, dsBan[0].maLoaiBan, dsBan[0]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 01, 11), "395",// 4
                dsBan[8].soBan, dsBan[8].maLoaiBan, dsBan[8]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 01, 11), "991",// 5
                dsBan[6].soBan, dsBan[6].maLoaiBan, dsBan[6]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 01, 11), "337", // 6
                dsBan[0].soBan, dsBan[0].maLoaiBan, dsBan[0]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 10, 31), "100", // 7
                dsBan[1].soBan, dsBan[1].maLoaiBan, dsBan[1]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 10, 31), "112", // 8
                dsBan[1].soBan, dsBan[1].maLoaiBan, dsBan[1]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 10, 31), "206", // 9
                dsBan[2].soBan, dsBan[2].maLoaiBan, dsBan[2]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 10, 31), "334", // 10
               dsBan[0].soBan, dsBan[0].maLoaiBan, dsBan[0]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 10, 31), "335", // 11
               dsBan[0].soBan, dsBan[0].maLoaiBan, dsBan[0]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 10, 31), "337", // 12
               dsBan[9].soBan, dsBan[9].maLoaiBan, dsBan[9]));

            dsLichPhucVu.Add(new LichPhucVu(new DateTime(2022, 10, 31), "449",// 13
               dsBan[10].soBan, dsBan[10].maLoaiBan, dsBan[10]));

            // Thêm lịch phục vụ theo bàn
            dsBan[0].lichphucvu.Add(dsLichPhucVu[3]);
            dsBan[0].lichphucvu.Add(dsLichPhucVu[6]);
            dsBan[0].lichphucvu.Add(dsLichPhucVu[10]);
            dsBan[0].lichphucvu.Add(dsLichPhucVu[11]);

            dsBan[1].lichphucvu.Add(dsLichPhucVu[7]);
            dsBan[1].lichphucvu.Add(dsLichPhucVu[8]);

            dsBan[2].lichphucvu.Add(dsLichPhucVu[9]);

            dsBan[4].lichphucvu.Add(dsLichPhucVu[1]);

            dsBan[6].lichphucvu.Add(dsLichPhucVu[5]);

            dsBan[7].lichphucvu.Add(dsLichPhucVu[2]);

            dsBan[8].lichphucvu.Add(dsLichPhucVu[4]);

            dsBan[9].lichphucvu.Add(dsLichPhucVu[12]);

            dsBan[10].lichphucvu.Add(dsLichPhucVu[13]);

            dsBan[11].lichphucvu.Add(dsLichPhucVu[0]);
        }
        //
        //Tạo danh sách phân công
        public static void Taods_PhanCong()
        {
            dsPhanCong.Add(new PhanCong(dsNhanVien[2].maNhanVien, dsLichPhucVu[0].ngay, dsLichPhucVu[0].maSoPhucVu,
                dsLichPhucVu[0], dsNhanVien[2]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[2].maNhanVien, dsLichPhucVu[7].ngay, dsLichPhucVu[7].maSoPhucVu,
               dsLichPhucVu[7], dsNhanVien[2]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[3].maNhanVien, dsLichPhucVu[0].ngay, dsLichPhucVu[0].maSoPhucVu,
               dsLichPhucVu[0], dsNhanVien[3]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[3].maNhanVien, dsLichPhucVu[7].ngay, dsLichPhucVu[7].maSoPhucVu,
               dsLichPhucVu[7], dsNhanVien[3]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[5].maNhanVien, dsLichPhucVu[7].ngay, dsLichPhucVu[7].maSoPhucVu,
              dsLichPhucVu[7], dsNhanVien[5]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[5].maNhanVien, dsLichPhucVu[12].ngay, dsLichPhucVu[12].maSoPhucVu,
              dsLichPhucVu[12], dsNhanVien[5]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[4].maNhanVien, dsLichPhucVu[7].ngay, dsLichPhucVu[7].maSoPhucVu,
              dsLichPhucVu[7], dsNhanVien[4]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[4].maNhanVien, dsLichPhucVu[12].ngay, dsLichPhucVu[12].maSoPhucVu,
              dsLichPhucVu[12], dsNhanVien[4]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[1].maNhanVien, dsLichPhucVu[5].ngay, dsLichPhucVu[5].maSoPhucVu,
             dsLichPhucVu[5], dsNhanVien[0]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[0].maNhanVien, dsLichPhucVu[12].ngay, dsLichPhucVu[12].maSoPhucVu,
             dsLichPhucVu[12], dsNhanVien[0]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[6].maNhanVien, dsLichPhucVu[1].ngay, dsLichPhucVu[1].maSoPhucVu,
             dsLichPhucVu[1], dsNhanVien[6]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[6].maNhanVien, dsLichPhucVu[5].ngay, dsLichPhucVu[5].maSoPhucVu,
             dsLichPhucVu[5], dsNhanVien[6]));
            dsPhanCong.Add(new PhanCong(dsNhanVien[6].maNhanVien, dsLichPhucVu[9].ngay, dsLichPhucVu[9].maSoPhucVu,
             dsLichPhucVu[9], dsNhanVien[6]));
        }
        //
        // Tạo danh sách loại đồ ăn
        public static void Taods_LoaiDoAn()
        {
            dsLoaiDoAn.Add(new LoaiDoAn(Loai1.Trang_Mieng, 10000, 100000, new List<DoAn>()));
            dsLoaiDoAn.Add(new LoaiDoAn(Loai1.Thuc_An_Nhanh, 30000, 200000, new List<DoAn>()));
            dsLoaiDoAn.Add(new LoaiDoAn(Loai1.Do_Man, 15000, 500000, new List<DoAn>()));
            dsLoaiDoAn.Add(new LoaiDoAn(Loai1.Do_Chay, 10000, 80000, new List<DoAn>()));
        }
        //
        // Tạo danh sách đồ ăn
        public static void Taods_DoAn()
        {
            dsDoAn.Add(new DoAn("Nho", 20000, Loai1.Trang_Mieng, dsLoaiDoAn[0]));
            dsDoAn.Add(new DoAn("Cam", 15000, Loai1.Trang_Mieng, dsLoaiDoAn[0]));
            dsDoAn.Add(new DoAn("Rau cau", 30000, Loai1.Trang_Mieng, dsLoaiDoAn[0]));
            dsDoAn.Add(new DoAn("Humburger", 45000, Loai1.Thuc_An_Nhanh, dsLoaiDoAn[1]));
            dsDoAn.Add(new DoAn("Ga ran", 38000, Loai1.Thuc_An_Nhanh, dsLoaiDoAn[1]));
            dsDoAn.Add(new DoAn("Khoai tay chien", 30000, Loai1.Thuc_An_Nhanh, dsLoaiDoAn[1]));
            dsDoAn.Add(new DoAn("Com suon", 80000, Loai1.Do_Man, dsLoaiDoAn[2]));
            dsDoAn.Add(new DoAn("Pho", 50000, Loai1.Do_Man, dsLoaiDoAn[2]));
            dsDoAn.Add(new DoAn("Xoi man", 20000, Loai1.Do_Man, dsLoaiDoAn[2]));
            dsDoAn.Add(new DoAn("Xoi dau xanh", 15000, Loai1.Do_Chay, dsLoaiDoAn[3]));
            dsDoAn.Add(new DoAn("Rau cu xao", 30000, Loai1.Do_Chay, dsLoaiDoAn[3]));
            dsDoAn.Add(new DoAn("Canh nam", 50000, Loai1.Do_Chay, dsLoaiDoAn[3]));
            // Thêm đồ ăn theo loại đồ ăn
            dsLoaiDoAn[0].dsDA_LDA.Add(dsDoAn[0]);
            dsLoaiDoAn[0].dsDA_LDA.Add(dsDoAn[1]);
            dsLoaiDoAn[0].dsDA_LDA.Add(dsDoAn[2]);

            dsLoaiDoAn[1].dsDA_LDA.Add(dsDoAn[3]);
            dsLoaiDoAn[1].dsDA_LDA.Add(dsDoAn[4]);
            dsLoaiDoAn[1].dsDA_LDA.Add(dsDoAn[5]);

            dsLoaiDoAn[2].dsDA_LDA.Add(dsDoAn[6]);
            dsLoaiDoAn[2].dsDA_LDA.Add(dsDoAn[7]);
            dsLoaiDoAn[2].dsDA_LDA.Add(dsDoAn[8]);

            dsLoaiDoAn[3].dsDA_LDA.Add(dsDoAn[9]);
            dsLoaiDoAn[3].dsDA_LDA.Add(dsDoAn[10]);
            dsLoaiDoAn[3].dsDA_LDA.Add(dsDoAn[11]);
        }
        //
        // Tạo danh sách loại đồ uống
        public static void Taods_LoaiDoUong()
        {
            dsLoaiDoUong.Add(new LoaiDoUong(Loai2.Nuoc_Uong_Co_Gas, 20000, 50000, new List<DoUong>()));
            dsLoaiDoUong.Add(new LoaiDoUong(Loai2.Nuoc_Uong_Khong_Gas, 20000, 60000, new List<DoUong>()));
            dsLoaiDoUong.Add(new LoaiDoUong(Loai2.Nuoc_Ep, 30000, 100000, new List<DoUong>()));
            dsLoaiDoUong.Add(new LoaiDoUong(Loai2.Nuoc_Khoang, 10000, 20000, new List<DoUong>()));
        }
        //
        //Tạo danh sách đồ uống
        public static void Taods_DoUong()
        {
            dsDoUong.Add(new DoUong("Sting", 20000, Loai2.Nuoc_Uong_Co_Gas, dsLoaiDoUong[0]));
            dsDoUong.Add(new DoUong("Pepsi", 22000, Loai2.Nuoc_Uong_Co_Gas, dsLoaiDoUong[0]));
            dsDoUong.Add(new DoUong("CocaCola", 23000, Loai2.Nuoc_Uong_Co_Gas, dsLoaiDoUong[0]));
            dsDoUong.Add(new DoUong("C2", 25000, Loai2.Nuoc_Uong_Khong_Gas, dsLoaiDoUong[1]));
            dsDoUong.Add(new DoUong("Tra dao", 35000, Loai2.Nuoc_Uong_Khong_Gas, dsLoaiDoUong[1]));
            dsDoUong.Add(new DoUong("Tra sua", 45000, Loai2.Nuoc_Uong_Khong_Gas, dsLoaiDoUong[1]));
            dsDoUong.Add(new DoUong("Nuoc ep cam", 50000, Loai2.Nuoc_Ep, dsLoaiDoUong[2]));
            dsDoUong.Add(new DoUong("Nuoc ep tao", 55000, Loai2.Nuoc_Ep, dsLoaiDoUong[2]));
            dsDoUong.Add(new DoUong("Nuoc ep dua hau", 44000, Loai2.Nuoc_Ep, dsLoaiDoUong[2]));
            dsDoUong.Add(new DoUong("LaVie", 10000, Loai2.Nuoc_Khoang, dsLoaiDoUong[3]));
            dsDoUong.Add(new DoUong("Vinh Hao", 12000, Loai2.Nuoc_Khoang, dsLoaiDoUong[3]));
            dsDoUong.Add(new DoUong("Aquarfina", 10000, Loai2.Nuoc_Khoang, dsLoaiDoUong[3]));
            //Them đồ uống theo loại đồ uống
            dsLoaiDoUong[0].dsDU_LDU.Add(dsDoUong[0]);
            dsLoaiDoUong[0].dsDU_LDU.Add(dsDoUong[1]);
            dsLoaiDoUong[0].dsDU_LDU.Add(dsDoUong[2]);

            dsLoaiDoUong[1].dsDU_LDU.Add(dsDoUong[3]);
            dsLoaiDoUong[1].dsDU_LDU.Add(dsDoUong[4]);
            dsLoaiDoUong[1].dsDU_LDU.Add(dsDoUong[5]);

            dsLoaiDoUong[2].dsDU_LDU.Add(dsDoUong[6]);
            dsLoaiDoUong[2].dsDU_LDU.Add(dsDoUong[7]);
            dsLoaiDoUong[2].dsDU_LDU.Add(dsDoUong[8]);

            dsLoaiDoUong[3].dsDU_LDU.Add(dsDoUong[9]);
            dsLoaiDoUong[3].dsDU_LDU.Add(dsDoUong[10]);
            dsLoaiDoUong[3].dsDU_LDU.Add(dsDoUong[11]);
        }
        //
        //Tạo danh sách khách hàng
        public static void Taods_KhachHang()
        {
            dsKhachHang.Add(new KhachHang("09", "Du", "223 Nguyen Thi Dinh", "0893222078"));

            dsKhachHang.Add(new KhachHang("01", "Anh", "567 Tran Van Bien", "0882672569"));

            dsKhachHang.Add(new KhachHang("45", "Thu", "285 Le Loi", "0788932203"));

            dsKhachHang.Add(new KhachHang("12", "Ha", "435 Vu Han", "0988933232"));

            dsKhachHang.Add(new KhachHang("38", "Hung", "456 Pasteur", "0909812101"));

            dsKhachHang.Add(new KhachHang("97", "Thanh", "234 Le Van Lai", "0988952943"));

            dsKhachHang.Add(new KhachHang("82", "Mai", "789 Vo Van Ngan", "NULL"));

            dsKhachHang.Add(new KhachHang("34", "Minh", "678 Le Loi", "NULL"));

            dsKhachHang.Add(new KhachHang("91", "Hai", "345 Hung Vuong", "0988893223"));

            dsKhachHang.Add(new KhachHang("14", "Phuong", "385 Vo Van Ngan", "0438232320"));

            dsKhachHang.Add(new KhachHang("13", "Vu", "348 CMT8", "0838343232"));

            dsKhachHang.Add(new KhachHang("86", "Son", "123 Bach Dang", "0988556223"));

            dsKhachHang.Add(new KhachHang("22", "Tien", "75 Xo Viet Nghe Tinh", "068332222"));
        }
        //
        // Tạo danh sách đặt lịch
        public static void Taods_DatLich()
        {
            dsDatLich.Add(new DatLich("09", new DateTime(2022, 11, 01), "100", dsLichPhucVu[0], dsKhachHang[0]));
            dsDatLich.Add(new DatLich("09", new DateTime(2022, 10, 01), "449", dsLichPhucVu[13], dsKhachHang[0]));
            dsDatLich.Add(new DatLich("45", new DateTime(2022, 11, 01), "991", dsLichPhucVu[5], dsKhachHang[2]));
            dsDatLich.Add(new DatLich("12", new DateTime(2022, 10, 01), "206", dsLichPhucVu[9], dsKhachHang[3]));
            dsDatLich.Add(new DatLich("38", new DateTime(2022, 10, 01), "334", dsLichPhucVu[10], dsKhachHang[4]));
            dsDatLich.Add(new DatLich("28", new DateTime(2022, 11, 01), "991", dsLichPhucVu[5], dsKhachHang[6]));
            dsDatLich.Add(new DatLich("91", new DateTime(2022, 11, 01), "100", dsLichPhucVu[0], dsKhachHang[8]));
            dsDatLich.Add(new DatLich("14", new DateTime(2022, 10, 01), "449", dsLichPhucVu[13], dsKhachHang[9]));
            dsDatLich.Add(new DatLich("13", new DateTime(2022, 11, 01), "100", dsLichPhucVu[0], dsKhachHang[10]));
            dsDatLich.Add(new DatLich("86", new DateTime(2022, 11, 01), "991", dsLichPhucVu[5], dsKhachHang[11]));
            dsDatLich.Add(new DatLich("86", new DateTime(2022, 10, 01), "100", dsLichPhucVu[7], dsKhachHang[11]));
            dsDatLich.Add(new DatLich("22", new DateTime(2022, 10, 01), "449", dsLichPhucVu[13], dsKhachHang[12]));
        }
        //
        //Tạo danh sách thực đơn
        public static void Taods_ThucDon()
        {
            dsThucDon.Add(new ThucDon("TD01", 65000, dsKhachHang[0].maKhachHang, dsKhachHang[0]));
            dsThucDon.Add(new ThucDon("TD02", 135000, dsKhachHang[1].maKhachHang, dsKhachHang[1]));
            dsThucDon.Add(new ThucDon("TD03", 97000, dsKhachHang[2].maKhachHang, dsKhachHang[2]));
            dsThucDon.Add(new ThucDon("TD04", 124000, dsKhachHang[3].maKhachHang, dsKhachHang[3]));
            dsThucDon.Add(new ThucDon("TD05", 94000, dsKhachHang[4].maKhachHang, dsKhachHang[4]));
            dsThucDon.Add(new ThucDon("TD06", 125000, dsKhachHang[5].maKhachHang, dsKhachHang[5]));
            dsThucDon.Add(new ThucDon("TD07", 53000, dsKhachHang[6].maKhachHang, dsKhachHang[6]));
            dsThucDon.Add(new ThucDon("TD08", 135000, dsKhachHang[7].maKhachHang, dsKhachHang[7]));
            dsThucDon.Add(new ThucDon("TD09", 40000, dsKhachHang[8].maKhachHang, dsKhachHang[8]));
            dsThucDon.Add(new ThucDon("TD10", 75000, dsKhachHang[9].maKhachHang, dsKhachHang[9]));
            dsThucDon.Add(new ThucDon("TD11", 50000, dsKhachHang[10].maKhachHang, dsKhachHang[10]));
            dsThucDon.Add(new ThucDon("TD12", 145000, dsKhachHang[11].maKhachHang, dsKhachHang[11]));
            dsThucDon.Add(new ThucDon("TD13", 130000, dsKhachHang[12].maKhachHang, dsKhachHang[12]));
        }
        //
        //Tạo danh sách thực đơn chi tiết
        public static void Taods_ThucDonChiTiet()
        {
            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[0].maTD, dsDoAn[3].tenDA, 1, dsDoAn[3].donGia, dsDoUong[0].tenDU, 1, dsDoUong[0].donGia,
                dsThucDon[0], dsDoAn[3], dsDoUong[0]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[1].maTD, dsDoAn[6].tenDA, 1, dsDoAn[6].donGia, dsDoUong[7].tenDU, 1, dsDoUong[7].donGia,
                dsThucDon[1], dsDoAn[6], dsDoUong[7]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[2].maTD, dsDoAn[9].tenDA, 2, 2 * dsDoAn[9].donGia, dsDoUong[3].tenDU, 1, dsDoUong[3].donGia,
                dsThucDon[2], dsDoAn[9], dsDoUong[3]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[2].maTD, dsDoAn[5].tenDA, 1, dsDoAn[5].donGia, dsDoUong[3].tenDU, 1, dsDoUong[3].donGia,
                dsThucDon[2], dsDoAn[5], dsDoUong[3]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[3].maTD, dsDoAn[6].tenDA, 1, dsDoAn[6].donGia, dsDoUong[8].tenDU, 1, dsDoUong[8].donGia,
                dsThucDon[3], dsDoAn[6], dsDoUong[8]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[4].maTD, dsDoAn[11].tenDA, 1, dsDoAn[11].donGia, dsDoUong[1].tenDU, 2, 2 * dsDoUong[1].donGia,
                dsThucDon[4], dsDoAn[11], dsDoUong[1]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[5].maTD, dsDoAn[7].tenDA, 1, dsDoAn[7].donGia, dsDoUong[9].tenDU, 1, dsDoUong[9].donGia,
                dsThucDon[5], dsDoAn[7], dsDoUong[9]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[5].maTD, dsDoAn[1].tenDA, 1, dsDoAn[1].donGia, dsDoUong[6].tenDU, 1, dsDoUong[6].donGia,
                dsThucDon[5], dsDoAn[1], dsDoUong[6]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[6].maTD, dsDoAn[10].tenDA, 1, dsDoAn[10].donGia, dsDoUong[2].tenDU, 1, dsDoUong[2].donGia,
                dsThucDon[6], dsDoAn[10], dsDoUong[2]));
            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[7].maTD, dsDoAn[8].tenDA, 2, 2 * dsDoAn[8].donGia, dsDoUong[4].tenDU, 1, dsDoUong[4].donGia,
                dsThucDon[7], dsDoAn[8], dsDoUong[4]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[7].maTD, dsDoAn[1].tenDA, 1, dsDoAn[1].donGia, dsDoUong[5].tenDU, 1, dsDoUong[5].donGia,
                dsThucDon[7], dsDoAn[1], dsDoUong[5]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[8].maTD, dsDoAn[2].tenDA, 1, dsDoAn[2].donGia, dsDoUong[11].tenDU, 1, dsDoUong[11].donGia,
                dsThucDon[8], dsDoAn[2], dsDoUong[11]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[9].maTD, dsDoAn[7].tenDA, 1, dsDoAn[7].donGia, dsDoUong[3].tenDU, 1, dsDoUong[3].donGia,
                dsThucDon[9], dsDoAn[7], dsDoUong[3]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[10].maTD, dsDoAn[4].tenDA, 1, dsDoAn[4].donGia, dsDoUong[10].tenDU, 1, dsDoUong[10].donGia,
                dsThucDon[10], dsDoAn[4], dsDoUong[10]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[11].maTD, dsDoAn[5].tenDA, 1, dsDoAn[5].donGia, dsDoUong[3].tenDU, 1, dsDoUong[3].donGia,
                dsThucDon[11], dsDoAn[5], dsDoUong[3]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[11].maTD, dsDoAn[6].tenDA, 1, dsDoAn[6].donGia, dsDoUong[9].tenDU, 1, dsDoUong[9].donGia,
                dsThucDon[11], dsDoAn[6], dsDoUong[9]));

            dsThucDonChiTiet.Add(new ThucDonChiTiet(dsThucDon[12].maTD, dsDoAn[9].tenDA, 2, 2 * dsDoAn[9].donGia, dsDoUong[6].tenDU, 2, 2 * dsDoUong[6].donGia,
                dsThucDon[12], dsDoAn[9], dsDoUong[6]));
        }

        //
        // Các câu LINQ
        //

        //================ Lê Đức Duy - 21110821 =====================

        // Câu 1:  5 khách hàng có tổng tiền thực đơn nhỏ nhất 

        public static void Linq01_LeDucDuy()
        {
            var tien = (
                from p in dsThucDon
                orderby p.giaTien ascending
                select p)
                .Take(5);
            Console.WriteLine("--------------Ket qua cau 1------------------");
            Console.WriteLine("--DANH SACH 5 KHACH HANG CO TONG TIEN THUC DON NHO NHAT--");
            foreach (var kq in tien)
            {
                Console.WriteLine("Ma Thuc Don: {0} - Ma Khach Hang: {1} - Ten: {2} - So Tien: {3}.",
                    kq.maTD, kq.maKhachHang, kq.khachhang.tenKH, kq.giaTien);
            }
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 2: 5 khách hàng có tổng tiền thực đơn lớn nhất

        public static void Linq02_LeDucDuy()
        {
            var tien = (
                from q in dsThucDon
                orderby q.giaTien ascending
                select q)
                .Skip(8);
            Console.WriteLine("--------------Ket qua cau 2------------------");
            Console.WriteLine("--DANH SACH 5 KHACH HANG CO TONG TIEN O THUC DON LON NHAT--");
            foreach (var kq in tien)
            {
                Console.WriteLine("Ma Thuc Don: {0} - Ma Khach Hang: {1} - Ten: {2} - So Tien: {3}.",
                    kq.maTD, kq.maKhachHang, kq.khachhang.tenKH, kq.giaTien);
            }
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 3: Danh sách thức ăn và nước uống có giá lớn hơn 20 000
        public static void Linq03_LeDucDuy()
        {

            var list1 =
                from p in dsDoAn
                where p.donGia > 20000
                select p.tenDA;

            var list2 =
                from q in dsDoUong
                where q.donGia > 20000
                select q.tenDU;

            var all = list1.Concat(list2);

            Console.WriteLine("--------------Ket qua cau 3------------------");
            Console.WriteLine("--TEN MON AN VA THUC UONG CO GIA TREN 20 000 VND--");
            foreach (var kq in all)
            {
                Console.WriteLine(kq);
            }
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 4: Tính tổng lương của đầu bếp và phục vụ
        // đầu bếp là nhân viên loại 1, phục vụ là nhân viên loại 2

        public static void Linq04_LeDucDuy()
        {
            var query =
                from nv in dsNhanVien
                group nv by nv.loaiNV into deposit
                select new { Type = deposit.Key, Sum = deposit.Sum(sum => sum.Luong) };
            Console.WriteLine("--------------Ket qua cau 4------------------");
            Console.WriteLine("--TINH TONG LUONG DAU BEP VA PHUC VU--");
            foreach (var qr in query)
            {
                Console.Write("Nhom {0}: ", qr.Type == 1 ? "Dau bep" : "Phuc vu");
                Console.WriteLine("{0}", qr.Sum);
            }
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 5: Cho biết mức lương trung bình của đầu bếp

        public static void Linq05_LeDucDuy()
        {
            Console.WriteLine("--------------Ket qua cau 5------------------");
            Console.WriteLine("--CHO BIET LUONG TRUNG BINH CUA DAU BEP--");
            double q5 = dsNhanVien.Where(n => n.loaiNV == 1).Average(n => n.Luong);
            Console.WriteLine("Luong trung binh cua dau bep: {0:0.00}.", q5);
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 6: Cho biết mức lương trung bình của phục vụ

        public static void Linq06_LeDucDuy()
        {
            Console.WriteLine("--------------Ket qua cau 6------------------");
            Console.WriteLine("--CHO BIET LUONG TRUNG BINH CUA PHUC VU--");
            double q6 = dsNhanVien.Where(n => n.loaiNV == 2).Average(n => n.Luong);
            Console.WriteLine("Luong trung binh cua phuc vu: {0:0.00}.", q6);
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 7: Cho biết hãng sản xuất, mã loại bàn và số bàn của bàn được sử dụng nhiều nhất

        public static void Linq07_LeDucDuy()
        {
            Console.WriteLine("--------------Ket qua cau 7------------------");
            Console.WriteLine("--CHO BIET HANG SAN XUAT, MA LOAI BAN VA SO BAN DUOC SU DUNG NHIEU NHAT--");

            var q7 = from LPV in dsLichPhucVu
                     from LB in dsLoaiBan
                     where LB.maLoaiBan == LPV.maLoaiBan
                     group new { LB, LPV } by new { LB.hangSanXuat, LB.maLoaiBan, LPV.soBan } into gr1
                     let Solg = gr1.Count()

                     where Solg ==

                     (from LPV in dsLichPhucVu
                      group LPV by new { LPV.maLoaiBan, LPV.soBan } into gr
                      let slg = gr.Count()
                      select new { Slg = slg }).Max(n => n.Slg)

                     select new { GT = gr1.Key };

            foreach (var n in q7)
            {
                Console.WriteLine("Hang San Xuat: {0}, Ma Loai Ban: {1}, So Ban: {2}", n.GT.hangSanXuat, n.GT.maLoaiBan, n.GT.soBan);
            }
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 8: Cho biết thông tin của nhân viên có lương cao nhất

        public static void Linq08_LeDucDuy()
        {
            Console.WriteLine("--------------Ket qua cau 8------------------");
            Console.WriteLine("--CHO BIET THONG TIN NHAN VIEN CO LUONG CAO NHAT--");
            var q8 = from NV in dsNhanVien
                     where NV.Luong == (from NV1 in dsNhanVien select NV1.Luong).Max(n => n)
                     select NV;


            foreach (var n in q8)
            {
                Console.WriteLine("Ma nhan vien: {0}, Ten nhan vien: {1}, Loai nhan vien: {2}.", n.maNhanVien, n.tenNV, (n.loaiNV == 1) ? "Dau bep" : "Phuc Vu");
            }
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 9: Danh sách món ăn được đặt của tất cả khách hàng 

        public static void Linq09_LeDucDuy()
        {
            Console.WriteLine("--------------Ket qua cau 9------------------");
            Console.WriteLine("--DANH SACH MON AN DUOC DAT CUA TAT CA KHACH HANG --");
            var list1 = (
                from p in dsThucDonChiTiet
                select p.tenDoAn)
                .Distinct();
            foreach (var kq1 in list1)
            {
                Console.WriteLine(kq1);
            }
            Console.WriteLine("-----------------------------------------------------------");
        }

        // Câu 10: Cho biết thông tin của phục vụ tham gia phục vụ có maSoPhucVu là 100

        public static void Linq10_LeDucDuy()
        {
            Console.WriteLine("--------------Ket qua cau 10------------------");
            Console.WriteLine("--THONG TIN CUA PHUC VU THAM GIA PHUC VU CO maSoPhucVu LA 100 --");
            var s =
                from pc in dsPhanCong
                join nv in dsNhanVien on pc.maNV equals nv.maNhanVien
                where pc.maSoPhucVu == "100" && nv.loaiNV == 2
                select new { ID = nv.maNhanVien, Name = nv.tenNV, Address = nv.diaChi, Phone = nv.soDT };
            foreach (var n in s)
            {
                Console.WriteLine("\t- Ma nhan vien: {0}", n.ID);
                Console.WriteLine("\t- Ten nhan vien: {0}", n.Name);
                Console.WriteLine("\t- Dia chi: {0}", n.Address);
                Console.WriteLine("\t- So dien thoai: {0}", n.Phone);
                Console.WriteLine("\t====================");
            }
            Console.WriteLine("-----------------------------------------------------------");

        }
        public static void test()
        {
            var list =
                from p in dsThucDonChiTiet
                where p.doan.LDA_DA.loaiDA == Loai1.Trang_Mieng && p.doan.tenDA == "Cam"
                select new { p.thucdon.khachhang, p.tenDoAn };
            Console.WriteLine("--------------Ket qua 4------------------");
            Console.WriteLine("--DANH SACH KHACH HANG AN MON TRANG MIENG LA CAM");
            foreach (var kq in list)
            {
                Console.WriteLine("Ma khach hang: {0} - Ten khach hang: {1} - Ten mon an: {2}",
                    kq.khachhang.maKhachHang, kq.khachhang.tenKH, kq.tenDoAn);
            }
        }
        public static void test2()
        {
            Console.WriteLine("--------------Ket qua cau 7------------------");
            Console.WriteLine("--CHO BIET HANG SAN XUAT, MA LOAI BAN VA SO BAN DUOC SU DUNG --");

            var q7 = from LPV in dsLichPhucVu
                     from LB in dsLoaiBan
                     where LB.maLoaiBan == LPV.maLoaiBan
                     group new { LB, LPV } by new { LB.hangSanXuat, LB.maLoaiBan, LPV.soBan } into gr1
                     let Solg = gr1.Count()

                     where Solg ==

                     (from LPV in dsLichPhucVu
                      group LPV by new { LPV.maLoaiBan, LPV.soBan } into gr
                      let slg = gr.Count()
                      select new { Slg = slg }).Min(n => n.Slg)

                     select new { GT = gr1.Key };

            foreach (var n in q7)
            {
                Console.WriteLine("Hang San Xuat: {0}, Ma Loai Ban: {1}, So Ban: {2}", n.GT.hangSanXuat, n.GT.maLoaiBan, n.GT.soBan);
            }
            Console.WriteLine("-----------------------------------------------------------");
        }
        static void Main(string[] args)
        {
            Taods_NhanVien();
            Taods_LoaiBan();
            Taods_KhaNang();
            Taods_Ban();
            Taods_LichPhucVu();
            Taods_PhanCong();
            Taods_LoaiDoAn();
            Taods_DoAn();
            Taods_LoaiDoUong();
            Taods_DoUong();
            Taods_KhachHang();
            Taods_DatLich();
            Taods_ThucDon();
            Taods_ThucDonChiTiet();
            // Các câu LINQ
            // Lê Đức Duy 21110821
            Linq01_LeDucDuy();
            Linq02_LeDucDuy();
            Linq03_LeDucDuy();
            Linq04_LeDucDuy();
            Linq05_LeDucDuy();
            Linq06_LeDucDuy();
            Linq07_LeDucDuy();
            Linq08_LeDucDuy();
            Linq09_LeDucDuy();
            Linq10_LeDucDuy();
            test();
            test2();
            Console.ReadKey();
        }
    }
}
