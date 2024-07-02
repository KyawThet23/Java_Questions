public class PassByValueExample {

    public static void main(String[] args) {
        Cheese cheese1 = new Cheese();
        cheese1.setLevelOfStinky(10);

        increase(cheese1);

        System.out.println(cheese1.getLevelOfStinky());
    }

    private static void increase (Cheese cheese){
        cheese.setLevelOfStinky(cheese.getLevelOfStinky() + 1);
    }
}
