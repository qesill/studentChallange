public class Main {
    public static void main(String[] args) {
    /*
    Stwórz klasę Student opisującą ucznia z następującymi zmiennymi:
    imię, nazwisko, miasto, wiek
    Dodaj do klasy dwa konstruktory:
    - pusty podstawiający domyślne wartości jak np Jan Kowalski
    - przyjmujący wszystkie powyższe dane
    Stwórz w klasie Student metodę printBasicData() pokazującą powyższe dane
    w konsoli.
    Na koniec utwórz dwuch studentów, jeden z użyciem pustego konstruktora,
    drugi z użyciem konstruktora z przekazaniem danych studenta.
     */
     Student student1 = new Student();
         student1.name = "Jan";
         student1.surname = "Kowalski";
         student1.city = "Warszawa";
         student1.age = 18;

        student1.printBasicData();


     Student student2 = new Student("Wiktoria", "Igorowska", "Warka", 27);
     student2.printBasicData();


    }
}
class Student {
    String name;
    String surname;
    String city;
    int age;

    public Student(){
        this.name = "Jan";
        this.surname = "Kowalski";
        this.city = "Warszawa";
        this.age = 18;
    }
    public Student(String name, String surname, String city, int age){
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.age = age;
    }
    public void printBasicData() {
        System.out.println("Imię: " + this.name + ", Nazwisko: " + this.surname + ", Miasto: " + this.city + ", Wiek: " + this.age);
    }
}

