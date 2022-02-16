import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApp {
    List <Human> list = new ArrayList();

    public StreamApp() {
        LocalDate date = LocalDate.now();
        list = Stream.of(new Human(16, "Sasha", "Blouse", date, 60),
                new Human(70, "Ded", "Stariy", date, 80),
                new Human(22, "Alex", "Lev", date, 75),
                new Human(19, "Nick", "Glushko", date, 90)).collect(Collectors.toList());
    }
    public void printList()
    {
        list.stream().forEach(System.out::println);
    }

    public void sortBySecondSymbol()
    {
        list.stream().sorted(Comparator.comparing(Human::getSecondChar)).forEach(System.out::println);
    }

    public void filterByWeight()
    {
        list.stream().filter(x->x.getWeight()%10==0).forEach(System.out::println);
    }

    public void sortByWeightXAge()
    {
        list.stream().sorted(Comparator.comparing(x->(x.getAge()*x.getWeight()))).forEach(System.out::println);
    }
    public void MultiplyWeight()
    {
        System.out.println(list.stream().mapToInt(Human::getWeight).reduce(1,(x,y)->x*y));

    }
}
