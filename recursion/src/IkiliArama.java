import java.util.Stack;

public class IkiliArama {
    public static void main(String[] args) {
        int[] dizi = {1, 3, 5, 7, 9, 11, 13};
        int aranan = 7;
        int sonuc = ikiliArama(dizi, aranan, 0, dizi.length - 1);
        if (sonuc != -1) {
            System.out.println("Aranan sayı " + aranan + " dizinin " + sonuc + ". indisinde");
        } else {
            System.out.println("Aranan sayı bulunamadı.");
        }
    }
    public static int ikiliArama(int[] dizi, int aranan, int baslangic, int son) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        stack1.push(baslangic);
        stack2.push(son);
        while (!stack1.isEmpty()) {
            int bas = stack1.pop();
            int sonraki = stack2.pop();
            int orta = (bas + sonraki) / 2;
            if (dizi[orta] == aranan) {
                return orta;
            } else if (dizi[orta] < aranan) {
                stack1.push(orta + 1);
                stack2.push(sonraki);
            } else {
                stack1.push(bas);
                stack2.push(orta - 1);
            }
        }

        return -1;
    }
}
