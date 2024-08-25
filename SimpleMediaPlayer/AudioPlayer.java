package SimpleMediaPlayer;

public class AudioPlayer implements MediaPlayer
{
    //Play method that overrides interface play method with its own output.
    //This Method will print a statement that an audio file was selected.
    @Override
    public void play()
    {
        System.out.println("Now playing your selected audio file"); //polymorphism of interface method
    }    
}

