public class Person {
    private int id;
    private String name;
    private String phone;
    private String email;
    private static int personsNumber = 0;

    // Construtor empty;

    public Person(){
        this.id = ++Person.personsNumber;
    }

    public Person(String name, String phone, String email){
        this();
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person("juan perez", "00000000", "juan@mail.com");
        System.out.println(person1);
    }

}
