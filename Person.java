
public abstract class Person{
    protected int id;
    protected String firstName;
    protected String lastName;
    protected int age;
    protected char sex;
    protected char gender;
    public Person(int id, String firstName, String lastName, int age, char sex, char gender){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.gender = gender;
    }
    
    public int getId(){
        return id;
    }
    
    public String getName(){
        return firstName + " " + lastName;
    }
    
    public int getAge(){
        return age;
    }
    
}
