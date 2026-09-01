public class InvertedLeftHalfPyramid {
    public static void main(String[] args) {
        int num = 5;
        int star = num;
        int space = 1;
        for(int i = 1; i<=num; i++){
            for (int j = 1; j<space; j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=star;k++){
                System.out.print("*");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
