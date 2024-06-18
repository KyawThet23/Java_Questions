public class AnonymousClass {

    public static void main(String[] args) {

        Animal monkey = new Animal();
        monkey.makeNoise();

        Animal tiger = new Animal(){
            @Override
            public void makeNoise() {
                System.out.println("Wong!!!!!");
            }
        };

        tiger.makeNoise();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I'm a anonymous");
            }
        };

        runnable.run();

    }

}
