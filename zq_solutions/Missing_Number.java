class Missing_Number
{
 int MissingNumber(int array[], int n) {
        int sum=(n*(n+1))/2;
        int current_sum=0;
        for(int index=0;index<array.length;index++)
        {
            current_sum+=array[index];
        }
        return (sum-current_sum);
    }
    }
