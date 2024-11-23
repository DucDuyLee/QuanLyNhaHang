package mypack;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.time.LocalDate;
import java.util.Optional;
import java.util.Map;
import java.util.Objects;

public class Program 
{
	//Tạo đữ liệu

    public static List<KhachHang> dsKhachHang = new ArrayList<KhachHang>();
    public static List<ThucDon> dsThucDon = new ArrayList<ThucDon>();
    public static List<LoaiDoAn> dsLoaiDoAn = new ArrayList<LoaiDoAn>();
    public static List<DoAn> dsDoAn = new ArrayList<DoAn>();
    public static List<LoaiDoUong> dsLoaiDoUong = new ArrayList<LoaiDoUong>();
    public static List<DoUong> dsDoUong = new ArrayList<DoUong>();
    public static List<ThucDonChiTiet> dsThucDonChiTiet = new ArrayList<ThucDonChiTiet>();
    public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    public static List<LoaiBan> dsLoaiBan = new ArrayList<LoaiBan>();
    public static List<Ban> dsBan = new ArrayList<Ban>();
    public static List<LichPhucVu> dsLichPhucVu = new ArrayList<LichPhucVu>();
    public static List<PhanCong> dsPhanCong = new ArrayList<PhanCong>();
    public static List<KhaNangLamViec> dsKhaNang = new ArrayList<KhaNangLamViec>();
    public static List<DatLich> dsDatLich = new ArrayList<DatLich>();
    //
    // Hàm tạo dữ liệu

    
    //
    //Tạo danh sách khách hàng
    public static void Taods_KhachHang()
    {
        dsKhachHang.add(new KhachHang("09", "Du", "223 Nguyen Thi Dinh", "0893222078"));

        dsKhachHang.add(new KhachHang("01", "Anh", "567 Tran Van Bien", "0882672569"));

        dsKhachHang.add(new KhachHang("45", "Thu", "285 Le Loi", "0788932203"));

        dsKhachHang.add(new KhachHang("12", "Ha", "435 Vu Han", "0988933232"));

        dsKhachHang.add(new KhachHang("38", "Hung", "456 Pasteur", "0909812101"));

        dsKhachHang.add(new KhachHang("97", "Thanh", "234 Le Van Lai", "0988952943"));

        dsKhachHang.add(new KhachHang("82", "Mai", "789 Vo Van Ngan", "NULL"));

        dsKhachHang.add(new KhachHang("34", "Minh", "678 Le Loi", "NULL"));

        dsKhachHang.add(new KhachHang("91", "Hai", "345 Hung Vuong", "0988893223"));

        dsKhachHang.add(new KhachHang("14", "Phuong", "385 Vo Van Ngan", "0438232320"));

        dsKhachHang.add(new KhachHang("13", "Vu", "348 CMT8", "0838343232"));

        dsKhachHang.add(new KhachHang("86", "Son", "123 Bach Dang", "0988556223"));

        dsKhachHang.add(new KhachHang("22", "Tien", "75 Xo Viet Nghe Tinh", "068332222"));
    }
    
    //
    //Tạo danh sách thực đơn
    public static void Taods_ThucDon()
    {
        dsThucDon.add(new ThucDon("TD01", 65000, dsKhachHang.get(0).maKhachHang, dsKhachHang.get(0)));
        dsThucDon.add(new ThucDon("TD02", 135000, dsKhachHang.get(1).maKhachHang, dsKhachHang.get(0)));
        dsThucDon.add(new ThucDon("TD03", 97000, dsKhachHang.get(2).maKhachHang, dsKhachHang.get(2)));
        dsThucDon.add(new ThucDon("TD04", 124000, dsKhachHang.get(3).maKhachHang, dsKhachHang.get(3)));
        dsThucDon.add(new ThucDon("TD05", 94000, dsKhachHang.get(4).maKhachHang, dsKhachHang.get(4)));
        dsThucDon.add(new ThucDon("TD06", 125000, dsKhachHang.get(5).maKhachHang, dsKhachHang.get(5)));
        dsThucDon.add(new ThucDon("TD07", 53000, dsKhachHang.get(6).maKhachHang, dsKhachHang.get(6)));
        dsThucDon.add(new ThucDon("TD08", 135000, dsKhachHang.get(7).maKhachHang, dsKhachHang.get(7)));
        dsThucDon.add(new ThucDon("TD09", 40000, dsKhachHang.get(8).maKhachHang, dsKhachHang.get(8)));
        dsThucDon.add(new ThucDon("TD10", 75000, dsKhachHang.get(9).maKhachHang, dsKhachHang.get(9)));
        dsThucDon.add(new ThucDon("TD11", 50000, dsKhachHang.get(10).maKhachHang, dsKhachHang.get(10)));
        dsThucDon.add(new ThucDon("TD12", 145000, dsKhachHang.get(11).maKhachHang, dsKhachHang.get(11)));
        dsThucDon.add(new ThucDon("TD13", 130000, dsKhachHang.get(12).maKhachHang, dsKhachHang.get(12)));
    }
    
