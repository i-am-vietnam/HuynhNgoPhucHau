package Adapter;

public class Adapter implements NewDataSource {
private OldDataSource oldDataSource;

 public Adapter(OldDataSource oldDataSource) {
    this.oldDataSource = oldDataSource;
}

 @Override
 public void fetchData() {
    oldDataSource.readData();
}

 @Override
 public void saveData() {
    oldDataSource.writeData();
}
}
