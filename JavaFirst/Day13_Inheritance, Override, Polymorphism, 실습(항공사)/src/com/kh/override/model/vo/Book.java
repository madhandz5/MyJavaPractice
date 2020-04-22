package com.kh.override.model.vo;

// * 1. �������̵�
// * - �ڽ� Ŭ������ ��ӹ��� �θ� Ŭ������ �޼ҵ带 �� ���� �ϴ� ��.
// * �������̵� ��������
// * 1) �޼ҵ�� ����
// * 2) �Ű����� ���� , Ÿ�� ����
// * 3) ��ȯ�� ����
// * 4) �� ���������ڴ�, �θ𺸴� ���ų� ���� ������ ������ �� ����.

public class Book {

	private String title;
	private String author;
	private int price;

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + price;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		// * 1. ��ü�� �ּҰ� ������ ������ ������ �ʰ� true
		if (this == obj)
			return true;
		// * 2. ���޹��� ��ü�� null �̸� ������ ���� �ʿ䰡 ���� ������ false
		if (obj == null)
			return false;
		// * 3. ���޹��� ��ü�� ���� ��ü�� ���� Ŭ�������� Ȯ�� ��
		// * Ŭ������ �ٸ��� ���� �ʿ䰡 ���� ������ false
		if (getClass() != obj.getClass())
			return false;

		// * ���� �ʵ� �� ��
		Book other = (Book) obj;
		// * �� �ν��Ͻ��� �۰��� null�ε�, �Ű������� �Ѿ�� �ν��Ͻ��� �۰��� null�� �ƴϸ� false
		if (author == null) {
			if (other.author != null)
				return false;

		}
		// * �� �ν��Ͻ��� author ������ ���� , �Ű������� �Ѿ�� �ν��Ͻ��� author�� ���� �ٸ��� false
		else if (!author.equals(other.author))
			return false;
		// * �� �ν��Ͻ��� price ������ ����, �Ű������� �Ѿ�� �ν��Ͻ��� price ������ ���� �ٸ��� false
		if (price != other.price)
			return false;
		// * �� �ν��Ͻ��� title ������ ���� null�ε�, �Ű������� �Ѿ�� �ν��Ͻ��� title ������ ���� null�� �ƴϸ� false
		if (title == null) {
			if (other.title != null)
				return false;
		}
		// * �� �ν��Ͻ��� title ������ ����, �Ű������� �Ѿ�� �ν��Ͻ��� title ������ ���� �ٸ��� false
		else if (!title.equals(other.title))
			return false;
		// * ���� ���ǿ� ��� �Ȱɸ��� true ��ȯ
		return true;
	}

}
