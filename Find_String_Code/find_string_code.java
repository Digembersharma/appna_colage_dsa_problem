public class find_string_code {

    
    public static void main(String[] args) {
        String str = "WORLD WIDE WEB";
        int ans = findStringCode(str);
        System.out.println(ans);
    }

    public static int findStringCode(String input1) {
        String[] words = input1.split("\\s+");
        StringBuilder finalResult = new StringBuilder();

        for (String word : words) {
            word = word.toUpperCase();
            int n = 0;
            int m = word.length() - 1;
            int sum = 0;

            while (n < m) {
                int val1 = word.charAt(n) - 'A' + 1;
                int val2 = word.charAt(m) - 'A' + 1;
                sum += Math.abs(val1 - val2);
                n++;
                m--;
            }
            if (n == m) {
                sum += word.charAt(n) - 'A' + 1;
            }

            finalResult.append(sum);
        }

        return Integer.parseInt(finalResult.toString());
    }
}

