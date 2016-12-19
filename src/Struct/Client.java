package Struct;

import java.util.List;

/**
 * Created by finch on 2016/12/19.
 */
public class Client {
    public static void main(String[] args) {
        Dir diskc = new Folder("C");

        diskc.addDir(new File("Window.log"));

        Dir dirWin = new Folder("Window");
        dirWin.addDir(new File("explorer.exe"));
        diskc.addDir(dirWin);

        Dir dirMovie = new Folder("Movie");
        dirMovie.addDir(new File("movie1"));
        diskc.addDir(dirMovie);

        Dir dirMusic = new Folder("music");
        dirMusic.addDir(new File("music"));
        diskc.addDir(dirMusic);

        diskc.print();
    }

}
