//Створіть проект з класом Main.java.
//
//        Потрібно: Створити клас  Address. У тілі класу потрібно створити поля:
//        index, country, city, street, house, apartment.
//        Для кожного поля створити метод з двома методами доступу (get, set)
//        Створити екземпляр класу Address.
//        У поля экземпляра записати інформацію. Виведіть на екран значення полів, що описують адресу.

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(1);
        address.setCountry("Україна");
        address.setCity("Київ");
        address.setStreet("Хрещатик");
        address.setHouse(1);
        address.setApartment(26);

        System.out.println("Індекс: " + address.getIndex());
        System.out.println("Країна: " + address.getCountry());
        System.out.println("Місто: " + address.getCity());
        System.out.println("Вулиця: " + address.getStreet());
        System.out.println("Будинок: " + address.getHouse());
        System.out.println("Квартира: " + address.getApartment());
    }
}