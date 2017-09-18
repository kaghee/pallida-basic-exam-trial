public class NameFromEmail{
    public static void main(String[] args){
        // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
        //and returns a string that represents the user name in the following format: lastName firstName
        //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
        //accents does not matter
        System.out.println(nameFromEmail("agi.kassai@exam.com"));
    }

    public static String nameFromEmail(String email) {
        String firstName = "", lastName = "";
            int i = 0;
            while (email.charAt(i) != '.') {        // getting the first name
                firstName += email.charAt(i);
                i++;
            }

            i++;                                    // skipping the dot between first and last name
            while (email.charAt(i) != '@') {        // getting the last name
                lastName += email.charAt(i);
                i++;
            }
        return capitalizer(lastName) + " " + capitalizer(firstName);
    }

    public static String capitalizer(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}