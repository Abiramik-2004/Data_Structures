Big Order Notation (Big O Notation):

👉 Big O tells how fast an algorithm grows when input size (n) increases.

👉 It focuses on:

Worst-case performance
Growth, not exact time

O(1) → “Just one step”
O(n) → “Check all”
O(log n) → “Divide and search”
O(n²) → “Compare everything with everything”
O(2ⁿ) → “Try all combinations”
O(n!) → “Try all arrangements”


🔷 How to Find Big O (Step-by-Step)

👉 Think of one question only:

“How many times does the main operation run?”

    🟢 STEP 1: Ignore constants and small stuff
        for(int i = 0; i < n; i++) {
            System.out.println(i); // runs n times
        }

        👉 Big O = O(n)
        (not O(n + 5) or something)

🟢 STEP 2: Check loops
        🔹 Single loop
            for(int i = 0; i < n; i++)

            👉 Runs n times → O(n)

        🔹 Nested loops (multiply)
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    // runs n * n
                }
            }

            👉 Big O = O(n²)

        🔹 Loop with half reduction
                for(int i = n; i > 0; i = i / 2)

                    👉 n → n/2 → n/4 → ...
                    👉 Big O = O(log n)

🟢 STEP 3: Check multiple parts (add them)
        for(int i = 0; i < n; i++) {}   // O(n)

        for(int j = 0; j < n; j++) {}   // O(n)

        👉 Total = O(n + n) = O(n)

        👉 Always take the largest term

🟢 STEP 4: Check recursion
    🔹 Example 1
            fun(n) {
            fun(n-1);
            }

            👉 Runs n times → O(n)

    🔹 Example 2
            fun(n) {
            fun(n-1);
            fun(n-1);
            }

        👉 Each call makes 2 calls
        👉 Big O = O(2ⁿ)

🟢 STEP 5: Drop constants
    for(int i = 0; i < 2*n; i++)

    👉 Still O(n) (ignore 2)