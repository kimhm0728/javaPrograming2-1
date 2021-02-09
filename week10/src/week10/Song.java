package week10;
import java.util.Arrays;

class Song {
	private String title;
	private String artist;
	private String album;
	private String composer[];
	private int year;

	public Song() {
		super();
	}

	public Song(String title, String artist, String album, 
			String[] composer, int year) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	
	public void show() {
		System.out.println("�뷡 ����:"+title);
		System.out.println("����:"+artist);
		System.out.println("�ٹ�:"+album);
		System.out.println("�۰:"+
		Arrays.toString(composer).replaceAll("\\[","").replaceAll("\\]",""));
		System.out.println("�⵵:"+year);
	}
}