    //
    // Tạo danh sách loại đồ ăn
    public static void Taods_LoaiDoAn()
    {
        dsLoaiDoAn.add(new LoaiDoAn(Loai1.Trang_Mieng, 10000, 100000, new ArrayList<DoAn>()));
        dsLoaiDoAn.add(new LoaiDoAn(Loai1.Thuc_An_Nhanh, 30000, 200000, new ArrayList<DoAn>()));
        dsLoaiDoAn.add(new LoaiDoAn(Loai1.Do_Man, 15000, 500000, new ArrayList<DoAn>()));
        dsLoaiDoAn.add(new LoaiDoAn(Loai1.Do_Chay, 10000, 80000, new ArrayList<DoAn>()));
    }
    //
    // Tạo danh sách đồ ăn
    public static void Taods_DoAn()
    {
        dsDoAn.add(new DoAn("Nho", 20000, Loai1.Trang_Mieng, dsLoaiDoAn.get(0)));
        dsDoAn.add(new DoAn("Cam", 15000, Loai1.Trang_Mieng, dsLoaiDoAn.get(0)));
        dsDoAn.add(new DoAn("Rau cau", 30000, Loai1.Trang_Mieng, dsLoaiDoAn.get(0)));
        dsDoAn.add(new DoAn("Humburger", 45000, Loai1.Thuc_An_Nhanh, dsLoaiDoAn.get(1)));
        dsDoAn.add(new DoAn("Ga ran", 38000, Loai1.Thuc_An_Nhanh, dsLoaiDoAn.get(1)));
        dsDoAn.add(new DoAn("Khoai tay chien", 30000, Loai1.Thuc_An_Nhanh, dsLoaiDoAn.get(1)));
        dsDoAn.add(new DoAn("Com suon", 80000, Loai1.Do_Man, dsLoaiDoAn.get(2)));
        dsDoAn.add(new DoAn("Pho", 50000, Loai1.Do_Man, dsLoaiDoAn.get(2)));
        dsDoAn.add(new DoAn("Xoi man", 20000, Loai1.Do_Man, dsLoaiDoAn.get(2)));
        dsDoAn.add(new DoAn("Xoi dau xanh", 15000, Loai1.Do_Chay, dsLoaiDoAn.get(3)));
        dsDoAn.add(new DoAn("Rau cu xao", 30000, Loai1.Do_Chay, dsLoaiDoAn.get(3)));
        dsDoAn.add(new DoAn("Canh nam", 50000, Loai1.Do_Chay, dsLoaiDoAn.get(3)));
        // Thêm đồ ăn theo loại đồ ăn
        dsLoaiDoAn.get(0).dsDA_LDA.add(dsDoAn.get(0));
        dsLoaiDoAn.get(0).dsDA_LDA.add(dsDoAn.get(1));
        dsLoaiDoAn.get(0).dsDA_LDA.add(dsDoAn.get(2));

        dsLoaiDoAn.get(1).dsDA_LDA.add(dsDoAn.get(3));
        dsLoaiDoAn.get(1).dsDA_LDA.add(dsDoAn.get(4));
        dsLoaiDoAn.get(1).dsDA_LDA.add(dsDoAn.get(5));

        dsLoaiDoAn.get(2).dsDA_LDA.add(dsDoAn.get(6));
        dsLoaiDoAn.get(2).dsDA_LDA.add(dsDoAn.get(7));
        dsLoaiDoAn.get(2).dsDA_LDA.add(dsDoAn.get(8));

        dsLoaiDoAn.get(3).dsDA_LDA.add(dsDoAn.get(9));
        dsLoaiDoAn.get(3).dsDA_LDA.add(dsDoAn.get(10));
        dsLoaiDoAn.get(3).dsDA_LDA.add(dsDoAn.get(11));
    }
    
