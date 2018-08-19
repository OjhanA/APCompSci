public class StartS {
    public static void main (String[] args) {
        System.out.print ("\f");
        String[] words = new String[5];
        words[0] = "Sally";
        words[1] = "Henry";
        words[3] = "surprise";

        int count = 0;
        for (String w : words) {
            if (w != null && w.substring(0,1).equalsIgnoreCase("s")) {
                    System.out.println (w);
                    count++;
                }
        }
        System.out.println (count + " words start with 'S' or 's'");
    }
}