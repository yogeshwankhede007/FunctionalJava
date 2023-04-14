package co.functiona_interfaces;

public class SquareC {
    int sideLength;

    public SquareC(int sideLength)
    {
        this.sideLength = sideLength;
    }

    public int calculateArea(){
        return sideLength*sideLength;
    }
}