    //
    // Tạo danh sách loại đồ uống
    public static void Taods_LoaiDoUong()
    {
        dsLoaiDoUong.add(new LoaiDoUong(Loai2.Nuoc_Uong_Co_Gas, 20000, 50000, new ArrayList<DoUong>()));
        dsLoaiDoUong.add(new LoaiDoUong(Loai2.Nuoc_Uong_Khong_Gas, 20000, 60000, new ArrayList<DoUong>()));
        dsLoaiDoUong.add(new LoaiDoUong(Loai2.Nuoc_Ep, 30000, 100000, new ArrayList<DoUong>()));
        dsLoaiDoUong.add(new LoaiDoUong(Loai2.Nuoc_Khoang, 10000, 20000, new ArrayList<DoUong>()));
    }
    //
    //Tạo danh sách đồ uống
    public static void Taods_DoUong()
    {
        dsDoUong.add(new DoUong("Sting", 20000, Loai2.Nuoc_Uong_Co_Gas, dsLoaiDoUong.get(0)));
        dsDoUong.add(new DoUong("Pepsi", 22000, Loai2.Nuoc_Uong_Co_Gas, dsLoaiDoUong.get(0)));
        dsDoUong.add(new DoUong("CocaCola", 23000, Loai2.Nuoc_Uong_Co_Gas, dsLoaiDoUong.get(0)));
        dsDoUong.add(new DoUong("C2", 25000, Loai2.Nuoc_Uong_Khong_Gas, dsLoaiDoUong.get(1)));
        dsDoUong.add(new DoUong("Tra dao", 35000, Loai2.Nuoc_Uong_Khong_Gas, dsLoaiDoUong.get(1)));
        dsDoUong.add(new DoUong("Tra sua", 45000, Loai2.Nuoc_Uong_Khong_Gas, dsLoaiDoUong.get(1)));
        dsDoUong.add(new DoUong("Nuoc ep cam", 50000, Loai2.Nuoc_Ep, dsLoaiDoUong.get(2)));
        dsDoUong.add(new DoUong("Nuoc ep tao", 55000, Loai2.Nuoc_Ep, dsLoaiDoUong.get(2)));
        dsDoUong.add(new DoUong("Nuoc ep dua hau", 44000, Loai2.Nuoc_Ep, dsLoaiDoUong.get(2)));
        dsDoUong.add(new DoUong("LaVie", 10000, Loai2.Nuoc_Khoang, dsLoaiDoUong.get(3)));
        dsDoUong.add(new DoUong("Vinh Hao", 12000, Loai2.Nuoc_Khoang, dsLoaiDoUong.get(3)));
        dsDoUong.add(new DoUong("Aquarfina", 10000, Loai2.Nuoc_Khoang, dsLoaiDoUong.get(3)));
        //Them đồ uống theo loại đồ uống
        dsLoaiDoUong.get(0).dsDU_LDU.add(dsDoUong.get(0));
        dsLoaiDoUong.get(0).dsDU_LDU.add(dsDoUong.get(1));
        dsLoaiDoUong.get(0).dsDU_LDU.add(dsDoUong.get(2));

        dsLoaiDoUong.get(1).dsDU_LDU.add(dsDoUong.get(3));
        dsLoaiDoUong.get(1).dsDU_LDU.add(dsDoUong.get(4));
        dsLoaiDoUong.get(1).dsDU_LDU.add(dsDoUong.get(5));

        dsLoaiDoUong.get(2).dsDU_LDU.add(dsDoUong.get(6));
        dsLoaiDoUong.get(2).dsDU_LDU.add(dsDoUong.get(7));
        dsLoaiDoUong.get(2).dsDU_LDU.add(dsDoUong.get(8));

        dsLoaiDoUong.get(3).dsDU_LDU.add(dsDoUong.get(9));
        dsLoaiDoUong.get(3).dsDU_LDU.add(dsDoUong.get(10));
        dsLoaiDoUong.get(3).dsDU_LDU.add(dsDoUong.get(11));
    }
    
