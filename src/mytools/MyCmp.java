package mytools;

import java.util.ArrayList;
import java.util.Comparator;

public class MyCmp {
	static public Comparator<YueBin> c = new Comparator<YueBin>() {
		public int compare(YueBin o1, YueBin o2) {
			int out = 0;
			if (o1.getPrice() > o2.getPrice())
				out = 1;
			else if (Math.abs(o1.getPrice() - o2.getPrice()) < 1e-10)
				out = 0;
			else
				out = -1;
			return out;
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<YueBin> a = new ArrayList<YueBin>();
		for(int i=0; i<10; i++) {
			a.add(
		        new YueBin(100*(i+1), (int)( 100*Math.random() + 1 ))
		        );
		}
		a.sort(c);
		System.out.println(a);
	}

}

class YueBin {
	public double danJia;
	public int zongJia;
	public int xiaoLiang;
	public YueBin(int zongJia, int xiaoLiang) {
		this.zongJia = zongJia;
		this.xiaoLiang = xiaoLiang;
		this.danJia = (zongJia + 0.0) / xiaoLiang;
	}
	
	public double getPrice() {
		return this.danJia;
	}
	
	public String toString() {
		return String.format("%.0f", danJia);
	}
}
