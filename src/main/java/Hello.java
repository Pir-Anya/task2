import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hello {


    public static void main(String[] args){

        Telephone tel = new Telephone();

        System.out.println("Введите ФИО:");
        Scanner input = new Scanner(System.in);
        String fio = input.nextLine();

        ArrayList result = tel.Search(fio);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        };


    }

}
