import ru.netology.javaqa.javaqamvn.services.VacationCalc;

public class Main {
    public static void main(String[] args) {
        VacationCalc service = new VacationCalc();
        service.calculate(10_000, 3000, 20_000);


    }

}