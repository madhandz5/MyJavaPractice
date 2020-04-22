package SetPrac;

import java.util.HashSet;

public class SetPrac {

	public static void main(String[] args) {

		lottoDisplay();

	}

	public static void lottoDisplay() {

		HashSet<Integer> set = new HashSet<>();
		while (!(set.size() == 6)) {
			int lottoNum = (int) (Math.random() * 45 + 1);
			set.add(lottoNum);
		}
		System.out.println(set);
	}
}
