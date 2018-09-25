import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Telephone {
    private Map<String, ArrayList> telbook = new HashMap<String, ArrayList>();

    //конструктор
    public  Telephone(){

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
    }

    //поиск по ФИО
    public ArrayList Search(String fio) {
        ArrayList result = new ArrayList();
        if (!this.telbook.containsKey(fio)) {
            result.add("Такого ФИО в базе нет");
            return result;
        }
        ArrayList tel = this.telbook.get(fio);
        for (int i = 0; i < tel.size(); i++) {
            result.add(Integer.toString(i + 1) + ". " + tel.get(i));
        };
        if (tel.size() == 0) {
            result.add("Телефон отсутсвует");
            return result;
        }
        return result;
    }

}
