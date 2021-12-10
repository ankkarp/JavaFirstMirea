package ru.mirea.task27;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class opt1 {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("Дунаев", "Кирилл");
        students.put("Ерошев", "Илья");
        students.put("Карпов", "Даниил");
        students.put("Карпова", "Анна");
        students.put("Коврова", "Александра");
        students.put("Козлов", "Михаил");
        students.put("Коротков", "Илья");
        students.put("Кузнецов", "Денис");
        students.put("Куликов", "Сергей");
        students.put("Куроедова", "Александра");
        Iterator<Map.Entry<String, String>> iter = students.entrySet().iterator();
        HashSet<String> valueSet = new HashSet<String>();
        while (iter.hasNext()) {
            Map.Entry<String, String> next = iter.next();
            if (!valueSet.add(next.getValue())) {
                iter.remove();
            }
        }
        for (Map.Entry student: students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
        }
    }
}
