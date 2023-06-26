package solid;

import solid.srp.Square;
import solid.srp.SquareDraw;
import solid.srp.SquareMath;

public class Main {
    public static void main(String[] args) {
        int side = 5;
        Square square = new Square(side);
        SquareDraw squareDraw =new SquareDraw(square.getSide());
        System.out.printf("Площадь фигуры: %d \n", square.getArea());
        squareDraw.draw();
        SquareMath squareMath = new SquareMath(square.getSide());
        squareDraw.setSide(squareMath.zoom(2));
        System.out.printf("\nПлощадь фигуры: %d \n", square.getArea());
        squareDraw.draw();
    }
}
