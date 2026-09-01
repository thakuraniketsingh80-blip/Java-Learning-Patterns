public class LeftHalfPyramid {
    public static void main(String[] args) {
        int num = 5;
        int star = 1;
        int space = num - 1;
        for(int i = 1; i<=num;i++){
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            space--;
            for(int k = 1;k<=star;k++){
                System.out.print("*");
            }
            star++;
            System.out.println();
        }

    }

}


