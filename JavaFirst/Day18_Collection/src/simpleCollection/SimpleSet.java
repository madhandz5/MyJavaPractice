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

		// * - val�� �ؽ��ڵ� (�ּ��� �ؽ̰�)�� ����
		int res = Math.abs(val.hashCode());
		// * - ���� �ؽ̰��� �Ҽ��� 31�� ���� �������� res�� ����
		// * - 31�� �Ҽ��̱� ������ 1�� �ڱ� �ڽ����θ� ������ ��������.
		res %= arraySize;
		return res;
	}
}
