public class Main {
    public static void main(String[] args) {

        System.out.println(canPack(0, 5, 4));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigCountSize = bigCount * 5;
        int totalCount = bigCountSize + smallCount;
        if(totalCount >= goal) {
            if(smallCount >= goal % 5) {
                return true;
            }
        }
            return false;
    }
}
