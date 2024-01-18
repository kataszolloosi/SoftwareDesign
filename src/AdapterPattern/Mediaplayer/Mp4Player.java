package AdapterPattern.Mediaplayer;

public class Mp4Player implements IPlayer {

    @Override
    public void play(String file) {

        System.out.println("Playing Mp4: " + file);
    }

}