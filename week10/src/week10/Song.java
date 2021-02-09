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
		System.out.println("노래 제목:"+title);
		System.out.println("가수:"+artist);
		System.out.println("앨범:"+album);
		System.out.println("작곡가:"+
		Arrays.toString(composer).replaceAll("\\[","").replaceAll("\\]",""));
		System.out.println("년도:"+year);
	}
}
