// Дана строка. Необходимо написать метод,
// который отсортирует слова в строке по длине с помощью TreeMap.
// Слова с одинаковой длиной не должны “потеряться”.
// Пример:
// Входные данные:
// Если вы можете мечтать об этом вы можете это сделать
// Выходные данные:
// вы об вы это если этом можете можете мечтать сделать
public class taskWords {
    public static void main(final String[] args) {
        taskWords tk = new taskWords();
        String ourStr = "Если вы можете мечтать об этом вы можете это сделать";
        System.out.println(tk.getSortedIncludesWords(ourStr));
    }

    public String getSortedIncludesWords(final String inputStr) {
        List<String> inputTextList = Arrays.asList(inputStr.toLowerCase().split(" "));
        Map<Integer, List<String>> subResultMap = new TreeMap<>();
        for (String item : inputTextList) {
            if (subResultMap.containsKey(item.length())) {
                List<String> temp = subResultMap.get(item.length());
                temp.add(item);
                subResultMap.put(item.length(), temp);
            } else {
                List<String> temp = new ArrayList<>(List.of(item));
                subResultMap.put(item.length(), temp);
            }
        }
        StringBuilder resultStr = new StringBuilder();
        for (List<String> item : subResultMap.values()) {
            resultStr.append(item);
        }
        return String.valueOf(resultStr);
    }
}