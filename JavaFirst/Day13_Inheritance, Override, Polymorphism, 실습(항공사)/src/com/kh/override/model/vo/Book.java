package com.kh.override.model.vo;

// * 1. 오버라이딩
// * - 자식 클래스가 상속받은 부모 클래스의 메소드를 재 정의 하는 것.
// * 오버라이드 성립조건
// * 1) 메소드명 동일
// * 2) 매개변수 개수 , 타입 동일
// * 3) 반환형 동일
// * 4) 단 접근제한자는, 부모보다 같거나 넓은 범위로 지정할 수 있음.

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

		// * 1. 객체의 주소가 같으면 실제값 비교하지 않고 true
		if (this == obj)
			return true;
		// * 2. 전달받은 객체가 null 이면 실제값 비교할 필요가 없기 때문에 false
		if (obj == null)
			return false;
		// * 3. 전달받은 객체와 현재 객체가 같은 클래스인지 확인 후
		// * 클래스가 다르면 비교할 필요가 없기 때문에 false
		if (getClass() != obj.getClass())
			return false;

		// * 이제 필드 값 비교
		Book other = (Book) obj;
		// * 이 인스턴스의 작가가 null인데, 매개변수로 넘어온 인스턴스의 작가가 null이 아니면 false
		if (author == null) {
			if (other.author != null)
				return false;

		}
		// * 이 인스턴스의 author 변수의 값이 , 매개변수로 넘어온 인스턴스의 author의 값과 다르면 false
		else if (!author.equals(other.author))
			return false;
		// * 이 인스턴스의 price 변수의 값이, 매개변수로 넘어온 인스턴스의 price 변수의 값과 다르면 false
		if (price != other.price)
			return false;
		// * 이 인스턴스의 title 변수의 값이 null인데, 매개변수로 넘어온 인스턴스의 title 변수의 값이 null이 아니면 false
		if (title == null) {
			if (other.title != null)
				return false;
		}
		// * 이 인스턴스의 title 변수의 값이, 매개변수로 넘어온 인스턴스의 title 변수의 값이 다르면 false
		else if (!title.equals(other.title))
			return false;
		// * 위의 조건에 모두 안걸리면 true 반환
		return true;
	}

}
