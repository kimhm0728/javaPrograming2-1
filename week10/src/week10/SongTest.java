package week10;

public class SongTest {
	public static void main(String[] args) {
		Song s1=new Song("Bohemian Rhapsody","Queen","A Night at the Opera",
				new String[]{"Freddile Mercury"},1975);
		Song s2=new Song("Persona","BTS","Man of the soul",
				new String[]{"Hiss Noise","ÇÇµ¶"},2019);
		
		s1.show();
		System.out.println();
		s2.show();
	}
}
