public class BlockScopeDemo {

        public static void main(String[] args) {
            int outerX = 5;

            if (true) {
                int innerY = 15;
                System.out.println("Inside if block:");
                System.out.println("outerX = " + outerX);
                System.out.println("innerY = " + innerY);
            }

            System.out.println("Outside if block:");
            System.out.println("outerX = " + outerX);


        }
    }
