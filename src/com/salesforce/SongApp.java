package com.salesforce;

public class SongApp {

	public static void main(String[] args) {
		Song music1 = new Song();
		
		music1.setAlbum("Real");
		music1.setArtist("아이유");
		music1.setYear(2010);
		music1.setTrack(3);
		music1.setComposer("이민수");
		music1.setTitle("좋은날");
		
		music1.getAlbum();
		music1.getArtist();
		music1.getTrack();
		music1.showinfo();
		System.out.print('\n');
		System.out.println(music1.toString());
		System.out.println(music1.getArtist());
		

	}

}
