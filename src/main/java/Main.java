public class Main {
    public static void main(String[] args) {

        // позовём котов есть
        Cat[] cats = getCats();

        // кормёжка котов
        Plate plate = feedingCats(cats);

        // повторная кормёжка котов оставшихся голодными котов
        repeatedFeedingCats(cats, plate);
    }

    private static Plate feedingCats(Cat[] cats) {
        Plate plate = new Plate(50);
        System.out.println(plate);
        for (Cat kitten : cats) {
            kitten.eat(plate);
            System.out.println(kitten);
        }
        System.out.println(plate);
        return plate;
    }

    private static void repeatedFeedingCats(Cat[] cats, Plate plate) {
        plate.increaseFood(30);
        for (Cat kitten : cats) {
            if (!kitten.isSatiety()) {
                kitten.eat(plate);
                System.out.println(kitten);
            }
        }
        System.out.println(plate);
    }

    private static Cat[] getCats() {
        String[] nickNames = new String[]{"Барсик", "Васька", "Мурзик", "Мусик", "Плюша", "Мурка"};
        Cat[] cats = new Cat[nickNames.length];
        for (int i = 0; i < nickNames.length; i++) {
            cats[i] = Cat.builder()
                    .name(nickNames[i])
                    .appetite((int) (Math.random() * 20))
                    .build();
        }
        return cats;
    }
}
