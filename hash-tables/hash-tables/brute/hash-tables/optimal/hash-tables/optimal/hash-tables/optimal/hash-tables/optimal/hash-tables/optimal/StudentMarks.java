import java.util.HashMap;

public class StudentMarks {

    public static void main(String[] args) {

        HashMap<String,Integer> map =
                new HashMap<>();

        map.put("Ali",80);
        map.put("Sara",90);
        map.put("Ahmed",75);

        System.out.println(map);

        System.out.println(
                map.get("Sara")
        );

        map.remove("Ahmed");

        System.out.println(map);
    }
}