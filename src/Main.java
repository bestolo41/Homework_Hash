import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        ProductList productList = new ProductList("Список продуктов");  //создаем список
        productList.addFood("Кукуруза", 110, 1);
//        productList.addFood("Банан", 110);                          // добавляем продукт с незаполненной карточкой - выдаст ошибку
        productList.addFood("Крабовые палочки", 130, 1);
        productList.addFood("Яйцо", 10, 3);
        productList.addFood("Рис", 90, 1);
        productList.addFood("Майонез", 150, 1);
        Recipe krab = new Recipe("Салат Крабовый");
        krab.addProductList(productList);

        ProductList productList1 = new ProductList("Еще один список продуктов");
        productList1.addFood("Говяжий фарш", 210, 0.5);
        productList1.addFood("Приправа", 59, 1);
        productList1.addFood("Макароны", 95, 1);
        productList1.addFood("Лук", 20, 1);
        Recipe pasta = new Recipe("Макароны по-флотски");
        pasta.addProductList(productList1);

        RecipeBook recipeBook = new RecipeBook();
        recipeBook.addNewRecipe(krab);
        recipeBook.addNewRecipe(pasta);
//        System.out.println(recipeBook);

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Домашка про числа
        List<Integer> numbers = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }

//        System.out.println(numbers);
        List<Integer> deleted = new LinkedList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i)%2 == 0) deleted.add(numbers.get(i));
        }
        numbers.removeAll(deleted);
//        System.out.println(numbers);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //Домашка про таблицу умножения



        Set<Task> tasks = new HashSet<>();
        while (tasks.size() < 15) {
            tasks.add(new Task());
        }


        for (Task task : tasks) {
            System.out.println(task);
        }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        //Домашка про паспорт

        Map<String, Passport> map = new HashMap<>();
        Passport person1 = new Passport("9213 112244", "Иван", "Иванов", "Иванович");
        Passport person2 = new Passport("9145 251741", "Семен", "Семенов");
        Passport person3 = new Passport("8145 748451", "Дмитрий", "Дмитров", "Дмитриевич");
        Passport person4 = new Passport("9145 251741", "Сема", "Семенов", "Семеныч");
//        map.put(person1.getPassNum(), person1);
//        map.put(person2.getPassNum(), person2);
//        map.put(person3.getPassNum(), person3);

        person1.addTo(map);
        person2.addTo(map);
        person3.addTo(map);
        person4.addTo(map);

        for (Passport value : map.values()) {
            System.out.println(value);
        }
        System.out.println(map.get("9145 251741"));

//        person4.addTo(map);
//
//        for (Passport value : map.values()) {
//            System.out.println(value);
//        }


//        Task task2 = new Task();
//        task2.setNum1(3);
//        task2.setNum2(5);
//        Task task3 = new Task();
//        task3.setNum1(5);
//        task3.setNum2(3);
//
//        System.out.println(Objects.equals(task2,task3));
//        System.out.println(task1.getNum1());
//        System.out.println(task1.getNum2());


    }


}