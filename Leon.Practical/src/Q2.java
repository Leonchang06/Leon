public class Q2 {

    // 自定义平方根方法
    public static double sqrt(double number) {
        // 处理特殊情况
        if (number < 0) {
            System.out.println("invalid: can't calculate negative of parameter");
            System.exit(1); // 终止程序
        }
        if (number == 0 || number == 1) {
            return number; // 直接返回 0 或 1
        }

        // 初始化上下界
        double lowerLimit, upperLimit;
        if (number > 1) {
            lowerLimit = 1;
            upperLimit = number;
        } else {
            lowerLimit = number;
            upperLimit = 1;
        }

        // 定义精度要求
        double precision = 1e-8; // 10^-8
        double midpoint = 0;

        // 使用二分法逼近平方根
        while ((upperLimit - lowerLimit) / lowerLimit >= precision) {
            midpoint = (lowerLimit + upperLimit) / 2; // 计算中点
            double midpointSquared = midpoint * midpoint; // 计算中点的平方

            if (midpointSquared > number) {
                upperLimit = midpoint; // 调整上界
            } else {
                lowerLimit = midpoint; // 调整下界
            }
        }

        return midpoint; // 返回最终的中点作为平方根的近似值
    }

    // 主方法
    public static void main(String[] args) {
        // 测试用例
        double[] testNumbers = {0, 1, 2, 3, 4, 0.5, -1};

        for (double num : testNumbers) {
            if (num < 0) {
                System.out.println("calculate " + num + " of parameter：");
            }
            double result = sqrt(num);
            if (num >= 0) {
                System.out.printf("sqrt(%.1f) = %.8f%n", num, result);
            }
        }
    }
}