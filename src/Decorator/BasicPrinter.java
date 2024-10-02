package Decorator;

public class BasicPrinter implements Printer {
    /*
        private final Printer printer;


        public BasicPrinter(Printer printer) {
            this.printer = printer;
        }
         */

    @Override
    public void print(String str) {
        System.out.println(str);
        /*
        if (printer != null) {
            printer.print(str);
        }
         */
    }
}
