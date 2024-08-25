package SimpleMediaPlayer;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.println("Enter 'A' to play an audio file or 'V' to play a video file:");
        String input = scanner.nextLine().trim().toLowerCase(); // puts user input to lower case

        // Validate input and assign a polymorphic variable
        MediaPlayer player;
        if (input.equals("a")) {
            player = new AudioPlayer();  // Polymorphic assignment
        } else if (input.equals("v")) {
            player = new VideoPlayer();  // Polymorphic assignment
        } else {
            System.out.println("Invalid choice."); // Output for invalid input
            scanner.close();
            return;
        }

        // Call the method on the polymorphic variable
        player.play();  // This will output differently based on the choice

        scanner.close();
    }
}
