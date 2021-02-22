public enum Operation {
    PLUS, MINUS, TIMES, DIVIDE;

    public double apply(double x, double y){
        switch (this){
            case PLUS -> {
                return x+y;
            }
            case MINUS -> {
                return x -y;
            }
            case TIMES -> {
                return x * y;
            }
            case DIVIDE -> {
                return x / y;
            }

            default -> throw new IllegalStateException("Unexpected value: " + this);
        }
    }

}
