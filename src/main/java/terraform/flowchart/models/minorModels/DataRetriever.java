package terraform.flowchart.models.minorModels;

import java.util.List;

public class DataRetriever<T> {
    private List<T> dataList;

    public DataRetriever(List<T> dataList) {
        this.dataList = dataList;
    }

    public T getData(int index) {
        if (index >= 0 && index < dataList.size()) {
            return dataList.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
    }

    public int getSize() {
        return dataList.size();
    }
}
