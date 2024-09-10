import java.util.ArrayList;
import java.util.List;

public class Mezclar {
    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> resultList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                resultList.add(list1.get(i));
                i++;
            } else {
                resultList.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            resultList.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            resultList.add(list2.get(j));
            j++;
        }
        return resultList;
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Por favor, proporcione dos listas de numeros.");
            return;
        }
        List<Integer> list1 = parseList(args[0]);
        List<Integer> list2 = parseList(args[1]);
        List<Integer> mergedList = merge(list1, list2);
        System.out.println(mergedList);
    }

    private static List<Integer> parseList(String arg) {
        String[] numbers = arg.split(",\\s*");
        List<Integer> list = new ArrayList<>();
        for (String num : numbers) {
            list.add(Integer.parseInt(num));
        }
        return list;
    }
}