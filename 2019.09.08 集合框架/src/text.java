import java.util.*;

public class text {
        public List<List<Integer>> threeSum(int[] nums) {

            List<List<Integer>>list=new ArrayList<>();

            for(int i=0;i<nums.length-2;i++)
            {
                for(int j=i+1;j<nums.length-1;j++)
                {
                    for(int k=j+1;k<nums.length;k++)
                    {

                        if((nums[i]+nums[j]+nums[k])==0)
                        {
                            List<Integer>ll=new ArrayList<>();
                            ll.add(nums[i]);
                            ll.add(nums[j]);
                            ll.add(nums[k]);
                            list.add(ll);

                        }


                    }
                }
            }

            for(int i=0;i<list.size();i++)
            {
                Collections.sort(list.get(i));
            }
            List<List<Integer>>list0=new ArrayList<>();
            list0.add(list.get(0));
            for(int i=1;i<list.size();i++)
            {
                if(!(list0.contains(list.get(i))))list0.add(list.get(i));
            }

            System.out.println(list0);
            return list0;
        }

        public List<List<Integer>> threeSum2(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            for(int k = 0;k<nums.length-2;k++) {
                if(nums[k] > 0) {
                    break;
                }
                if(k>0 && nums[k]==nums[k-1]){
                    continue;
                }
                int i = k+1;int j = nums.length-1;
                while(i<j){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum<0){
                        while(i<j&&nums[i]==nums[++i]);
                    }
                    else if(sum>0) {
                        while(i<j&&nums[j] == nums[--j]);
                    }
                    else{
                        res.add(new ArrayList<Integer>(Arrays.asList(nums[k],nums[i],nums[j])));
                        while(i<j && nums[i]==nums[++i]);
                        while(i<j && nums[j] == nums[--j]);
                    }
                }
            }
            System.out.println(res);
            return res;
        }

        public List<List<Integer>> threeSum3(int[] nums) {
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < nums.length - 2; i++) {
                int j = i + 1;
                int k = nums.length - 1;
                while(j<k&&nums[i]==nums[i+1]) {
                    i++;
                }

                while (j < k && nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                }
                if (j >= k) {
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> e = new ArrayList<>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(nums[k]);
                    list.add(e);
                    while(j<k&&nums[j]==nums[j+1]) {
                        j++;
                    }
                    j++;
                }
                while (j < k && nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                }
                if (j >= k) {
                    break;
                }
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> e = new ArrayList<>();
                    e.add(nums[i]);
                    e.add(nums[j]);
                    e.add(nums[k]);
                    list.add(e);
                    while(j<k&&nums[k]==nums[k-1]) {
                        k--;
                    }
                    k--;
                }

            }
            System.out.println(list);
            return list;
        }

    public static void main(String[] args) {
        new text().threeSum3(new int[]{-1,-4,-1,0,-1,1,2});

    }
    }
