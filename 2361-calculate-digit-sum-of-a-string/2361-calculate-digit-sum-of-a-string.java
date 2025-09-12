class Solution 
{
    public String digitSum(String s, int k)
     {
        while(s.length()>k)
        {
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i+=k)
            {
                int end=Math.min(i+k,s.length());
                String a=s.substring(i,end);
                int sum=0;
                for(char c:a.toCharArray())
                {
                    sum+=c-'0';
                }
                sb.append(sum);
            }
            s=sb.toString();
        }
        return s;
    }
}