TYPES OF SLIDING WINDOW

    # FIxed Size Window
    # Variable Size Window

1. Fixed Size Window:
    Window Size is constant
    Eg: Find maximum sum of subarray of size k

2. Variable Size Window:
    Window Size changes based on condition
    Eg: Longest substring without repeating characters

Illustration:

public int maxSum(int[] arr, int k) {
    int windowSum = 0;
    int maxSum = 0;
    for (int i = 0; i < k; i++) {
        windowSum += arr[i];// in this block they will added the first k size that is window size elements only 
    }

    maxSum = windowSum;
    for (int i = k; i < arr.length; i++) {
        windowSum += arr[i];      
        windowSum -= arr[i - k];  
        previous
        maxSum = Math.max(maxSum, windowSum);// in this block they added and remove the elements according to the window size
    }

    return maxSum;
}

When to Use It?

    Use Sliding Window when:

    You see subarray / substring
    You need continuous elements
    Problem says “largest”, “smallest”, “longest”