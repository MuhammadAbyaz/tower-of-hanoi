public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 64;
        towerOfHanoi(n, 'S', 'H', 'D');
    }

    public static void towerOfHanoi(int n, char src, char helper, char dest){
        if (n==1){
            System.out.println("Disk " + n + " shifted from " + src + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, src , dest, helper);
        System.out.println("Disk " + n + " shifted from " + src + " to " + dest);
        towerOfHanoi(n-1, helper , src , dest);
    }
}
