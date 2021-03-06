/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package DemoApp.app;

import DemoApp.list.LinkedList;

import static DemoApp.utilities.StringUtils.join;
import static DemoApp.utilities.StringUtils.split;

import java.util.ArrayList;

import static DemoApp.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
    public static boolean search(ArrayList<Integer> array, int e) {
        System.out.println("inside search");
        if (array == null) return false;
  
        for (int elt : array) {
          if (elt == e) return true;
        }
        return false;
      }



}
