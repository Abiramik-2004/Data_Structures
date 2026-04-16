SLIDING WINDOW:

    ✨Instead of checking every possible part of an array (which is slow), we take a “window” (a small part of the array) and slide it step by step.
    
Steps: 
    ✨You have a window of size k
    ✨You look at the first k elements
    ✨Then move the window one step forward
    ✨Repeat until the end

Example:
    Array: [2, 1, 5, 1, 3, 2]
    Window size: 3

    Step-by-step:
    First window → [2, 1, 5]
    Slide → [1, 5, 1]
    Slide → [5, 1, 3]
    Slide → [1, 3, 2]

    Instead of recalculating everything, we:

    Remove the first element
    Add the next element

Why use Sliding Window?
    Faster than brute force
    Reduces time complexity from O(n²) → O(n)


