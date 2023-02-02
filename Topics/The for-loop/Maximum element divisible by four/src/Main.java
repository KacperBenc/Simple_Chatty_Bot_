import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int max = 0;
        for(int i = 0; i < n; i++){
            int l = scanner.nextInt();
            if (l>max && l%4==0){
                max = l;
            }
        }
        System.out.println(max);
    }
}