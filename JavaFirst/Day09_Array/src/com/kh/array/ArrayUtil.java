package com.kh.array;

public class ArrayUtil {

	// ���� �ε����� ���� �ε������� Ŭ ��� �ڸ� ��ȯ
	// �ƴ� ��� �״�� ����
	public int[] sort(int[] iArr) {

		for (int i = 0; i < iArr.length - 1; i++) {
			for (int j = 0; j < iArr.length - i - 1; j++) {
				if (iArr[j] > iArr[j + 1]) {
					int temp = iArr[j];
					iArr[j] = iArr[j + 1];
					iArr[j + 1] = temp;
				}
			}
		}
		return iArr;
	}
	// ù��° �Ű������� �Ѱܹ��� int �迭��,
	// �ι�° �Ű������� �Ѱܹ��� ���ڸ� �߰��ϴ� �޼��带 �����Ͻÿ�.

	public int[] add(int[] iArr, int data) {
		int[] res = new int[iArr.length + 1];
		for (int i = 0; i < iArr.length; i++) {
			res[i] = iArr[i];
		}
		res[res.length - 1] = data;
		return res;
	}

	// 1. addAll
	// ù��° �Ű������� �Ѱܹ��� int�迭�� �ڿ�
	// �ι�° �Ű������� �Ѱܹ��� int�迭�� ���ļ� ��ȯ�ϴ� �ڵ带 �ۼ��Ͻÿ�.

	public int[] addAll(int[] iArr, int[] secndArr) {

		int[] res = new int[iArr.length + secndArr.length];

		for (int i = 0; i < iArr.length; i++) {
			res[i] = iArr[i];

		}
		for (int j = iArr.length; j < res.length; j++) {
			{
				res[j] = secndArr[j - iArr.length];
			}
		}

		return res;

	}

	// 2. set
	// ù��° �Ű������� �Ѱܹ��� �迭��
	// (�ι�° �Ű������� �Ѱܹ���) �ε�����
	// (����° �Ű������� �Ѱܹ���) ���� ����� �ڵ带 �ۼ��ϼ���.

	public void set(int[] iArr, int idx, int data) {

		iArr[idx] = data;

	}

	// 3. subArr
	// ù��° �Ű������� �Ѱܹ��� �迭��
	// (�ι�° �Ű������� �Ѱܹ���) �ε�������
	// (����° �Ű������� �Ѱܹ���) �ε��� �� ���� �߶� �迭�� ��ȯ�ϴ� �޼��带
	// �ۼ��ϼ���

	// int[] data = new int[]{1,2,3,4,5};
	// subArr(data,0,2) ->[1,2];

	public int[] subArr(int[] iArr, int fromIdx, int toIdx) {

		int[] res = new int[toIdx - fromIdx];
		int j = 0;

		for (int i = fromIdx; i < toIdx; i++) {
			res[j] = iArr[i];
			j++;
		}
		return res;
	}

	// 4. remove
	// ù��° �Ű������� �Ѱܹ��� �迭��
	// (�ι�° �Ű������� �Ѱܹ���) �ε����� �ش��ϴ� ���� �����ϰ�
	// �迭�� ũ�⸦ �ٽ� ������ ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.
	// int[] data = new int[]{1,2,3,4,5};
	// remove(data,2) ->[1,2,4,5]

	public int[] remove(int[] iArr, int idx) {
		int[] res = new int[iArr.length - 1];

		for (int i = 0; i < res.length; i++) {

			if (i < idx) {
				res[i] = iArr[i];
			} else {
				res[i] = iArr[i + 1];
			}
		}
		return res;
	}

}
