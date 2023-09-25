import Models.Girl;
import Services.*;

public class Main {
    public static void main(String[] args) {
        GirlService.inputGroup();
        Girl girl = GirlService.getAttributes();
        GirlService.outputGroup(girl);
    }
}
//Don't
//Repeat
//Yourself