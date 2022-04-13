public class EX06_14 {
    public static void main(String[] args) {
        int i,k;

        for(i=2;i<=9;i++){
            for(k=1;k<10;k++){
                System.out.printf("%d X %d = %d\n", i,k,i*k);
            }
            System.out.println();
        }
    }
}
