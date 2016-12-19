package Struct;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by finch on 2016/12/19.
 */
public abstract class Dir {
    protected List<Dir> dirs = new ArrayList<Dir>();

    private String fileName;

    public Dir(String fileName) {
        this.fileName = fileName;
    }

    public abstract List<Dir> getDirs();

    public String getFileName(){
        return fileName;
    }

    public abstract void addDir(Dir dir);

    public abstract void rmDir(Dir dir);

    public abstract void clear();

    public abstract void print();



}
