public class Main {
    public static void main(String[] args) {
        StreamApp streamApp=new StreamApp();
        System.out.println("Изначальный список:");
        streamApp.printList();
        System.out.println("Сортировка:");
        streamApp.sortBySecondSymbol();
        System.out.println("Фильтрация:");
        streamApp.filterByWeight();
        System.out.println("Сортировка2:");
        streamApp.sortByWeightXAge();
        System.out.println("Произведение весов:");
        streamApp.MultiplyWeight();
    }
}
