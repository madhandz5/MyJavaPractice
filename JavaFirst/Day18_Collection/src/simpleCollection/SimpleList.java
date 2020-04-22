package simpleCollection;

import java.util.Iterator;

public class SimpleList<E> implements Iterable<E> {

	int arraySize = 10;
	int index = 0;
	Object[] sList;
	Object[] expandList;

	public SimpleList() {
		this.sList = new Object[arraySize];
	}

	public SimpleList(int arraySize) {
		this.sList = new Object[arraySize];
	}

	public void add(E obj) {
		if (index >= arraySize) {
			arraySize = arraySize * 2;
			expandList = new Object[arraySize];

			for (int i = 0; i < sList.length; i++) {
				expandList[i] = sList[i];
			}
			sList = expandList;
		}
		sList[index] = obj;
		index++;
	}

	public Object get(int i) {

		if (i >= sList.length) {
			System.out.println("리스트 크기가 지정한 인덱스보다 작습니다.");
		}
		return sList[i];
	}

	public Object[] getAll() {
		Object[] res = new Object[index];
		for (int i = 0; i < index; i++) {
			res[i] = sList[i];
		}
		return res;
	}

	@Override
	public Iterator<E> iterator() {
		return new Iteratortest<E>();
	}

	private class Iteratortest<E> implements Iterator<E> {

		int iterIdx = 0;

		@Override
		public boolean hasNext() {
			if (iterIdx < index) {
				return true;
			} else {
				return false;
			}
		}

		@Override
		public E next() {

			Object res = sList[iterIdx];
			iterIdx++;
			return (E) res;
		}

	}
}
