public class InvertedRightHalfPyramid {
    public static void main(String[] args) {
        int num = 5;
        int star = num;
        for(int i = 1 ; i<=num ; i++){
            for(int j = 1 ; j<=star ; j++){
                System.out.print("*");
            }
            star--;
            System.out.println("");
        }
    }
}
