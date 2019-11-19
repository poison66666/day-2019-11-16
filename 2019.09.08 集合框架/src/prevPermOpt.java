import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prevPermOpt {
    public void swap(int []A,int x,int y)
    {
        int t = A[x];
        A[x] = A[y];
        A[y] = t;
    }

    public int[] prevPermOpt1(int[] A) {
        int x = 0,y = 0;
        List<Integer>list=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        for(int i = A.length-1;i > 0;i--)
        {
            if(A[i-1] > A[i])
            {
              x = i-1;
              break;
            }
        }


        //找比刚才找到的第一个数小的，
        //且是小中最大的，第一个出现的
        for(int j=x+1;j<A.length;j++)
        {
            if(A[j]<A[x])
            {
                if(!list2.contains(A[j]))
                {
                    list.add(j);
                    list2.add(A[j]);
                }
            }
        }
        Collections.sort(list);
        if(list.size()!=0)
        {
            y=list.get(list.size()-1);
            swap(A,x,y);
        }
        return A;
    }

    public int[] prevPermOpt2(int[] A) {
        int len = A.length;
        int curMax = -1;
        int index = -1;
        boolean hasReault = false;
        for(int i = len -2;i>=0;i--) {
            if(A[i+1]<A[i]) {
                for(int j = i+1;j<len;j++) {
                    if(A[i]>A[j]) {
                        hasReault = true;
                        if(A[j]>curMax) {
                            curMax = A[j];
                            index = j;
                        }
                    }
                }
                if(hasReault) {
                    int tmp = A[i];
                    A[i] = A[index];
                    A[index] = tmp;
                    return A;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int A[]=new prevPermOpt().prevPermOpt2(new int[]{1,9,4,6,7});
        for(int it:A)
        {
            System.out.print(it+" ");
        }
    }
}
