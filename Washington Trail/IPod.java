
import java.util.Scanner;
import java.util.ArrayList;

public class IPod
{
    private String name;
    ArrayList<MP3> songs = new ArrayList<MP3>();

    public void addSong (String f)
    {
        MP3 newSong = new MP3(f);

        songs.add(newSong);
    }

    public void playSong(int i)  {   
        /*Scanner scan = new Scanner(System.in); 
        System.out.println ("Press enter to play"); 
        scan.nextLine();*/
        songs.get(i).play();
    }
    
    public void stopSong (int i) {
        songs.get(i).close();
    }
    
    public int getLength () {
        return songs.size();
    }
}