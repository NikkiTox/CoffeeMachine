public class Main {
    public static void main(String[] args) {

        //���������� �������� ���� � �������
        int coffeeAmount = 1123;

        //���������� ������ � �������
        int milkAmount = 2122;

        //���������� ������������� ������ � �������
        int skimmedMilkAmount = 1152;

        //���������� ������������� ������ � �������
        int lowLactoseMilkAmount = 1462;

        // ������� ���������� ����-������
        boolean isBlocked = false;

        // �������� - ���������� ������ � �������
        int cappuchinoMilkRequired = 60;

        // �������� - ���������� ���� � �������
        int cappuchinoCoffeeRequired = 15;

        // �������� ������������� ������ � ����-������
        boolean milkIsEnough = skimmedMilkAmount >= cappuchinoMilkRequired ||
                milkAmount >= cappuchinoMilkRequired ||
                lowLactoseMilkAmount >= cappuchinoMilkRequired;
        // �������� ������������� �������� ���� � ����-������
        boolean coffeeIsEnough = coffeeAmount >= cappuchinoCoffeeRequired;

        boolean hasErrors = false;
        // �������� ���������� ����-������
        if (isBlocked) {
            System.out.println("����-������ �������������");
            hasErrors = true;
        }
        // ������ ���������� ����
        if (!coffeeIsEnough) {
            System.out.println("������������ �������� ����");
            hasErrors = true;
        }
        // ������ ���������� ������
        if (!milkIsEnough) {
            System.out.println("������������ ������");
            hasErrors = true;
        }
        // ������� ������
        if (!hasErrors){
            System.out.println("������� ����");
        }
    }
}
