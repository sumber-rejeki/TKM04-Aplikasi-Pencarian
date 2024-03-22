import java.util.Scanner;

// Antarmuka pengguna sederhana
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataList dataList = new DataList();

        // Memasukkan data
        System.out.println("Masukkan jumlah data:   " );
        int n = scanner.nextInt();
        System.out.println("Masukkan nilai dan deskripsi data:  ");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            String description = scanner.next();
            dataList.addData(new Data(value, description));
        }

        // Melakukan pencarian
        System.out.println("Masukkan nilai untuk pencarian: ");
        int searchValue = scanner.nextInt();
        Data searchData = dataList.linearSearch(searchValue);
        if (searchData != null) {
            System.out.println("Data ditemukan: " + searchData.getDescription());
        } else {
            System.out.println("Data tidak ditemukan.");
        }

        // Mengurutkan data
        dataList.bubbleSort();

        // Menampilkan hasil pengurutan
        System.out.println("Data setelah diurutkan:");
        for (Data data : dataList.getDataList()) {
            System.out.println(data.getValue() + " " + data.getDescription());
        }

        scanner.close();
    }
}
