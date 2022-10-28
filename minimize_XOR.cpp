int minimizeXor(int num1, int num2)
{
    int setb = __builtin_popcount(num2);
    int seta = __builtin_popcount(num1);
    int ans = 0;
    for (int i = 0; i <= 31; i++)
    {
        int mask = 1 << i;
        int set = num1 & mask;
        if (set == 0 && setb > seta)
        {
            ans |= mask;
            setb--;
        }
        else if (set && seta > setb)
            seta--;
        else
            ans |= set;
    }
    return ans;
}