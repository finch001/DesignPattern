package Struct;

import java.util.List;

/**
 * Created by finch on 2016/12/19.
 */
public class File extends Dir {
    public File(String fileName) {
        super(fileName);
    }

    @Override
    public List<Dir> getDirs() {
        throw new UnsupportedOperationException("not support");
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("not support");
    }

    @Override
    public void rmDir(Dir dir) {
        throw new UnsupportedOperationException("not support");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("not support");
    }

    @Override
    public void print() {
        System.out.print(getFileName());
    }
}
