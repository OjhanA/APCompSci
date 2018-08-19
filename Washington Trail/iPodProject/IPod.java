
import java.util.Scanner;
import java.util.ArrayList;

public class IPod
{
	private String name;
	private double capacityGB;
	private int maxNumSongs = 3;
	private int numSongs=0;
  // create an ArrayList named "songs" of Song objects

	public IPod ( String n, double c)
	{
		name = n;
		capacityGB = c;
	}

	public void addSong (String t, String a, String f, double s)
	{
   //create a Song object and add to the ArrayList

   //increment the number of songs on the iPod

	}


	public void playSong()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println ("\n\nEnter song number to play or -1 to quit");
		int play = scan.nextInt();
		if (play != -1)
		{
			String filename = songs.get(play-1).getFilename();
			MP3 mp3 = new MP3(filename);
        	mp3.play();
 		}
	}
	public String toString()
	{
		String songList = name + "'s iPod.  Total capacity: " + capacityGB + "GB\n\n";
		double currentUsed = 0;

    // loop through the songs array adding each Song object to the string songList

		songList += "\n\nUsed Space: " + (currentUsed/1024)  + "GB";
		songList += "\nSpace Available: " + (capacityGB - currentUsed/1024) + "GB";
		return songList;

	}
}