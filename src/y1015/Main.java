package y1015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int lo = in.nextInt();
		int hi = in.nextInt();
		ArrayList<Student> lst = new ArrayList<Student>();
		
		for(int i=0; i<N; i++)
		{
			int id = in.nextInt();
			int de = in.nextInt();
			int cai = in.nextInt();
			if (de>=lo && cai >=lo)
			{
				lst.add(new Student(id, de, cai, lo, hi));
			}
		}
		in.close();
		
		System.out.println(lst.size());
		
		Collections.sort(lst);
		
		for(Student s: lst) {
			System.out.println(s);
		}	
	}

}

class Student implements Comparable<Student> {
	int ID;
	int de;
	int cai;
	int L;
	int H;
	int zongFen;
	public Student(int ID, int de, int cai, int L, int H) {
		this.ID = ID;
		this.de = de;
		this.cai = cai;
		this.zongFen = de + cai;
		this.L = L;
		this.H = H;
	}
	
	@Override
	public int compareTo(Student another) {
		int out = 0;
		if (deCaiShuangQuan(this) && deCaiShuangQuan(another))
		{
			out = zongFenSort(this, another);
		}
		else if (deCaiShuangQuan(this) && !deCaiShuangQuan(another))
		{
			out = 1;
		}
		else if (!deCaiShuangQuan(this) && deCaiShuangQuan(another))
		{
			out = -1;
		}
		else if (youDe(this) && youDe(another))
		{
			out = zongFenSort(this, another);
		}
		else if (youDe(this) && !youDe(another))
		{
			out = 1;
		}
		else if (!youDe(this) && youDe(another))
		{
			out = -1;
		}
		else if (weiJunZi(this) && weiJunZi(another))
		{
			out = zongFenSort(this, another);
		}
		else if (weiJunZi(this) && !weiJunZi(another))
		{
			out = 1;
		}
		else if (!weiJunZi(this) && weiJunZi(another))
		{
			out = -1;
		}
		else
		{
			out = zongFenSort(this, another);
		}
		return -out;
	}
	
	public String toString() {
		return this.ID+" "+this.de+" "+this.cai;
	}
	
	public static boolean deCaiShuangQuan(Student s) {
		if (s.de>=s.H && s.cai>=s.H)
			return true;
		else
			return false;
	}
	
	public static boolean youDe(Student s) {
		if (s.de > s.H)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean weiJunZi(Student s) {
		if (  (s.de > s.cai) && (s.de < s.H)   )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	public static int zongFenSort(Student s1, Student s2) {
		if (s1.zongFen > s2.zongFen)
		{
			return 1;
		}
		else if (s1.zongFen == s2.zongFen)
		{
			if (s1.de > s2.de)
			{
				return 1;
			}
			else if (s1.de < s2.de)
			{
				return -1;
			}
			else {
				if (s1.ID > s2.ID)
				{
					return -1;
				}
				else
				{
					return 1;
				}
			}
		}
		else
		{
			return -1;
		}
	}
}