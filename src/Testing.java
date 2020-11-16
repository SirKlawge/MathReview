import java.util.List;
import java.util.ArrayList;

public class Testing {

	public static void main(String[] args) {
		MySet<Integer> set1 = new MySet<Integer>();
		set1.add(1);
		set1.add(2);
		MySet<Integer> set2 = new MySet<Integer>();
		set2.add(2);
		set2.add(23);
		System.out.println(set1.xor(set2));
	}

}
