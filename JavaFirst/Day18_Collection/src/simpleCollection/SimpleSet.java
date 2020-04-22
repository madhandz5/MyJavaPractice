package simpleCollection;

public class SimpleSet {

	int arraySize = 31;
	int arrIdx = 0;
	Object[] sHashSet;

	public SimpleSet() {
		sHashSet = new Object[arraySize];
	}

	public void add(Object val) {
		int idx = simpleHashMethod(val, arraySize);
		if (sHashSet[idx] == null) {
			sHashSet[idx] = val;
			arrIdx++;
		}
	}

	private int simpleHashMethod(Object val, int arraySize) {

		// * - val의 해시코드 (주소의 해싱값)을 받음
		int res = Math.abs(val.hashCode());
		// * - 받은 해싱값을 소수인 31로 나눈 나머지를 res에 담음
		// * - 31은 소수이기 때문에 1과 자기 자신으로만 나누어 떨어진다.
		res %= arraySize;
		return res;
	}
}
