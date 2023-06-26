package solid.srp;

public class SquareMath extends Square{
    public SquareMath(int side) {
        super(side);
    }
    public int getZoomArea() {
        return super.getSide() * super.getSide();
    }

    public int zoom(float zoom) {
        int zoomSide = super.getSide();
        zoomSide = (int) (super.getSide() * zoom);
        return zoomSide;
    }
}
