import java.util.ArrayList;

import static org.junit.Assert.*;

public class TelephoneTest {

    @org.junit.Test
    public void search1() {
        String fio = "Иванов И.И.";
        Telephone tel = new Telephone();
        ArrayList actual = tel.Search(fio);
        ArrayList telList = new ArrayList();
        ArrayList expect = new ArrayList();
        expect.add("1. +8 800 2000 500");
        expect.add("2. +8 800 200 600");
        assertEquals(actual,expect);
    }

    @org.junit.Test
    public void search2() {
        String fio = "Петров П.П.";
        Telephone tel = new Telephone();
        ArrayList actual = tel.Search(fio);
        ArrayList telList = new ArrayList();
        ArrayList expect = new ArrayList();
        expect.add("1. +8 800 2000 700");
        assertEquals(actual,expect);
    }

    @org.junit.Test
    public void search3() {
        String fio = "Денисов П.П.";
        Telephone tel = new Telephone();
        ArrayList actual = tel.Search(fio);
        ArrayList telList = new ArrayList();
        ArrayList expect = new ArrayList();
        expect.add("Такого ФИО в базе нет");
        assertEquals(actual,expect);
    }
}