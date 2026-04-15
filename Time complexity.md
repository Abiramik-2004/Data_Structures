TIME COMPLEXITY:

✨How fast or slow your code runs when the input size increases.

If your program works fast for small input but becomes very slow for large input, it's a problem.
So we measure efficiency using time complexity.

Types:
---Linear Time complexity O(1) or O(n): Time increases with input size
    Eg: searching element in an unsorted array

---Constant Time Complexity O(n): Takes same time no matter input size
    Eg:for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

---Quadratic Time Complexity O(n*n): Very slow for big inputs
    Eg:for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }  

---Logarithmic Time Complexity: Very fast growth (good)
    Eg: Binary Search

---O(2 power of n): Every time input increases, the work doubles
    Eg:Imagine you have n switches, each can be ON or OFF.

            Total combinations =
            👉 2ⁿ

            n = 1 → 2
            n = 2 → 4
            n = 3 → 8
            n = 10 → 1024 
        Tree grow like:
                  n
                /   \
                n-1   n-1
            /  \   /  \

---Factorial Time complexity O(n!): Try all possible arrangements (permutations)
    Eg: You have 3 numbers: {1,2,3}

            All arrangements:

            123
            132
            213
            231
            312
            321

            👉 Total = 3! = 6
