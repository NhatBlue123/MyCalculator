import java.io.Serializable;
import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>, Serializable{
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private double diemTrungBinh;
	
	public SinhVien(String maSV)
	{
		this.maSinhVien = maSV;
	}
	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, double diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	
	
	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}

	@Override
	public int compareTo(SinhVien o) {
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Double.doubleToLongBits(diemTrungBinh) == Double.doubleToLongBits(other.diemTrungBinh)
				&& Objects.equals(hoVaTen, other.hoVaTen) && Objects.equals(maSinhVien, other.maSinhVien)
				&& namSinh == other.namSinh;
	}

	

	
}