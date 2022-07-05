import java.io.*;
import java.lang.*;
import java.util.*;
 
class meeting{
    int start;
    int end;
    int pos;
    
    meeting(int start,int end,int pos){
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}

class meetingComparator implements Comparator<meeting>
{
    @Override
    public int compare(meeting o1, meeting o2) 
    {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if(o1.pos < o2.pos)
            return -1;
        return 1; 
    }
}

public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end)     {
        ArrayList<meeting> meet= new ArrayList<>();
        int n=start.size();
        for(int i=0;i<n;++i){
            meet.add(new meeting(start.get(i),end.get(i),i+1));
        }
        
        meetingComparator mc=new meetingComparator();
        Collections.sort(meet,mc);
        int count=1;
        int limit=meet.get(0).end;
        
        
        for(int i=1;i<meet.size();++i){
            if(meet.get(i).start>=limit){
                ++count;
                limit=meet.get(i).end;
            }
        }
        
        return count;
    }
}