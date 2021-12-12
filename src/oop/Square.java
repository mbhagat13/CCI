package oop;

public class Square extends Rectangle {

    @Override
    public void seth(int h) {
        super.seth(h);
        super.setw(h);
    }

    @Override
    public void setw(int w) {
        super.seth(w);
        super.setw(w);
    }
}
