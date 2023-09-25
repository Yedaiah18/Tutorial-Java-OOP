package Services;

import Models.Girl;

import java.util.Scanner;
// Services Functional
public class GirlService {
    static Scanner scanner = new Scanner(System.in);
    private static Girl girl = new Girl();
    public static void service(String name,Integer age, String birthday, String crush){
        girl.setName(name);
        girl.setAge(age);
        girl.setBirthday(birthday);
        girl.setCrush(crush);
    }
    public static Girl getAttributes(){
        return girl;

    }
    public static void inputGroup(){
        System.out.print("Enter Name : ");
        String name = scanner.nextLine();
        System.out.print("Enter age : ");
        Integer age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Birthday : ");
        String birthday = scanner.nextLine();
        System.out.print("Enter Crush : ");
        String crush = scanner.nextLine();
        GirlService.service(name,age,birthday,crush);
    }
    public static void outputGroup(Girl girl){
        System.out.println("My name is " + girl.getName());
        System.out.println("I am " +girl.getAge() + " Years old");
        System.out.println("My Birthday is " + girl.getBirthday());
        System.out.println("lab ko si " + girl.getCrush());
    }
}
