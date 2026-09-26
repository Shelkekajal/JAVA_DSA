//activity selection code by sorting technique
import java.util.*;
public class g2{
    public static void main(String args[]){
        int start[]={1,3,0,5,1,5};
        int end[]={9, 2, 6, 4, 7, 3};
        //Sorting 
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("max activities ="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}