import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the number: ");
        int size =scanner.nextInt();

        NumberRepo numberRepo = new NumberRepo(size);
        numberRepo.displayAll();
        numberRepo.generateValues();
        double min = numberRepo.findMin();
        System.out.println("Min value: " + min);
        double max = numberRepo.findMax();
        System.out.println("Max value: " + max);

        double[] logNumbers = numberRepo.logNumbers();
        System.out.println("Log numbers: ");
        for(double log : logNumbers){
            System.out.println(log);
        }

    }
}
