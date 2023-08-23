public class Main {
    public static void main(String[] args) {

        int coffeeAmount = 1123;// in grams
        int milkAmount = 2122; // in grams
        int skimmedMilkAmount = 1152; // in grams
        int lowLactoseMilkAmount = 1462; // in grams
        int cappuchinoMilkRequired = 60; // in grams
        int cappuchinoCoffeeRequired = 15; // in grams
        boolean isBlocked = true;
        // Проверка достаточности молока в кофе-машине
        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowLactoseMilkAmount >= cappuchinoMilkRequired;
        // Проверка достаточности кофейных зёрен в кофе-машине
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;
        boolean hasErrors = false;

        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;
        }
        if (!coffeeIsEnough) {
            System.out.println("Недостаточно кофейных зёрен");
            hasErrors = true;
        }
        if (!milkIsEnough) {
            System.out.println("Недостаточно молока");
            hasErrors = true;
        }
        if (!hasErrors) {
            System.out.println("Готовим кофе");
        }
    }
}
