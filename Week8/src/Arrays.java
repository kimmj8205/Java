import java.util.*;

public class Arrays {
	private int [] r;

	public static void main(String[] args) {
		int size = 5;
		Arrays arrs = new Arrays(size);
		
		arrs.insert();
		System.out.println("Insert 결과 ");
		arrs.print();
		
		arrs.replace(3, 9);
		System.out.println("Replace 결과 ");
		arrs.print();
		
		arrs.reverse();
		System.out.println("Reverse 결과 ");
		arrs.print();
		
		arrs.sort();
		System.out.println("Sort 결과 ");
		arrs.print();

	}
	
	public Arrays(int size) {
		this.r = new int[size];
	}
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<r.length;i++) {
			System.out.print(i + "번째 수 입력 ");
			this.r[i] = sc.nextInt();
		}
		System.out.println("");
	}
	
	public void replace(int index, int value) {
		this.r[index] = value;
	}
	
	public void print() {
		for (int i=0; i<this.r.length;i++) {
			System.out.print(this.r[i]);
			System.out.print(",");
		}
		System.out.println("");
	}
	
	public void reverse() {
		int a;
		
		for (int i=0;i<this.r.length/2-1;i++) {
			a=this.r[i];
			this.r[i]=this.r[r.length-1-i];
			this.r[r.length-1-i]=a;
		}
			
		
		
	}
	
	public void sort() {
		int a=0;
		for(int i=0;i<this.r.length;i++) {
			for (int j=0; j<this.r.length-1-i; j++)
			{
				if (this.r[j]>this.r[j+1])
				{
					a = this.r[j];
					this.r[j] = this.r[j+1];
					this.r[j+1] = a;
				}
			}
		}
	}

}
