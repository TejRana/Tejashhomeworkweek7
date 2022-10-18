package javahomeworkweek7;

public class Person {

    int age;
    String firstName,lastName;

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // firstname
        person.setLastName(""); // lastname
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setFirstName("John"); // first name set as John
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setLastName("Smith"); // last name set as Smith
        System.out.println("fullName = " + person.getFullName());

    }
    public String getFirstName()
    { return firstName;}
    public String getLastName()
    { return lastName;}
    public int getAge()
    { return age;}
    public void setFirstName( String firstName)
    {this.firstName=firstName;}
    public void setLastName (String lastName)
    {this.lastName =lastName;}

    public void setAge(int age){
    if (age > 0 && age <=100){
        this.age = age;
    }else{
        this.age = 0;
    }
    }
    public boolean isTeen(){
        if (age>12 && age <20){
            return true;
        }
        return false;
    }
    public String getFullName(){
        if (firstName.isEmpty()){
            return lastName;
        }else if (lastName.isEmpty()){
            return firstName;
        }else if (firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }else {
            return firstName + " " + lastName;
        }
    }
}
