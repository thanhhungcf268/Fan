import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new CollectionOperations());
        CollectionUtilsAdapter collectionUtilsAdapter = new CollectionUtilsAdapter(client);
        List<Integer> set = new ArrayList<>();
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(6);
        collectionUtilsAdapter.findMax(set);
//        String str = "aa";
//        String strS = "aa";
//        str = str.concat(strS);
//        System.out.println(str.hashCode());
//        System.out.println(strS.hashCode());
    }
//    private static Pattern pattern;
//    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
//    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
//    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
//
//    public static void main(String[] args) {
//        Main emailExample = new Main();
//        for (String email : validEmail) {
//            boolean isValid = emailExample.validate(email);
//            System.out.println("Email is " + email +" is valid: "+ isValid);
//        }
//        for (String email : invalidEmail) {
//            boolean isValid = emailExample.validate(email);
//            System.out.println("Email is " + email +" is valid: "+ isValid);
//        }
//    }
//    public Main() {
//        pattern = Pattern.compile(EMAIL_REGEX);
//    }
//
//    public boolean validate(String regex) {
//        Matcher matcher = pattern.matcher(regex);
//        return matcher.matches();
//    }
}