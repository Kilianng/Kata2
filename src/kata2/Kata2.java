/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class Kata2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map <Integer,Integer> histogram = new HashMap<>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for (int key : histogram.keySet()) {
            System.out.println(key + "==>" + histogram.get(key));
        }
    }
}
