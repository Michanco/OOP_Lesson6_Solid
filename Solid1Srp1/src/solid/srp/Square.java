package solid.srp;

public class Square {

    private int side;

    public Square(int side) {
        this.side = side;
    }
    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int getArea(){
        return this.side * this.side;
    }
}
