package core.basesyntax;

public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength, String color) {
        super(color);
        this.sideLength = sideLength;
    }

    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: square, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("side: ").append(sideLength).append(" units, ")
                .append("color: ").append(getColor().toLowerCase());
        System.out.println(stringBuilder);
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
