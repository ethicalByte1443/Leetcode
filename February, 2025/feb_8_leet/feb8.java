class NumberContainers {

    public NumberContainers() {
        numberToIndices = new HashMap<>();
        indexToNumbers = new HashMap<>();
    }

    public void change(int index, int number) {
        indexToNumbers.put(index, number);
        numberToIndices
            .computeIfAbsent(number, k -> new PriorityQueue<>())
            .add(index);
    }

    public int find(int number) {
        if (!numberToIndices.containsKey(number)) {
            return -1;
        }

        PriorityQueue<Integer> minHeap = numberToIndices.get(number);

        while (!minHeap.isEmpty()) {
            int index = minHeap.peek();

            if (indexToNumbers.get(index) == number) {
                return index;
            }
            minHeap.poll();
        }

        return -1;
    }
    private Map<Integer, PriorityQueue<Integer>> numberToIndices;
    private Map<Integer, Integer> indexToNumbers;
}