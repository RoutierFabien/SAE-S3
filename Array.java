import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Array {
    static ArrayList<String> couleurs = new ArrayList<String>() {{
        add("Rouge");
        add("Bleu");
        add("Vert");
        add("Violet");
        add("Orange");
    }};


    static ArrayList<String> couleurs4 = new ArrayList<String>() {{
        add("Rouge");
        add("Bleu");
        add("Vert");
        add("Violet");
        add("Orange");
    }};

    static ArrayList<String> couleurs5 = new ArrayList<String>(10) {{
        add("Rouge");
        add("Bleu");
        add("Vert");
        add("Violet");
        add("Orange");
    }};

    public static ArrayList afficheCouleurs() {
        return couleurs;
    }

    public static void main(String[] args) {
        System.out.println(couleurs);

        couleurs.add(0, "Jaune");
        System.out.println(couleurs);

        System.out.println(couleurs.get(2));

        couleurs.set(2, "Marron");
        System.out.println(couleurs);

        couleurs.remove(3);
        System.out.println(couleurs);

        Collections.sort(couleurs);
        System.out.println(couleurs);

        Object couleurs2 = couleurs.clone();
        System.out.println(couleurs2);

        Collections.reverse(couleurs);
        System.out.println(couleurs);

        List<String> couleurs3 = couleurs.subList(2, 4);
        System.out.println(couleurs3);

        if (couleurs.equals(couleurs2)) {
            System.out.println("Ils sont égaux");
        } else {
            System.out.println("Ils ne sont pas égaux");
        }

        System.out.println(couleurs);
        Collections.swap(couleurs, 1, 2);
        System.out.println(couleurs);

        couleurs.addAll(couleurs3);
        System.out.println(couleurs);

        couleurs4.clear();
        System.out.println(couleurs);

        if (couleurs4.isEmpty()) {
            System.out.println("Elle est vide");
        } else {
            System.out.println("Elle n'est pas vide");
        }

        couleurs5.ensureCapacity(10);
        int i;
        for (i = 0; i < couleurs5.size(); ++i) {
            System.out.println(couleurs5 + " ");
        }
        couleurs5.trimToSize();
        System.out.println(couleurs5.size());

        couleurs5.ensureCapacity(100);

        System.out.println(couleurs);
        couleurs.set(2, "Noir");
        System.out.println(couleurs);

        for (i = 0; i < couleurs.size(); ++i){
            System.out.println(i);
            System.out.println(couleurs.get(i));
        }
    }
}
