/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Abhi
 */
public class ChildrenRoom {
    public static int MaxTime(List<Integer> a, List<Integer> b){
        Collections.sort(a);
        Collections.sort(b);
        int dist = 0;
        int time = 0;
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                dist = a.get(i) - b.get(j);
                if(dist>time){
                    time=dist;
                }
            }
        }
        return time;
    }
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(4);
        a.add(-4);
        a.add(2);
        b.add(4);
        b.add(0);
        b.add(5);
        System.out.println(MaxTime(a,b));
    }
}
