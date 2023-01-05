import java.time.temporal.ValueRange;
import java.util.*;

public class HashMapExo {

    public static void main(String[] args) {
        Map<String, String> lang = new HashMap<String, String>();
        lang.put("1", "Java");
        lang.put("2", "PHP");
        lang.put("3", "Python");
        lang.put("4", "HTML");
        lang.put("5", "JavaScript");
        lang.put("6", "C++");
        System.out.println(lang);
        System.out.println(lang.size());

        HashMap<String, String> lang2 = new HashMap <String, String>(lang);
        System.out.println(lang2);

        lang.clear();
        System.out.println(lang.size());

        if (lang.isEmpty()) {
            System.out.println("La map est vide");
        } else {
            System.out.println("La map n'est pas vide");
        }

        if ( lang2.containsValue("C++")) {
            System.out.println("La map contient cette valeur.");
        } else {
            System.out.println("La map ne contient pas cette valeur.");
        }

        Collection<String> Valeurs = lang2.values();
        System.out.println("Vue des valeurs de lang : " + Valeurs);

        System.out.println("La valeur du lang 1 est " + lang2.get("1"));


    }
}
