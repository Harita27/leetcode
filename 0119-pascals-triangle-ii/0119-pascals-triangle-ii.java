class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        if (rowIndex == 0) return result;
        if (rowIndex == 1) {
            result.add(1);
            return result;
        }
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(1);
            if (i == 1) {
                currentRow.add(1);
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j == i) {
                        currentRow.add(1);
                    } else {
                        currentRow.add(result.get(j - 1) + result.get(j));
                    }
                }
            }
            result = currentRow;
        }
        return result;
    }
}