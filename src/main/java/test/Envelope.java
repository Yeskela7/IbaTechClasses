package test;

public class Envelope {
    public static void main(String[] args) {
        int width = 20;
        int height = 18;
        double tan = ((double)width) / height;

        // vertical loop
        for (int i = 0; i < height/2; i++) {
            // horizontal loop
            for (int j = 0; j < width; j++) {
                if (
                        i == 0             // first horizontal line
                        || i == height/2-1 // last horizontal line
                        || j == 0          // left vertical line
                        || j == width - 1  // right vertical line
                        || j == (int)(i * tan)
                        || (width-j-1)==(int)(i*tan)
                ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
