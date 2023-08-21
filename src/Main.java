public class Main {
    public static void main(String[] args) {

        //Количество кофейных зёрен в граммах
        int coffeeAmount = 1123;

        //Количество молока в граммах
        int milkAmount = 2122;

        //Количество обезжиренного молока в граммах
        int skimmedMilkAmount = 1152;

        //Количество безлактозного молока в граммах
        int lowLactoseMilkAmount = 1462;

        // Атрибут блокировки кофе-машины
        boolean isBlocked = false;

        // Капучино - необходимо молока в граммах
        int cappuchinoMilkRequired = 60;

        // Капучино - необходимо кофе в граммах
        int cappuchinoCoffeeRequired = 15;

        // Проверка достаточности молока в кофе-машине
        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowLactoseMilkAmount >= cappuchinoMilkRequired;
        // Проверка достаточности кофейных зёрен в кофе-машине
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        boolean hasErrors = false;
        // Проверка блокировки кофе-машины
        if (isBlocked) {
            System.out.println("Кофе-машина заблокирована");
            hasErrors = true;
        }
        // Ошибка недостатка кофе
        if (!coffeeIsEnough) {
            System.out.println("Недостаточно кофейных зёрен");
            hasErrors = true;
        }
        // Ошибка недостатка молока
        if (!milkIsEnough) {
            System.out.println("Недостаточно молока");
            hasErrors = true;
        }
        // Проверка ошибок
        if (!hasErrors){
            System.out.println("Готовим кофе");
        }
    }
}
