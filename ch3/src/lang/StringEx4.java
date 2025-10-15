package lang;

public class StringEx4 {
    public static void main(String[] args) {
        // Kim이 몇번쨰인지 알려주는 기능
        String[] names = { "Queen", "Tod", "Kim", "Park", "Hong" };

        StringEx4 obj = new StringEx4();
        String result = obj.findKim(names);
        System.out.println(result);
    }

    public String findKim(String[] names) {
        int pos = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Kim")) {
                pos = i;
                break;
            }
        }
        return "Kim은 " + (pos + 1) + "번째에 있다.";
    }

}
