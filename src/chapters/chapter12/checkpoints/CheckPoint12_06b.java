package chapters.chapter12.checkpoints;

public class CheckPoint12_06b {
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex){
        }
    }
}
