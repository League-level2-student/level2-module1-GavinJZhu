package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
    public static void main(String[] args) {
        //1. Create an array list of Strings
        //   Don't forget to import the ArrayList (java.util) class
        ArrayList<String> names = new ArrayList<String>();

        //2. Add five Strings to your list
        names.add("john");
        names.add("johnny");
        names.add("jonathan");
        names.add("james");
        names.add("jeremy");
        names.add("rey");
        names.add("gavin");
        //3. Print all the Strings using a standard for-loop
        for(int i = 0; i<names.size(); i++){
            System.out.println(names.get(i));
        }
        //4. Print all the Strings using a for-each loop
        for (String name : names) {
            System.out.println(name);
        }
        //5. Print only the even numbered elements in the list.
        for(int i = 0; i<names.size(); i++){
            if (i % 2 == 0) {
                System.out.println(i+" "+names.get(i));
            }
        }
        //6. Print all the Strings in reverse order.
        for(int i = names.size() - 1; i>=0; i--){
            System.out.println(i+" "+names.get(i));
        }
        //7. Print only the Strings that have the letter 'e' in them.

    }
}
