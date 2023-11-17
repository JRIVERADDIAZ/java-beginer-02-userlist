import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonsList {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        List<Person> persons = new ArrayList<>();

        var salir = false;

        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, persons);
            } catch (Exception e) {
                System.out.println("Error!: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        //mostrar opciones

        System.out.print("""
                **** Listado personas ****
                1. agregar persona
                2. mostrar personas
                3. eliminar persona       
                """);

        System.out.println("proporcionar opcion?: ");
    }

    private static boolean ejecutarOperacion(Scanner consola, List<Person> persons) {
        var option = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (option) {
            case 1 -> {

                System.out.println("type the name: ");
                var name = consola.nextLine();

                System.out.println("type the phone: ");
                var phone = consola.nextLine();

                System.out.println("type the email: ");
                var email = consola.nextLine();
                // create the person object person
                var person = new Person(name, phone, email);
                // add the person to the list'array'
                persons.add(person);
                //check list size
                System.out.println("the list has " + persons.size() + " persons");
            } //case 1  ends here

            case 2 -> {
                System.out.println("the list has " + persons.size() + " persons");
                persons.forEach(System.out::println);
            } //case 2 ends here

            case 3 -> {
                System.out.println("good bye ");
                salir = true;
            } //case 3 ends here
            default -> System.out.println("option not valid" + option);
        }
        return salir;
    }
}