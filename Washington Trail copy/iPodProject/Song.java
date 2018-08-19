public class Song
{
	private String title, artist;
	private String filename;
	private double sizeMB;
	
	/**
	 * Constructs a new song.
	 * @param t title of song
	 * @param a artist of song
	 * @param f filename
	 * @param s size in MB
	 */
	 public Song(String t, String a, String f, double s)
	 {
	 	title = t;
	 	artist = a;
	 	filename = f;
	 	sizeMB = s;
	 }
	 
	 public String getTitle()
	 {
	 	return title;
	 }
	 
	 public String getArtist()
	 {
	 	return artist;
	 }


	 public String getFilename()
	 {
	 	return filename;
	 }
	 
	 public double getSize()
	 {
	 	return sizeMB;
	 }
	 
	 public String toString()
	 {
	 	return title + "\n" + artist + "\n" + filename + "\nSize: " + sizeMB + "MB\n\n";
	 }


}