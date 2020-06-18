package abstractLecture;

public class WashingMachine extends Appliance{


        @Override
        public void makeSound() {
            System.out.println("swish, swish, beep ");
        }

        @Override
        public void doWork() {
            System.out.println("Washing the clothes... ");
        }
    }

