import java.util.ArrayList;
import java.util.Collections;

// Kelas DataList untuk menyimpan dan mengelola daftar data
class DataList {
    private ArrayList<Data> dataList;

    public DataList() {
        dataList = new ArrayList<>();
    }

    // Menambahkan data ke dalam daftar
    public void addData(Data data) {
        dataList.add(data);
    }

    // Melakukan pencarian linear berdasarkan nilai atau deskripsi
    public Data linearSearch(int value) {
        for (Data data : dataList) {
            if (data.getValue() == value) {
                return data;
            }
        }
        return null;
    }

    public Data linearSearch(String description) {
        for (Data data : dataList) {
            if (data.getDescription().equals(description)) {
                return data;
            }
        }
        return null;
    }

    // Melakukan pencarian biner (binary search) dalam daftar yang telah diurutkan berdasarkan nilai
    public Data binarySearch(int value) {
        int low = 0;
        int high = dataList.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            Data midData = dataList.get(mid);
            if (midData.getValue() == value) {
                return midData;
            } else if (midData.getValue() < value) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }

    // Mengurutkan data menggunakan algoritma bubble sort
    public void bubbleSort() {
        int n = dataList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dataList.get(j).getValue() > dataList.get(j + 1).getValue()) {
                    Collections.swap(dataList, j, j + 1);
                }
            }
        }
    }

    // Getter untuk mendapatkan daftar data
    public ArrayList<Data> getDataList() {
        return dataList;
    }
}
