public class    SolidRhombus {
    public static void main(String[] args) {
        int num = 5;
        int spaces = 5;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= spaces ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= num; k++) {
                System.out.print("* ");
            }
            spaces--;
            System.out.println();
        }
    }
}
