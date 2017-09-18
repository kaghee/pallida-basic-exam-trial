import java.util.ArrayList;
import java.util.Arrays;

public class UrlFromHandles{
    public static void main(String[] args){
        // Create a function that takes a list of GitHub handles as input and returns a list of strings that represents
        // GitHub url's under Green Fox Academy organization in the following format: "https://github.com/greenfox-academy/teststudent"

        ArrayList<String> handles = new ArrayList<>();
        handles.addAll(Arrays.asList("cruelnotes", "kaghee"));
        System.out.println(urlsFromHandles(handles));
    }

    public static ArrayList<String> urlsFromHandles(ArrayList<String> list) {
        String url = "https://github.com/greenfox-academy/";
        ArrayList<String> links = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            links.add(url.concat(list.get(i)));
        }
        return links;
        // to display the links independently set return value to void and print out the links within the function instead
    }
}