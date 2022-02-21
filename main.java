package Main;

public class main
{
    public static void main(String[] args)
    {
        int[][] validOne =  {{2,7,6}, {9,5,1}, {4,3,8}};
        int[][] validTwo = {{17,24,1,8,15},{23,5,7,14,16},{4,6,13,20,22},{10,12,19,21,3},{11,18,25,2,9}};
        int[][] invalidOne = { {2,7,6}, {9,5,1}, {4,8,3} };
        int[][] invalidTwo = { {2,7,6}, {9,5,1}, {4,8,8} };
        int[][] invalidThree = { {5,5,5}, {5,5,5}, {5,5,5} };
        System.out.println("ValidOne: " + isMagicSquare(validOne));
        System.out.println("ValidTwo: " + isMagicSquare(validTwo));
        System.out.println("InvalidOne: " + isMagicSquare(invalidOne));
        System.out.println("Invlaid Two: " + isMagicSquare(invalidTwo));
        System.out.println("InvalidThree: " + isMagicSquare(invalidThree));
    }
    //returns true if square is magic
    public static boolean isMagicSquare(int[][] nums)
    {
        if(rowCheck(nums) && colCheck(nums) && diagCheck(nums) && diffNums(nums))
        {
            return true;
        }
        else return false;
            
    }
    public static boolean rowCheck(int[][] nums)
    {
        boolean check = false;
        
        for (int i=0 ; i<nums.length-1 ; i++)
        {
            int a = 0;
            int b = 0;
            for (int j=0; j<nums[i].length ; j++)
            {
                a += nums[i][j];
                b += nums[i+1][j];
            }
            if (a==b)
                {
                    check = true;
                }
                else
                {
                    check = false;
                    return check;
                }
        }
        return check;
    }
    public static boolean colCheck(int[][] nums)
    {
        boolean check = false;
        for (int i=0 ; i<nums.length-1 ; i++)
        {
            int a = 0;
            int b = 0;
            for (int j=0 ; j<nums.length ; j++)
            {
                a += nums[j][i];
                b += nums[j][i+1];
            }
            if (a==b)
            {
                check = true;
            }
            else   
            {
                check = false;
                return check;
            }
        }
        return check;
    }
    public static boolean diagCheck(int[][] nums)
    {
        boolean check = false;
        int a=0;
        int b=0;
        for (int i=0 ; i<nums.length ; i++)
        {
            a += nums[i][i];
        }
        for (int i=0 ; i<nums.length ; i++)
        {
            b += nums[i][nums.length-1-i];
        }
        if (a==b)
        {
            check = true;
            return check;
        }
        else return false;
    }
    public static boolean diffNums(int[][] nums)
    {
        boolean check = true;
        for (int i=0 ; i<nums.length ; i++)
        {
            for (int j=0 ; j<nums.length ; j++)
            {
                for (int k=0 ; k<nums.length ; k++)
                {
                    for (int p=1 ; p<nums.length ; p++)
                    {
                        if (i!=k && j!=p)
                        {
                            if (nums[i][j] == nums[k][p])
                            {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return check;
    }
}
