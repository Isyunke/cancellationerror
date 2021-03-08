/**
 *@描述 计算抵消错误
 *@创建人  yunke
 *@创建时间  2021-03-07
 */
public class SumLeftRight {
    public static void main(String[] args) {
        final int N = 50000;
        double sumFromLeftToRight,sumFromRightToLeft;
        sumFromLeftToRight = sumFromRightToLeft = 0;

        for(int i = 1;i <= N;i++)
            sumFromLeftToRight += 1.0 / i;
        for(int i = N;i >= 1;i--)
            sumFromRightToLeft += 1.0 / i;

        System.out.println("从左到右计算的结果是： " + sumFromLeftToRight);
        System.out.println("从右到左计算的结果是： " + sumFromRightToLeft);

    }
}
