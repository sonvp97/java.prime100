public class Main {
    public static void main(String[] args) {
        System.out.println("primes less than 100 are: ");
        for (int i = 2;i <= 100;i++){
            boolean flag = true;
            for(int j = 2;j < i;j++){
                if (i%j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(i);
            }
        }
    }
}