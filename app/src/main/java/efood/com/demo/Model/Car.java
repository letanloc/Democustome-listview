package efood.com.demo.Model;

/**
 * Created by loc on 06/05/2016.
 */
public class Car {
    String name;
    String Age;
    // hamf dung

    public Car() {

    }

    public Car(String name, String age) {
        this.name = name;
        Age = age;
    }

    //
    public String getName() {
        return name;
    }
    // a =10 , b = 0 ;
//     b =a => b =10
    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}
