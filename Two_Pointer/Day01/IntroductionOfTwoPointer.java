/*
📌 DSA Pattern #1: Two Pointer

🔹 What is Two Pointer?
Two Pointer is a technique where we use two variables (pointers)
to traverse a data structure like array, string, or linked list.

Instead of using nested loops (O(n²)), we solve problems in O(n).

------------------------------------------------------------

🔹 Why use Two Pointer?
- Reduces time complexity
- Avoids extra space (in-place solution)
- Improves performance

------------------------------------------------------------

🔹 Pointer Movements:

1️⃣ Towards Each Other
- One pointer from start, one from end
- Used in:
  ✔ Palindrome check
  ✔ Reverse array/string

Example:
i → start, j → end
compare s[i] and s[j]

------------------------------------------------------------

2️⃣ Same Direction (Fast & Slow)
- Both pointers move forward
- Used in:
  ✔ Remove duplicates
  ✔ Linked List cycle detection
  ✔ Find middle of linked list

Example:
slow moves 1 step
fast moves 2 steps

------------------------------------------------------------

3️⃣ Away From Each Other
- Both pointers start from middle
- Move in opposite directions

------------------------------------------------------------

🔹 Key Concepts (PCS):

✔ Partitioning → Divide problem using pointers
✔ Comparison → Compare elements
✔ Searching → Find target efficiently

------------------------------------------------------------

🔹 Example 1: Palindrome

Brute Force:
- Reverse string → O(n) space

Optimized (Two Pointer):
- Compare from both ends
- Time: O(n)
- Space: O(1)

------------------------------------------------------------

🔹 Example 2: Two Sum (Sorted Array)

Brute Force:
- Nested loops → O(n²)

Two Pointer:
- Start + End
- Move pointers based on sum
- Time: O(n)

------------------------------------------------------------

🔹 Templates:

1️⃣ Opposite Ends Template

int i = 0, j = n - 1;
while(i < j){
    // compare
    // move i++, j--
}

------------------------------------------------------------

2️⃣ Same Direction Template

int i = 0, j = 0;
while(j < n){
    // process
    j++;
}

------------------------------------------------------------

🔹 Complexity:

Time: O(n)
Space: O(1)

------------------------------------------------------------

🎯 Summary:
Two Pointer helps to:
✔ Reduce time complexity
✔ Avoid extra memory
✔ Solve problems efficiently

------------------------------------------------------------

🔥 Use this pattern when:
- Array/String involved
- Sorted data
- Pair problems
- Palindrome / Reverse
*/