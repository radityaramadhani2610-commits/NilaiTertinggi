public class Main {
    public static int getNilaiMax(int[] arr) {
        int max = arr[0]; 

        for (int angka : arr) {
            if (angka > max) {
                max = angka; // Jika ada yang lebih besar, perbarui nilai max
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] dataAngka = {12, 45, 7, 89, 23, 56};

        int hasil = getNilaiMax(dataAngka);

        System.out.println("Nilai terbesar di dalam array adalah: " + hasil);
    }
}