package Adapter;

public class ModernDataSource implements NewDataSource{
    @Override
    public void fetchData() {
        System.out.println("Lấy dữ liệu từ nguồn mới.");
    }

    @Override
    public void saveData() {
        System.out.println("Lưu dữ liệu vào nguồn mới.");
    }
}
