public class Flows {

    public void methodA(String input) {
        System.out.print("J");
        if (!input.equals("start")) {
            System.out.print("O");
            methodB("start");
        } else {
            System.out.print("A");
            methodC(input);

        }

        if (input.equals("start")) {
            System.out.print("S");
            methodA("hej");
        }

    }
    public void methodB(String start) {
        System.out.print("V");
        System.out.print("T\n");

    }
    public int methodC(String input) {
        System.out.print("V");
        methodD(input.length());
        return input.length() * 2;
    }

    public void methodD(int number) {
        System.out.print("A ");
        if (number >= 5) {
            System.out.print("E");
        }
        System.out.print("R ");

    }

}
