package java03;

/**
 * <h2>4{type_name}Class</h2>
 * <p>
 * Process for Displayingsample
 * </p>
 *
 * @author ASUS
 *
 */
public class sample {

    /**
     * <h2>main</h2>
     * <p>
     *
     * </p>
     * 
     * @param args
     * @return void
     */
    public static void main(String args[]) {
        int j = 9;
        int p = 0;
        // Looping & Conditional Statement
        do {
            for (int i = 5; i <= j; i++) {
                if (i == 6) {
                    System.out.println("3 left");

                } else if (i == 9) {
                    System.out.println("End");

                } else {
                    System.out.println(i);

                }

            }
            break;
        } while (p == 0);

    }
}
