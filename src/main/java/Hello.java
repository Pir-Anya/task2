import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hello {


    public static void main(String[] args){
        Map<String, ArrayList> telbook = new HashMap<String, ArrayList>();

        ArrayList telList = new ArrayList();

        telList.add("+8 800 2000 500");
        telList.add("+8 800 200 600");
        telbook.put("Иванов И.И.", telList);

        telList = new ArrayList();
        telList.add("+8 800 2000 700");
        telbook.put("Петров П.П.", telList);

        telList = new ArrayList();
        telList.add("+8 800 2000 800");
        telList.add("+8 800 2000 900");
        telList.add("+8 800 2000 000");
        telbook.put("Сидоров С.С.", telList);

        telList = new ArrayList();
        telbook.put("Васильев В.В.", telList);

        System.out.println("Введите ФИО:");
        Scanner input = new Scanner(System.in);
        String fio = input.nextLine();

        if (!telbook.containsKey(fio)) {
            System.out.println("Такого ФИО в базе нет");
            return;
        }
        ArrayList tel = telbook.get(fio);
        for(int i = 0; i < tel.size(); i++){
            System.out.println(Integer.toString(i+1) + ". " + tel.get(i));
        }
        if (tel.size() ==0) System.out.println("Телефон отсутсвует");

    }

}
