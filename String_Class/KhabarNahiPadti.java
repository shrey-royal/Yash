public class KhabarNahiPadti {
    public static void main(String[] args) {
        String companyName = "royal enfield is a bike company";
        //now we will convert first letter of every word to uppercase

        String[] words = companyName.split(" ");
        String titleCase = "";
        for (String word : words) {
            titleCase += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }
        System.out.println(titleCase);
    }
}
