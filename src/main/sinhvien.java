package main;

public abstract class sinhvien {
	public static String Truong="JavaBasic";
	private String Ten;
	private String Khoa;
	
	
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public sinhvien(String Ten,String Khoa){
		this.Ten =Ten;
		this.Khoa=Khoa;
	}
	
}