package Day1017;

public class RightTriangle {
    public static void main(String[] args) {
        int n=10;
        for(int i =1; i<=n; i++){
            for (int j=0; j<i; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
