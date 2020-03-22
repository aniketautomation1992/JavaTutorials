package OOPConcepts;

public class CallByValueAndCallByRef {

	int p;
	int r;

	public static void main(String[] args) {

		CallByValueAndCallByRef cbcr = new CallByValueAndCallByRef();
		int x = 10;
		int y = 30;
//		call by value
		int q = cbcr.sum(x, y);
		System.out.println(q);
		cbcr.p = 100;
		cbcr.r = 200;
//		call by reference
		cbcr.swap(cbcr);
//		After swap
		System.out.println(cbcr.p);
		System.out.println(cbcr.r);
	}

//	call by value
	public int sum(int a, int b) {
		a = 3;
		b = 7;
		int c = a + b;
		return c;
	}

//	call by reference
	public void swap(CallByValueAndCallByRef cbcr2) {
		int temp;
		temp = cbcr2.p;
		cbcr2.p = cbcr2.r;
		cbcr2.r = temp;
	}
}