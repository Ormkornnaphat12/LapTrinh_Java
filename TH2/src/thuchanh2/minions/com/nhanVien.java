package thuchanh2.minions.com;
import java.util.Scanner;

public class nhanVien {
	private String Ho;
	private String Ten;
	private int soSP;
	public nhanVien(String Ho, String Ten, int soSP)
	{
		this.Ho = Ho;
		this.Ten = Ten;
		if (soSP<0)
		{
			this.soSP = 0;
		}else {
			this.soSP = soSP;
		}
		
	}
	public String getHo() {return Ho; }
	public void setHo(String Ho){this.Ho = Ho; }
	public String getTen() {return Ten; }
	public void setTen(String Ten) {this.Ten = Ten; }
	public int getSoSP() {return soSP; }
	public void setSoSP(int soSP) {
		if (soSP<0)
			this.soSP = 0;
			else
				this.soSP = soSP;
	}
	public double getLuong()
	{
		double donGia;
		if(soSP>=1 && soSP<=199) donGia = 0.5;
		else if (soSP >= 200 && soSP <= 399) donGia = 0.55;
        else if (soSP >= 400 && soSP <= 599) donGia = 0.6;
        else donGia = 0.65;
		return soSP * donGia;
	}
	public boolean lonHon(nhanVien nv2)
	{
		return this.soSP > nv2.soSP;
		
	}
}
