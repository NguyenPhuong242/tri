public class tritas {
    public static void heapSort(Suite suite) {
        for (int i = suite.size() / 2 - 1; i >= 0; i--) {
            heapify(suite,suite.size(), i);
        }
        for (int i = suite.size() - 1; i >= 0; i--) {
            suite.permute(i, 0);
            heapify(suite,i, 0);
        }
    }

    public static void heapify(Suite suite,int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && suite.get(left) > suite.get(largest)) {
            largest = left;
        }
        if (right < n && suite.get(right) > suite.get(largest)) {
            largest = right;
        }
        if (largest != i) {
            suite.permute(i, largest);
            heapify(suite,n, largest);
        }
    }
}

