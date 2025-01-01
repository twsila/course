class Human1
{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAgeWithObject(int age,Human1 obj) {
        this.age = age;
    }

    public void setAgeWithThisKeyWord(int age,Human1 obj) {
        Human1 obj1 = obj;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setNameWithObject(String name,Human1 obj) {
        Human1 obj1 = obj;
        obj1.name = name;
    }

    public void setNameWithThisKeyWord(String name,Human1 obj) {
        this.name = name;
    }

}
public class DemoThisKeyWord {
    public static void main(String[] args) {
        System.out.println(" ----------- Separator Line -----------");
            Human1 obj1 = new Human1();
            obj1.setAgeWithObject(53,obj1);
            obj1.setNameWithObject("Set with Object ---> Abdulrahman Nasser Abdullah Fuhaied Al-Shagawi",obj1);
        System.out.println(obj1.getAge()+"\n"+obj1.getName());
        System.out.println(" ----------- Separator Line -----------");
            obj1.setAgeWithThisKeyWord(53,obj1);
            obj1.setNameWithThisKeyWord("Set with this keyword ---> Abdulrahman Nasser Abdullah Fuhaied Al-Shagawi",obj1);


        System.out.println(obj1.getAge()+"\n"+obj1.getName());
    }
}
