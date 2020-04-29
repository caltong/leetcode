package utils;

public class MountainArrayImpl implements MountainArray {
    private final int[] val;

    public MountainArrayImpl(int[] val) {
        this.val = val;
    }

    @Override
    public int get(int index) {
        return val[index];
    }

    @Override
    public int length() {
        return val.length;
    }
}
