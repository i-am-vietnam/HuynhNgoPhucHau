package Adapter;

public class AdapterPatternExample {
    public static void main(String[] args) {
        NewDataSource newDataSource = new ModernDataSource();
        newDataSource.fetchData();
        newDataSource.saveData();

        OldDataSource oldDataSource = new LegacyDataSource();
        NewDataSource adaptedDataSource = new Adapter(oldDataSource);
        adaptedDataSource.fetchData();
        adaptedDataSource.saveData();
    }
}