    //
    //Tạo danh sách thực đơn chi tiết
    public static void Taods_ThucDonChiTiet()
    {
      
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(0).maTD, dsDoAn.get(3).tenDA, 1, dsDoAn.get(3).donGia,
        		dsDoUong.get(0).tenDU, 1, dsDoUong.get(0).donGia, dsThucDon.get(0), dsDoAn.get(3),
        		dsDoUong.get(0)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(1).maTD, dsDoAn.get(6).tenDA, 1, dsDoAn.get(6).donGia,
        		dsDoUong.get(7).tenDU, 1, dsDoUong.get(7).donGia, dsThucDon.get(1), dsDoAn.get(6),
        		dsDoUong.get(7)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(2).maTD, dsDoAn.get(9).tenDA, 2,
				2 * dsDoAn.get(9).donGia, dsDoUong.get(3).tenDU, 1, dsDoUong.get(3).donGia, dsThucDon.get(2),
				dsDoAn.get(9), dsDoUong.get(3)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(2).maTD, dsDoAn.get(5).tenDA, 1, dsDoAn.get(5).donGia,
        		dsDoUong.get(3).tenDU, 1, dsDoUong.get(3).donGia, dsThucDon.get(2), dsDoAn.get(5),
        		dsDoUong.get(3)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(3).maTD, dsDoAn.get(6).tenDA, 1, dsDoAn.get(6).donGia,
        		dsDoUong.get(8).tenDU, 1, dsDoUong.get(8).donGia, dsThucDon.get(3), dsDoAn.get(6),
        		dsDoUong.get(8)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(4).maTD, dsDoAn.get(11).tenDA, 1, dsDoAn.get(11).donGia,
        		dsDoUong.get(1).tenDU, 2, 2 * dsDoUong.get(1).donGia, dsThucDon.get(4), dsDoAn.get(11),
        		dsDoUong.get(1)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(5).maTD, dsDoAn.get(7).tenDA, 1, dsDoAn.get(7).donGia,
        		dsDoUong.get(9).tenDU, 1, dsDoUong.get(9).donGia, dsThucDon.get(5), dsDoAn.get(7),
        		dsDoUong.get(9)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(5).maTD, dsDoAn.get(1).tenDA, 1, dsDoAn.get(1).donGia,
        		dsDoUong.get(6).tenDU, 1, dsDoUong.get(6).donGia, dsThucDon.get(5), dsDoAn.get(1),
        		dsDoUong.get(6)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(6).maTD, dsDoAn.get(10).tenDA, 1, dsDoAn.get(10).donGia,
        		dsDoUong.get(2).tenDU, 1, dsDoUong.get(2).donGia, dsThucDon.get(6), dsDoAn.get(10),
        		dsDoUong.get(2)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(7).maTD, dsDoAn.get(8).tenDA, 2,
				2 * dsDoAn.get(8).donGia, dsDoUong.get(4).tenDU, 1, dsDoUong.get(4).donGia, dsThucDon.get(7),
				dsDoAn.get(8), dsDoUong.get(4)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(7).maTD, dsDoAn.get(1).tenDA, 1, dsDoAn.get(1).donGia,
        		dsDoUong.get(5).tenDU, 1, dsDoUong.get(5).donGia, dsThucDon.get(7), dsDoAn.get(1),
        		dsDoUong.get(5)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(8).maTD, dsDoAn.get(2).tenDA, 1, dsDoAn.get(2).donGia,
        		dsDoUong.get(11).tenDU, 1, dsDoUong.get(11).donGia, dsThucDon.get(8), dsDoAn.get(2),
        		dsDoUong.get(11)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(9).maTD, dsDoAn.get(7).tenDA, 1, dsDoAn.get(7).donGia,
        		dsDoUong.get(3).tenDU, 1, dsDoUong.get(3).donGia, dsThucDon.get(9), dsDoAn.get(7),
        		dsDoUong.get(3)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(10).maTD, dsDoAn.get(4).tenDA, 1, dsDoAn.get(4).donGia,
        		dsDoUong.get(10).tenDU, 1, dsDoUong.get(10).donGia, dsThucDon.get(10), dsDoAn.get(4),
        		dsDoUong.get(10)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(11).maTD, dsDoAn.get(5).tenDA, 1, dsDoAn.get(5).donGia,
        		dsDoUong.get(3).tenDU, 1, dsDoUong.get(3).donGia, dsThucDon.get(11), dsDoAn.get(5),
        		dsDoUong.get(3)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(11).maTD, dsDoAn.get(6).tenDA, 1, dsDoAn.get(6).donGia,
        		dsDoUong.get(9).tenDU, 1, dsDoUong.get(9).donGia, dsThucDon.get(11), dsDoAn.get(5),
        		dsDoUong.get(9)));
        
        dsThucDonChiTiet.add(new ThucDonChiTiet(dsThucDon.get(12).maTD, dsDoAn.get(9).tenDA, 2,
				2 * dsDoAn.get(9).donGia, dsDoUong.get(6).tenDU, 2, 2 * dsDoUong.get(6).donGia, dsThucDon.get(12),
				dsDoAn.get(9), dsDoUong.get(6)));
    }
    
    //Tạo danh sách nhân viên
    // nhân viên lương >= 20tr loại 1, dưới 20tr loại 2
    public static void Taods_NhanVien()
    {
        dsNhanVien.add(new NhanVien("01", "Duy", "20 Do Xuan Hop", 20000000,
            "0836907339", 1));
        dsNhanVien.add(new NhanVien("02", "Kim", "74C Lang Tang Phu", 25000000,
           "0935769791", 2));
        dsNhanVien.add(new NhanVien("03", "Duyen", "100 Dien Bien", 10000000,
           "0837218379", 2));
        dsNhanVien.add(new NhanVien("04", "Quyen", "45 Dien May Xanh", 15000000,
           "0988197284", 2));
        dsNhanVien.add(new NhanVien("05", "Vu", "33 Vo Van Ngan", 19000000,
           "0875657433", 2));
        dsNhanVien.add(new NhanVien("06", "Nam", "16 Dang Van Bi", 17000000,
           "0987766547", 2));
        dsNhanVien.add(new NhanVien("07", "Quang", "39 Quoc Lo 13", 21000000,
           "0876456738", 1));
        dsNhanVien.add(new NhanVien("08", "Anh", "12 Nguyen Thai Hoc", 16000000,
           "0877175643", 2));
        dsNhanVien.add(new NhanVien("09", "Thanh", "16/2 Nguyen Trai", 15000000,
           "0976548321", 2));
        dsNhanVien.add(new NhanVien("10", "Tien", "43 Gia Dinh", 15000000,
           "0956738274", 1));
    }
    //
    //Tạo danh sách loại bàn
    public static void Taods_LoaiBan()
    {
        dsLoaiBan.add(new LoaiBan("A01", "ECO", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("A02", "ECO", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("A03", "ECO", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("A04", "EOC", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("B01", "HOAPHAT", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("B02", "HOAPHAT", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("B03", "HOAPHAT", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("C01", "PHONGNGHI", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("C02", "PHONGNGHI", new ArrayList<Ban>()));
        dsLoaiBan.add(new LoaiBan("C03", "PHONGNGHI", new ArrayList<Ban>()));
    }
    
    //
    //Tạo bàn
    public static void Taods_Ban()
    {
        dsBan.add(new Ban("6" , "B01", dsLoaiBan.get(5), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("7" , "B02", dsLoaiBan.get(4), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("9" , "B02", dsLoaiBan.get(4), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("13", "B01", dsLoaiBan.get(5), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("10", "C01", dsLoaiBan.get(7), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("8" , "C02", dsLoaiBan.get(8), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("11", "B03", dsLoaiBan.get(6), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("14", "C02", dsLoaiBan.get(8), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("17", "C02", dsLoaiBan.get(8), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("12", "C03", dsLoaiBan.get(8), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("18", "A01", dsLoaiBan.get(0), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("15", "A02", dsLoaiBan.get(0), new ArrayList<LichPhucVu>()));
        dsBan.add(new Ban("16", "A03", dsLoaiBan.get(6), new ArrayList<LichPhucVu>()));
        //Thêm bàn theo loại
        dsLoaiBan.get(0).dsLoaiBan.add(dsBan.get(9));
        dsLoaiBan.get(0).dsLoaiBan.add(dsBan.get(10));

        dsLoaiBan.get(4).dsLoaiBan.add(dsBan.get(1));
        dsLoaiBan.get(4).dsLoaiBan.add(dsBan.get(2));

        dsLoaiBan.get(5).dsLoaiBan.add(dsBan.get(0));
        dsLoaiBan.get(5).dsLoaiBan.add(dsBan.get(3));

        dsLoaiBan.get(6).dsLoaiBan.add(dsBan.get(5));
        dsLoaiBan.get(6).dsLoaiBan.add(dsBan.get(11));

        dsLoaiBan.get(7).dsLoaiBan.add(dsBan.get(4));

        dsLoaiBan.get(8).dsLoaiBan.add(dsBan.get(6));
        dsLoaiBan.get(8).dsLoaiBan.add(dsBan.get(7));
        dsLoaiBan.get(8).dsLoaiBan.add(dsBan.get(8));
        dsLoaiBan.get(8).dsLoaiBan.add(dsBan.get(5));
    }
    
    //
    //Tạo lịch phục vụ
    public static void Taods_LichPhucVu()
    {
        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 01, 11), "120", // 0
        		dsBan.get(11).soBan, dsBan.get(11).maLoaiBan, dsBan.get(11)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 01, 11), "112", // 1
        		dsBan.get(4).soBan, dsBan.get(4).maLoaiBan, dsBan.get(4)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 01, 11), "206", // 2
        		dsBan.get(7).soBan, dsBan.get(7).maLoaiBan, dsBan.get(7)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 01, 11), "334", // 3
        		dsBan.get(0).soBan, dsBan.get(0).maLoaiBan, dsBan.get(0)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 01, 11), "395",// 4
        		dsBan.get(8).soBan, dsBan.get(8).maLoaiBan, dsBan.get(8)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 01, 11), "991",// 5
        		dsBan.get(6).soBan, dsBan.get(6).maLoaiBan, dsBan.get(6)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 01, 11), "337", // 6
        		dsBan.get(0).soBan, dsBan.get(0).maLoaiBan, dsBan.get(0)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 10, 31), "100", // 7
        		dsBan.get(1).soBan, dsBan.get(1).maLoaiBan, dsBan.get(1)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 10, 31), "112", // 8
        		dsBan.get(1).soBan, dsBan.get(1).maLoaiBan, dsBan.get(1)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 10, 31), "206", // 9
        		dsBan.get(2).soBan, dsBan.get(2).maLoaiBan, dsBan.get(2)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 10, 31), "334", // 10
        		dsBan.get(0).soBan, dsBan.get(0).maLoaiBan, dsBan.get(0)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 10, 31), "335", // 11
        		dsBan.get(0).soBan, dsBan.get(0).maLoaiBan, dsBan.get(0)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 10, 31), "337", // 12
        		dsBan.get(9).soBan, dsBan.get(9).maLoaiBan, dsBan.get(9)));

        dsLichPhucVu.add(new LichPhucVu(LocalDate.of(2022, 10, 31), "449",// 13
        		dsBan.get(10).soBan, dsBan.get(10).maLoaiBan, dsBan.get(10)));

        // Thêm lịch phục vụ theo bàn
        
        dsBan.get(0).dslichphucvu.add(dsLichPhucVu.get(3));
        dsBan.get(0).dslichphucvu.add(dsLichPhucVu.get(6));
        dsBan.get(0).dslichphucvu.add(dsLichPhucVu.get(10));
        dsBan.get(0).dslichphucvu.add(dsLichPhucVu.get(11));

        dsBan.get(1).dslichphucvu.add(dsLichPhucVu.get(4));
        dsBan.get(1).dslichphucvu.add(dsLichPhucVu.get(7));
        dsBan.get(1).dslichphucvu.add(dsLichPhucVu.get(8));

        dsBan.get(2).dslichphucvu.add(dsLichPhucVu.get(9));

        dsBan.get(4).dslichphucvu.add(dsLichPhucVu.get(1));

        dsBan.get(5).dslichphucvu.add(dsLichPhucVu.get(5));

        dsBan.get(6).dslichphucvu.add(dsLichPhucVu.get(2));

        dsBan.get(7).dslichphucvu.add(dsLichPhucVu.get(4));

        dsBan.get(8).dslichphucvu.add(dsLichPhucVu.get(12));

        dsBan.get(9).dslichphucvu.add(dsLichPhucVu.get(13));
    }
    //
    //Tạo danh sách phân công
    public static void Taods_PhanCong()
    {
        dsPhanCong.add(new PhanCong(dsNhanVien.get(2).maNhanVien, dsLichPhucVu.get(0).ngay, dsLichPhucVu.get(0).maSoPhucVu,
        		dsLichPhucVu.get(0), dsNhanVien.get(2)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(2).maNhanVien, dsLichPhucVu.get(7).ngay, dsLichPhucVu.get(7).maSoPhucVu,
        		dsLichPhucVu.get(7), dsNhanVien.get(2)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(3).maNhanVien, dsLichPhucVu.get(0).ngay, dsLichPhucVu.get(0).maSoPhucVu,
        		dsLichPhucVu.get(0), dsNhanVien.get(3)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(3).maNhanVien, dsLichPhucVu.get(7).ngay, dsLichPhucVu.get(7).maSoPhucVu,
        		dsLichPhucVu.get(7), dsNhanVien.get(3)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(5).maNhanVien, dsLichPhucVu.get(7).ngay, dsLichPhucVu.get(7).maSoPhucVu,
        		dsLichPhucVu.get(7), dsNhanVien.get(5)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(5).maNhanVien, dsLichPhucVu.get(12).ngay, dsLichPhucVu.get(12).maSoPhucVu,
        		dsLichPhucVu.get(12), dsNhanVien.get(5)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(4).maNhanVien, dsLichPhucVu.get(7).ngay, dsLichPhucVu.get(7).maSoPhucVu,
        		dsLichPhucVu.get(7), dsNhanVien.get(4)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(4).maNhanVien, dsLichPhucVu.get(12).ngay, dsLichPhucVu.get(12).maSoPhucVu,
        		dsLichPhucVu.get(12), dsNhanVien.get(4)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(1).maNhanVien, dsLichPhucVu.get(5).ngay, dsLichPhucVu.get(5).maSoPhucVu,
        		dsLichPhucVu.get(5), dsNhanVien.get(1)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(0).maNhanVien, dsLichPhucVu.get(12).ngay, dsLichPhucVu.get(12).maSoPhucVu,
        		dsLichPhucVu.get(12), dsNhanVien.get(0)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(6).maNhanVien, dsLichPhucVu.get(1).ngay, dsLichPhucVu.get(1).maSoPhucVu,
        		dsLichPhucVu.get(1), dsNhanVien.get(6)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(6).maNhanVien, dsLichPhucVu.get(5).ngay, dsLichPhucVu.get(5).maSoPhucVu,
        		dsLichPhucVu.get(5), dsNhanVien.get(6)));
        dsPhanCong.add(new PhanCong(dsNhanVien.get(6).maNhanVien, dsLichPhucVu.get(9).ngay, dsLichPhucVu.get(9).maSoPhucVu,
        		dsLichPhucVu.get(9), dsNhanVien.get(6)));
    }
    //
    // Tạo danh sách khả năng làm
    public static void Taods_KhaNang()
    {
        dsKhaNang.add(new KhaNangLamViec("01", "B01", dsLoaiBan.get(4), dsNhanVien.get(2)));
        dsKhaNang.add(new KhaNangLamViec("03", "B02", dsLoaiBan.get(5), dsNhanVien.get(2)));
        dsKhaNang.add(new KhaNangLamViec("02", "C01", dsLoaiBan.get(7), dsNhanVien.get(2)));
        dsKhaNang.add(new KhaNangLamViec("01", "C02", dsLoaiBan.get(8), dsNhanVien.get(2)));
        dsKhaNang.add(new KhaNangLamViec("07", "A01", dsLoaiBan.get(1), dsNhanVien.get(3)));
        dsKhaNang.add(new KhaNangLamViec("02", "A02", dsLoaiBan.get(3), dsNhanVien.get(3)));
        dsKhaNang.add(new KhaNangLamViec("04", "B03", dsLoaiBan.get(6), dsNhanVien.get(3)));
        dsKhaNang.add(new KhaNangLamViec("06", "C03", dsLoaiBan.get(8), dsNhanVien.get(3)));
        dsKhaNang.add(new KhaNangLamViec("03", "A03", dsLoaiBan.get(0), dsNhanVien.get(5)));
        dsKhaNang.add(new KhaNangLamViec("03", "A04", dsLoaiBan.get(8), dsNhanVien.get(5)));
    }
    
    
    
    
    
    //
    // Tạo danh sách đặt lịch
    public static void Taods_DatLich()
    {
        dsDatLich.add(new DatLich("09", LocalDate.of(2022, 11, 01), "100", dsLichPhucVu.get(0), dsKhachHang.get(0)));
        dsDatLich.add(new DatLich("09", LocalDate.of(2022, 10, 01), "449", dsLichPhucVu.get(13), dsKhachHang.get(0)));
        dsDatLich.add(new DatLich("45", LocalDate.of(2022, 11, 01), "991", dsLichPhucVu.get(5), dsKhachHang.get(2)));
        dsDatLich.add(new DatLich("12", LocalDate.of(2022, 10, 01), "206", dsLichPhucVu.get(9), dsKhachHang.get(3)));
        dsDatLich.add(new DatLich("38", LocalDate.of(2022, 10, 01), "334", dsLichPhucVu.get(10), dsKhachHang.get(4)));
        dsDatLich.add(new DatLich("28", LocalDate.of(2022, 11, 01), "991", dsLichPhucVu.get(5), dsKhachHang.get(6)));
        dsDatLich.add(new DatLich("91", LocalDate.of(2022, 11, 01), "100", dsLichPhucVu.get(0), dsKhachHang.get(8)));
        dsDatLich.add(new DatLich("14", LocalDate.of(2022, 10, 01), "449", dsLichPhucVu.get(13), dsKhachHang.get(9)));
        dsDatLich.add(new DatLich("13", LocalDate.of(2022, 11, 01), "100", dsLichPhucVu.get(0), dsKhachHang.get(10)));
        dsDatLich.add(new DatLich("86", LocalDate.of(2022, 11, 01), "991", dsLichPhucVu.get(5), dsKhachHang.get(11)));
        dsDatLich.add(new DatLich("86", LocalDate.of(2022, 10, 01), "100", dsLichPhucVu.get(7), dsKhachHang.get(11)));
        dsDatLich.add(new DatLich("22", LocalDate.of(2022, 10, 01), "449", dsLichPhucVu.get(13), dsKhachHang.get(12)));
    }
    //
    //Câu 1: Liệt kê thông tin của nhân viên lương cao nhất
    
    public static void LambDa01_LeDucDuy()
    {
    	
    	System.out.println("--------------Ket qua cau 1------------------");
    	System.out.println("-- THONG TIN CUA NHAN VIEN LUONG CAO NHAT --");
    	dsNhanVien.stream()
		.filter(x -> (dsNhanVien.stream().max(Comparator.comparingDouble(n -> n.Luong)).get()).Luong == x.Luong)
		.forEach(x -> System.out.printf("Ma nhan vien: %s, Ten nhan vien: %s, Loai nhan vien: %s.\n", x.maNhanVien,
				x.tenNV, (x.loaiNV == 1) ? "Dau bep" : "Phuc vu"));
    }

    
    //
    //Câu 2: Tính lương trung bình của đầu bếp và phục vụ
    
    public static void LambDa02_LeDucDuy()
    {
    	System.out.println("--------------Ket qua cau 2------------------");
    	System.out.println("-- TINH LUONG TRUNG BINH CUA DAU BEP VA PHUC VU --");
    	double TB1 = dsNhanVien.stream().filter(n -> n.loaiNV == 1).collect(Collectors.averagingDouble(n -> n.Luong));
		System.out.printf("Luong trung binh cua dau bep: %.2f\n", TB1);
		System.out.println("---------------------------");
    	double TB2 = dsNhanVien.stream().filter(n -> n.loaiNV == 2).collect(Collectors.averagingDouble(n -> n.Luong));
		System.out.printf("Luong trung binh cua nhan vien: %.2f\n", TB2);
    }
    
    
    //
    //Câu 3: Cho biết số lượng bàn do các hãng sản xuất
    
    public static void LambDa03_LeDucDuy()
    {
    	System.out.println("--------------Ket qua cau 3------------------");
    	System.out.println("-- SO LUONG BAN DO CAC HANG SAN XUAT --");
    	
    	Map<Object, Long> q3 = dsBan.stream()
				.flatMap(b -> dsLoaiBan.stream().filter(lb -> lb.maLoaiBan == lb.maLoaiBan))
				.collect(Collectors.groupingBy(x -> x.hangSanXuat, Collectors.counting()));
		for (Map.Entry<Object, Long> n : q3.entrySet()) {
			System.out.printf("Hang san xuat: %s, So luong: %s.\n", n.getKey(), n.getValue().toString());
		}
    	
    }
    
    //
    //Câu 4: Liệt kê danh sách nhân viên theo loại
    
    public static void LambDa04_LeDucDuy()
    {
    	System.out.println("--------------Ket qua cau 4------------------");
    	System.out.println("-- LIET KE DANH SACH NHAN VIEN THEO LOAI --");
    	
    	Map<Object, List<NhanVien>> q4 = dsNhanVien.stream().collect(Collectors.groupingBy(n -> n.loaiNV));
		for (Map.Entry<Object, List<NhanVien>> n : q4.entrySet()) {
			System.out.printf("Danh sach nhan vien la: %s\n", ((int) n.getKey() == 1) ? "Dau bep" : "Phuc Vu");
			for (NhanVien i : n.getValue())
				System.out.printf("Ma nhan vien: %s, Ten nhan vien: %s, Dia chi: %s.\n", i.maNhanVien, i.tenNV, i.diaChi);
		}
    }
    
    //
    //Câu 5: Cho biết danh sách của các món ăn và thức uống có giá dưới 20 000
    
    public static void LambDa05_LeDucDuy()
    {
    	System.out.println("--------------Ket qua cau 5------------------");
    	System.out.println("-- LIET KE DANH SACH CAC MON AN VA THUC UONG CO GIA DUOI 20 000 --");
    	
    	List<DoAn> dsmon = dsDoAn.stream().collect(Collectors.toList());
		System.out.println("--Danh sach mon an duoi 20 000---");
		for (DoAn kq : dsmon) {
			if (kq.donGia < 20000) {
				System.out.println("Ten mon: " + kq.tenDA + " - " + "Gia: " + kq.donGia);
			}
		}

		System.out.println("---------------------------------");

		List<DoUong> dsuong = dsDoUong.stream().collect(Collectors.toList());
		System.out.println("--Danh sach thuc uong duoi 20 000---");
		for (DoUong kq : dsuong) {
			if (kq.donGia < 20000) {
				System.out.println("Ten mon: " + kq.tenDU + " - " + "Gia: " + kq.donGia);
			}
		}
    }
    
    	
    	
	public static void main(String[] args) 
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
        // 5 câu Lamda
        LambDa01_LeDucDuy();
        LambDa02_LeDucDuy();
        LambDa03_LeDucDuy();
        LambDa04_LeDucDuy();
        LambDa05_LeDucDuy();

	}

}
