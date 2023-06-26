package solid.srp;

public class SquareDraw extends Square {
    public SquareDraw(int side) {
        super(side);
    }

    public void draw() {
        for (int i = 0; i < super.getSide(); i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int i = 0; i < super.getSide()-2; i++) {
            System.out.print("* ");
            for (int j = 1; j < super.getSide() - 1; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < super.getSide(); i++) {
            System.out.print("* ");
        }
    }
}
