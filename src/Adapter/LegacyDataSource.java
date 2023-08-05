package Adapter;

public class LegacyDataSource implements OldDataSource{
    @Override
    public void readData() {
        System.out.println("Đọc dữ liệu từ nguồn cũ.");
    }

    @Override
    public void writeData() {
        System.out.println("Ghi dữ liệu vào nguồn cũ.");
    }
}
