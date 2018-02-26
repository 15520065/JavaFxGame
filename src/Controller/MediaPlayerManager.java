package Controller;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * Created by phanh on 2/26/2018.
 */
public class MediaPlayerManager {
    private static MediaPlayerManager mediaPlayerManager;
    Media backgroundMusic;
    MediaPlayer backgroundMusicPlayer;

    final String SoundsPath = "res/sound/";

    public static MediaPlayerManager getInstance()
    {
        if(mediaPlayerManager == null)
        {
            mediaPlayerManager = new MediaPlayerManager();
        }
        return mediaPlayerManager;
    }

    public void playBackground()
    {
        backgroundMusic = new Media(getClass().getClassLoader().getResource(SoundsPath + "BadDay.mp3").toString());
        backgroundMusicPlayer = new MediaPlayer(backgroundMusic);
        backgroundMusicPlayer.play();
    }

    public void playSound(String name)
    {
        Media media = new Media(getClass().getClassLoader().getResource(SoundsPath + name).toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }

}
