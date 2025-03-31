public class Main {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};
        int enBuyuk = enBuyukEleman(dizi);
        System.out.println("Dizideki en büyük eleman: " + enBuyuk);
    }

    public static int enBuyukEleman(int[] dizi) {
        int enBuyuk = dizi[0];
        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
        }
        return enBuyuk;
    }
}