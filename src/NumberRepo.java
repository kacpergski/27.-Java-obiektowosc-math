public class NumberRepo {
    double [] numbers;

     NumberRepo(int size) {
         numbers = new double[size];
    }

    void displayAll() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
        void generateValues(){
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = Math.random();
            System.out.println(numbers[i]);
            }
        }
    double findMin() {
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }
        return min;
        }
    double findMax() {
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            max = Math.max(max, numbers[i]);
        }
        return max;
    }
    double [] logNumbers(){
    double [] temp = new double[numbers.length];
        for (int i = 0; i < numbers.length ; i++) {
            temp[i] = Math.log(numbers[i]);
        }
     return temp;
    }

    void minMaxAB(double numberA, double numberB){
         double randomA = Math.random() * (numberA - numberB +1) + numberB;
         double randomB = Math.random() * (numberA - numberB +1) + numberB;

         double logAB = Math.log(randomA)*randomB;
         double cosA = Math.cos(randomA);
         double tgB = Math.tan(randomB);

        System.out.println(logAB);
        System.out.println(cosA);
        System.out.println(tgB);
    }
}

