import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test {
    public int InversePairs(int [] array) {
        int count=0;
        for(int i=0;i<array.length;i++)
        {
            int min=array[0];
            int index=0;
            for(int j=0;j<array.length;j++)
            {
                if(array[j]==10000000) index--;
                if(array[j]<min)
                {
                    min=array[j];
                    index=j;
                }
            }
            count+=index;
            array[index]=10000000;
        }
        return count;
    }

    public static void main(String[] args) {
        int count=new test().InversePairs(new int[]{3,2,5,8,4,7,6,9});
        System.out.println(count);
    }
}


