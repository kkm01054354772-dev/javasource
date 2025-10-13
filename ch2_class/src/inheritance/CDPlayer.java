package inheritance;

public class CDPlayer extends Player {

    int currentTrack;

    @Override
    void play(int pos) {
        System.out.println("CD Play");

    }

    @Override
    void stop() {
        System.out.println("CD Stop");

    }

    void nextTrack() {
        currentTrack++;
    }

    void prevTrack() {
        if (currentTrack > 1) {
            currentTrack--;
        }
    }
}
