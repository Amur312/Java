public class Test {
    public static void main(String[] args) {
        Predicate<String> isNotNull = str -> str != null;
        Predicate<String> isNotEmpty = str -> str.length() > 0;
        String str1 = "Hello";
        String str2 = "";

        System.out.println(isNotEmpty.isNull(str1));
        System.out.println(isNotEmpty.isNull(str2));


        System.out.println(isNotNull.isNull(str1));
        System.out.println(isNotNull.isNull(str2));
    }
}
