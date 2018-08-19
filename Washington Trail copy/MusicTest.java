import java.util.Scanner;
public class MusicTest {
    public static void main (String[] args) {
        IPod music = new IPod();
        music.addSong ("Anthem.mp3");
        music.addSong ("Jumper.mp3");
        music.addSong ("Headphones.mp3");
        Scanner scan = new Scanner (System.in);

        music.playSong(0);
        music.playSong(2);

        for (int i = 0; i < 10; i++) {
            System.out.println ("\nType some numbers: ");
            music.stopSong(0);

            int t = scan.nextInt();
            if (t == 9) {
                music.stopSong(2);
            }
        }
    }
}