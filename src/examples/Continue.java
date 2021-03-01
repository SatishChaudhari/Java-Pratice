package examples;

/*
Programme will print number from 1 to 50, but it will not
print between 30 to 40.
 */
public class Continue {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            if (i > 30 && i <= 40)
                continue;
            System.out.print(i + " ");
        }

    }
}
