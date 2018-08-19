
public class IPodRunner
{
    public static void main (String[] args)
    {
        System.out.print("\f");
        
        IPod ipods = new IPod();// create an iPod object

        ipods.addSong("You Should Be Dancing.mp3");
        ipods.addSong("Anthem.mp3");

        ipods.playSong(1);      

    }
}