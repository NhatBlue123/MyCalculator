import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
		private ArrayList<SinhVien> danhSach;
		
		public DanhSachSinhVien() {
			this.danhSach = new ArrayList<SinhVien>();
		}
		
		public DanhSachSinhVien(ArrayList danhSach) {
			this.danhSach = danhSach;
		}
		
		// 1.	Thêm sinh viên vào danh sách.
		public void themSinhVien(SinhVien sv) {
			this.danhSach.add(sv);
		}
		
//		2.	In danh sách sinh viên ra màn hình.
		public void inDanhSachSinhVien() {
			for (SinhVien sinhVien : danhSach) {
				System.out.println(sinhVien);
			}
		}
		
//		3.	Kiểm tra danh sách có rỗng hay không.
		public boolean kiemTraDanhSachRong() {
			return this.danhSach.isEmpty();
		}
		
//		4.	Lấy ra số lượng sinh viên trong danh sách.
		public int laySoLuongSinhVien() {
			return this.danhSach.size();
		}
		
//		5.	Làm rỗng danh sách sinh viên.
		public void lamRongDanhSach() {
			this.danhSach.removeAll(danhSach);
		}
		
//		6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
		public boolean kiemTraTonTai(SinhVien sv) {
			return this.danhSach.contains(sv);
		}
		
//		7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
		public boolean xoaSinhVien(SinhVien sv) {
			return this.danhSach.remove(sv);
		}
		
//		8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
		public void timSinhVien(String ten) {
			for (SinhVien sinhVien : danhSach) {
				if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
					System.out.println(sinhVien);
				}
			}
		}
//		9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
		public void sapXepSinhVienGiamDanTheoDiem() {
			Collections.sort(this.danhSach, new Comparator<SinhVien>() {

				@Override
				public int compare(SinhVien o1, SinhVien o2) {
					// TODO Auto-generated method stub
					if(o1.getDiemTrungBinh() < o2.getDiemTrungBinh())
					{
						return 1;
					}
					else if(o1.getDiemTrungBinh() > o2.getDiemTrungBinh())
					{
						return -1;
					}
					else
					{
						return 0;
					}
				}
			});
		}
		public void inDanhSachSVRaFile(File file)
		{
			try {
				OutputStream os = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(os);
				for (SinhVien sinhVien : danhSach) {
					oos.writeObject(sinhVien);
				}
				oos.flush();
				oos.close();
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		public void doDanhSachSachSVTuFile(File file)
		{
			try {
				InputStream is = new FileInputStream(file);
				ObjectInputStream obs = new ObjectInputStream(is);
				SinhVien sv = (SinhVien) obs.readObject();//Ép kiểu
				for (SinhVien sinhVien : danhSach) {
					System.out.println(danhSach);
				}
				obs.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}