public class Q4 {

    // 计算 2 个整数的平均值
    public static double calculateAverage(int a, int b) {
        return (a + b) / 2.0; // 使用 2.0 避免整数除法
    }

    // 计算 3 个整数的平均值
    public static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0; // 使用 3.0 避免整数除法
    }

    // 计算 2 个双精度浮点数的平均值
    public static double calculateAverage(double a, double b) {
        return (a + b) / 2.0;
    }

    // 计算 3 个双精度浮点数的平均值
    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    // 主方法
    public static void main(String[] args) {
        // 测试整数平均值
        System.out.println("2 int paremeter: " + calculateAverage(10, 20)); // 15.0
        System.out.println("3 int parameter: " + calculateAverage(10, 20, 30)); // 20.0

        // 测试双精度浮点数平均值
        System.out.println("2 double parameter: " + calculateAverage(10.5, 20.5)); // 15.5
        System.out.println("3 double parameter: " + calculateAverage(10.5, 20.5, 30.5)); // 20.5
    }
}