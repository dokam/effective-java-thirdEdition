public class Main {
    public enum Apple {FUJI, PIPPIN, GRANNY_SMITH}

    public static void main(String args[]){

        Operation op = Operation.PLUS;
        System.out.println("value of 3+5 is " + op.apply(3.0,5.0));
    }
}
