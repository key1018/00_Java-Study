package com.test3.model.vo;

public class Music {
	
	// 필드 == 인스턴스 변수 == 멤버변수
		private String artist;
		private String album;
		private String drop;
		private double time;
		private int price;
		
		// 기본생성자
		
		public Music() {
			
		}
		
		// 매개변수생성자
		
		public Music(String artist, String album, String drop, double time, int price) {
			this.artist = artist;
			this.album = album;
			this.drop = drop;
			this.time = time;
			this.price = price;
		}
		
		// setter메소드
		
		public void setAlbum(String album) {
			this.album = album;
		}
		
		public void setArtist(String artist) {
			this.artist = artist;
		}
		
		public void setDrop(String drop) {
			this.drop = drop;
		}
		
		public void setTime(double time) {
			this.time = time;
		}
		
		public void setPrice(int price) {
			this.price = price;
		}
		
		// getter메소드
		
		public String getArtist() {
			return artist;
		}
		
		public String getAlbum() {
			return album;
		}
		
		public String getDrop() {
			return drop;
		}
		
		public double getTime() {
			return time;
		}
		
		public int getPrice() {
			return price;
		}	
		
		// information 메소드
		
		public String information() {
			return "가수 : " + artist + ",  앨범명 : " + album + ",  발매일 : " + drop + ",  러닝타임 : " 
						+ time + ",  가격 : " + price + "원";
		}

}
