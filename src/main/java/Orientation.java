public enum Orientation {
    N, E, S, W;

    public Orientation left() {
        return values()[(ordinal() + 3) % 4];
    }
}
