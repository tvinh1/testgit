package main;

public class SinhVienKhoaTuNhien extends sinhvien{
	private Double Toan;
	private Double Ly;
	private Double Hoa;
	private Double DiemTB;
	public Double getToan() {
		return Toan;
	}
	public void setToan(Double toan) {
		Toan = toan;
	}
	public Double getLy() {
		return Ly;
	}
	public void setLy(Double ly) {
		Ly = ly;
	}
	public Double getHoa() {
		return Hoa;
	}
	public void setHoa(Double hoa) {
		Hoa = hoa;
	}
	public SinhVienKhoaTuNhien(String Ten,String Khoa,Double Toan,Double Ly,Double Hoa){
		 super(Ten, Khoa);
		 this.Toan= Toan;
		 this.Ly= Ly;
		 this.Hoa= Hoa;
	 }
	public void output() {
		System.out.println("{ Truong: "+super.Truong +"  "
							+"Ten: "+super.getTen()+"  "
							+"Khoa: "+super.getKhoa()+"  "
							+"Toan: "+this.getToan()+"  "
							+"Ly: "+this.getLy()+"  "
							+"Hoa: "+this.getHoa());
		
	}
	public void TDiemTB() {
		DiemTB=((this.getToan()*2)+this.getLy()+this.getHoa())/4;
		System.out.println("Ten: "+super.getTen()+"  "
							+"Khoa: "+super.getKhoa()+"  "
							+"Diem TB:"+DiemTB);
	}
	Double TinhDTB() {
		return ((this.getToan()*2)+this.getLy()+this.getHoa())/4;
	}
}