boolean almostIncreasingSequence(int[] sequence) {
    int numOfChanges = 0;
    int i, j;
    for (i = 0; i < (sequence.length - 1); i++) {
        if (sequence[i] >= sequence[i + 1]) {
            numOfChanges++;
            for (j = i + 1; j < (sequence.length - 1); j++) {
                if (sequence[i] == sequence[j] || i > 0 && i + 2 < sequence.length && sequence[i] >= sequence[i + 2] && sequence[i - 1] >= sequence[i + 1]) {
                    numOfChanges++;
                }
            }
        }
    }
    if (numOfChanges > 1) {
        return false;
    } else {
        return true;
    }
}
