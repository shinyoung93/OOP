package com.salesforce;

public class Song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return "album " + album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}

	
	public Song(String title, String artist) {
		//this(title, artist, null, null, null, null);
		this.title = title;
		this.artist = artist;
	}

	public Song() {
		
	}

	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	public void showinfo() {
		System.out.print(this.artist +"," + this.title);
		System.out.print("( " + this.album + "," + year +","+ track + "번 track," + composer + "작곡 )");
	}
}
