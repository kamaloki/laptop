import java.util.*;
import java.util.stream.Collectors;

public class shopLaptop {
    public static void main(String[] args) {
        Set<Laptops> laps = new HashSet<>();
        laps.add(new Laptops(1, "Macbook Air", 8, 24, "macOS", "black"));
        laps.add(new Laptops(2, "hp", 8, 36, "windows", "white"));
        laps.add(new Laptops(3, "asus", 8, 24, "macOS", "red"));
        laps.add(new Laptops(4, "Macbook Air", 8, 24, "macOS", "black"));
        laps.add(new Laptops(5, "Macbook pro", 8, 24, "macOS", "grey"));
        laps.add(new Laptops(6, "Lenovo", 8, 24, "windows", "black"));

//        for (Laptops lap : laps) {
//            System.out.println(lap);
//        }

        System.out.println("Выберите критерии для фильтрации:");
        System.out.println("1 - Оперативная память");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("0 - Завершить выбор");

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<>();

        while (true){
            int input = scanner.nextInt();
            if (input == 0){
                break;
            }
            else if (input == 1){
                System.out.println("Минимальный оперативная память");
                filters.put("operP", scanner.nextInt());
            }
            else if (input == 2){
                System.out.println("Минимальный объем ЖД");
                filters.put("hardDisk", scanner.nextInt());
            }
            else if (input == 3){
                System.out.println("Операционная система");
                filters.put("operSystem", scanner.next());
            }
            else if (input == 4){
                System.out.println("Цвет");
                filters.put("color", scanner.next());

            }
            else {
                System.out.println("Такой цифры нет!");
            }
        }

        Set<Laptops> filterLaptop = laps.stream()
                .filter(laptops -> filters.getOrDefault("operP", 0) instanceof Integer && laptops.getOperP() >= (int) filters.getOrDefault("operP", 0))
                .filter(laptops -> filters.getOrDefault("hardDisk", 0) instanceof Integer && laptops.getHardDisk() >= (int) filters.getOrDefault("hardDisk", 0))
                .filter(laptops -> filters.getOrDefault("operSystem", "").equals("") || laptops.getOperSysten().equalsIgnoreCase((String) filters.getOrDefault("operSystem", "")))
                .filter(laptops -> filters.getOrDefault("color", "").equals("") || laptops.getColor().equalsIgnoreCase((String) filters.getOrDefault("color", "")))
                .collect(Collectors.toSet());

        System.out.println("Ноутбуки по вашим критериям:");
        for (Laptops lap : filterLaptop) {
            System.out.println(lap);
        }

    }
}
