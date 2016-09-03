package y1025;

public class DLinkedList {
	DNode base = new DNode(Integer.MIN_VALUE);
	int size = 0;
	public DLinkedList () {
		base.next = base;
		base.prev = base;
	}
	
	public void add(int a) {
		if (size == 0) {
			base.next = new DNode(a, base, base);
		}
		else {
			base.prev = new DNode(a, base.prev, base);
			base.prev.prev.next = base.prev;
		}
		size ++;
	}
	
	public String toString() {
		if (size == 0) {
			return "Empty List";
		}
		else {
			StringBuilder s = new StringBuilder();
			DNode navi = base;
			while(navi.next != base) {
				navi = navi.next;
				s.append(navi.val+"->");
			}
			s.delete(s.length()-2, s.length());
			return s.toString();
		}
	}
	
	public String toReversedString() {
		if (size == 0) {
			return "Empty List";
		}
		else {
			StringBuilder s = new StringBuilder();
			DNode navi = base;
			while(navi.prev != base) {
				navi = navi.prev;
				s.append(navi.val+"<-");
			}
			s.delete(s.length()-2, s.length());
			return s.toString();
		}
	}
	
	public static void main(String[] args) {
		DLinkedList test = new DLinkedList();
		for (int i=0; i<10; i++) {
			test.add((int)(Math.random()*100+1));
		}
		System.out.println(test.toString());
		System.out.println(test.toReversedString());
	}
	
}

class DNode {
	int val;
	DNode prev;
	DNode next;
	public DNode(int val) {
		this.val = val;
		prev = null;
		next = null;
	}
	public DNode(int val, DNode prev, DNode next) {
		this.val = val;
		this.prev = prev;
		this.next = next;
	}
}
