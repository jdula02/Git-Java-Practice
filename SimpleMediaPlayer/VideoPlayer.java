package SimpleMediaPlayer;

public class VideoPlayer implements MediaPlayer {
    //play method for VideoPlayer that grabs method from interface
    public void play() {
        System.out.println("Now Playing the selected video file..."); //polymorphism of interface method
    }
}
