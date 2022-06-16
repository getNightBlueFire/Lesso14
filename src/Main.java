import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        HashMap<User, Car> carHashMap = new HashMap<>();
        HashSet<Car> cars = new HashSet<>();

//        System.out.println(System.currentTimeMillis());
//        String s = "EEEE DD MMMM yyyy HH:mm";
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(s, new Locale("da"));
//        String format = simpleDateFormat.format(new Date());
//        System.out.println(format);
//        System.out.println(LocalDate.now());
//
//        LocalDate of = LocalDate.of(2020, 3, 21);
//        LocalDate to = LocalDate.of(2010, 4, 27);
//        DateTimeFormatter isoLocalDate = DateTimeFormatter.ISO_DATE;
//         parse = isoLocalDate.parse("2022-06-16");
//        System.out.println(parse);

//        Date date = new Date();
//        Date date1 = new Date(System.currentTimeMillis());
//
//        System.out.println(date);
//        System.out.println(date1);
//
//        int c= 0;
//        for (int i = 0; i < 1000000; i++) {
//            c++;
//            System.out.print(c);
//            System.out.print(c);
//        }
//        Date date2 = new Date();
//        System.out.println(date2);
//        while (true){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(new Date());
//        }


        User user0 = new User("Joe0",10);
        User user1 = new User("Joe1",132);
        User user2 = new User("Joe2",23);
        User user3 = new User("Joe3",234);
        User user4 = new User("Joe4",435);
        User user5 = new User("Joe4",34453);

//
        Car tesla_x1 = new Car("Tesla x1", true);
        Car tesla_x2 = new Car("Tesla x2", true);
        Car tesla_x3 = new Car("Tesla x3", true);
        Car tesla_x4 = new Car("Tesla x4", true);
        Car tesla_x5 = new Car("Tesla x6", true);
        Car tesla = new Car("Tesla SSSS", true);
//
//
//


        cars.add(tesla_x1);
        cars.add(tesla_x2);
        cars.add(tesla_x3);
        cars.add(tesla_x4);
        cars.add(tesla_x5);
        cars.add(tesla);

        Stream<Car> stream = cars.stream();
        stream.filter(getSsss()).filter(car -> car.getModel().contains("2")).forEach(System.out::println);
//        stream.forEachOrdered(getCarConsumer());
        Operation operation = a -> {
            System.out.println(a * a * a);
            return 0;
        };

        System.out.println(operation.test(10));

        operation = a -> a / a;

        System.out.println(operation.test(10));


        //cars.forEach(System.out::println);
//

//
//        System.out.println(cars.contains(new Car("Tesla x2", false)));
//


        carHashMap.put(user0, tesla_x1);
        carHashMap.put(user1, tesla_x2);
        carHashMap.put(user2, tesla_x3);
        carHashMap.put(user3, tesla_x4);
        carHashMap.put(user4, tesla_x5);
//
//
//        carHashMap.put(user5, tesla);
//
//        carHashMap.forEach((user, car) -> {
//            System.out.println(user + "  " + user.hashCode() +"    " + car);
//
//        });
//
//        System.out.println(user5.equals(user4));
        carHashMap.forEach((user, car) -> System.out.println(user+""+car));



    }

    private static Consumer<Car> getCarConsumer() {
        return car -> {
            car.setModel(car.getModel() + "1");
            System.out.println(car);
        };
    }

    private static Function<Integer, String> integerStringFunction(Integer i) {
        return integer -> integer.toString();
    }


    private static Predicate<Car> getSsss() {
        return car -> car.getModel().contains("x");
    }
}

interface Operation {
    int test(int a);
}