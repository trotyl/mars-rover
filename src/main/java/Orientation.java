public enum Orientation {
    N(0, 1), E(1, 0), S(0, -1), W(-1, 0);

    private final Vector vector;

    Orientation(int x, int y) {
        this.vector = new Vector(x, y);
    }

    public Orientation left() {
        return values()[(ordinal() + 3) % 4];
    }

    public Orientation right() {
        return values()[(ordinal() + 1) % 4];
    }

    public Vector vector() {
        return vector;
    }
}
