package model.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Boram
 *
 */
public class Book {
	
	private String title;		// 제목
	private String author;		// 저자
	private String publisher;	// 출판사
	private Date publishDate;	// 출판일
	private int price;			// 가격
	
	public Book() {
		
	}
	
	public Book(String title, String author, String publisher, Date publishDate, int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publishDate = publishDate;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		
		// 출판일(Date publishDate) 형식을 SimpleDateFormat을 이용하여 "0000년 00월 00일" 형태의 문자열 형식으로 만들어 하단의 주석에 반영시키시오
		
		// 코드 작성
		
		// 1) SimpleDateFormat을 활용하여 문자열 형식 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); // 년 : yyyy, 월 : MM, 일 : dd
		
		// 2) 1번 문자열을 토대로 DATE publishDate를 문자열 형식으로 변환하기
		String formatDate = sdf.format(publishDate);
		
		// 3) return 값에 문자열 형식으로 변환한 DATE값 넣기
		return "Book [title=" + title + ", author=" + author + ", publisher=" + publisher + ", publishDate="
				+ /* 반영 */formatDate + ", price=" + price + "]";
	}

}
