public class main {
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        public static void main(String[] args) {
            // Press Alt+Entrée with your caret at the highlighted text to see how
            // IntelliJ IDEA suggests fixing it.
            System.out.printf("Hello and welcome!");

            // Press Maj+F10 or click the green arrow button in the gutter to run the code.
            for (int i = 1; i <= 5; i++) {

                // Press Maj+F9 to start debugging your code. We have set one breakpoint
                // for you, but you can always add more by pressing Ctrl+F8.
                System.out.println("i = " + i);
            }

            int local1 = 34;
            int truckCapacity = 9;
            int local2 = 0;


            while (local2 < 34) {
                local1 = local1 - truckCapacity;
                local2 = local2 + truckCapacity;
                if (local2 <= 34) {
                    System.out.println("Un voyage de " + local2);
                } else {
                    local2 = 34;
                    System.out.println("Un voyage de " + local2);
                }


            }

        }
    }

