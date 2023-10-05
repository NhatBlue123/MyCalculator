import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class test {
    private Map<String, String> duLieu = new TreeMap<String, String>();

    public String themTu(String key, String giaTri) {
        return this.duLieu.put(key, giaTri);
    }

    public String xoaTu(String key) {
        return this.duLieu.remove(key);
    }

    public String traTu(String key) {
        String yNghia = this.duLieu.get(key);
        return yNghia;
    }

    public void inTuKhoa() {
        Set<String> dulieuKey = this.duLieu.keySet();
        System.out.println(Arrays.toString(dulieuKey.toArray()));
    }

    public int laySoLuong() {
        return this.duLieu.size();
    }

    public void xoaTatCaTuDien() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        test tuDien = new test();
        Scanner sc = new Scanner(System.in);
        System.out.getClass();
        while (true) {
            System.out.println("-----MENU-----");
            System.out.println("1.Thêm Từ.");
            System.out.println("2.Xóa Từ.");
            System.out.println("3.Tra Từ.");
            System.out.println("4.In Từ Khóa.");
            System.out.println("5.In Số Lượng Từ Khóa.");
            System.out.println("6.Xóa Hết Từ Trong Từ Điển.");
            System.out.println("0.Exit.");
            int chon;
            chon = sc.nextInt();
            sc.nextLine(); // Đọc dòng thừa sau khi nhập số

            if (chon == 1) {
                System.out.println("Nhập Từ Khóa Và Giá Trị: ");
                System.out.print("Từ Khóa: ");
                String key = sc.nextLine();
                System.out.println("Gía Trị: ");
                String gt = sc.nextLine();
                tuDien.themTu(key, gt);
            } else if (chon == 2) {
                System.out.println("Nhập Từ Khóa Cần Xóa: ");
                String key = sc.nextLine();
                tuDien.xoaTu(key);
            } else if (chon == 3) {
                System.out.println("Nhập Từ Khóa Cần Tra:");
                String key = sc.nextLine();
                System.out.println("Giá Trị Ý Nghĩa Của Key Là: " + tuDien.traTu(key));
            } else if (chon == 4) {
                System.out.print("Từ Khóa Có Trong Từ Điển Là: ");
                tuDien.inTuKhoa();
            } else if (chon == 5) {
                System.out.println("Số Lượng Từ Khóa Có Trong Từ Điển: " + tuDien.laySoLuong());
            } else if (chon == 6) {
                System.out.println("Bạn có chắc muốn xóa không?: ");
                String luachon;
                System.out.println("Yes/No.:");
                luachon = sc.nextLine();
                if (luachon.equals("Yes")) {
                    tuDien.xoaTatCaTuDien();
                } else {
                    System.out.println("Bạn Đã Không Xóa.");
                }
            } else if (chon == 0) {
                break;
            } else {
                System.out.println("Nhập số phù hợp.");
            }
        }
    }
}
