# Merge Sorted Array (LeetCode 88) - Optimal Solution

## Topic
- Arrays
- Two Pointers

## Time Complexity
- O(m + n)

## Space Complexity
- O(1)

## Key Idea
Instead of creating a temporary array, we merge the arrays from the **end**.

- Initialize three pointers:
    - `i = m - 1` → Last valid element in `nums1`
    - `j = n - 1` → Last element in `nums2`
    - `k = m + n - 1` → Last index of `nums1`
- Compare `nums1[i]` and `nums2[j]`.
- Place the larger element at `nums1[k]`.
- Move the corresponding pointer (`i` or `j`) and decrement `k`.
- Continue until one array is exhausted.
- If elements remain in `nums2`, copy them into `nums1`.

## Why It Works
Since `nums1` has extra space at the end, filling it **from right to left** prevents overwriting the valid elements already present in `nums1`.

## What I Learned
- How to merge two sorted arrays in-place.
- Why we start from the last index.
- The purpose of the three pointers (`i`, `j`, and `k`).
- Why we only need to copy the remaining elements from `nums2`.
- How to reduce space complexity from **O(m + n)** to **O(1)**.

## Mistakes I Made
- Used `while(i < m && j < n)` instead of `while(i >= 0 && j >= 0)`.
- Compared the wrong arrays (`nums1[i]` with `nums1[j]`).
- Increased `j` instead of decreasing it.
- Copied `nums2[i]` instead of `nums2[j]`.
- Forgot that `k` should always move left after every placement.
- Misspelled `while` as `whilw`.
- Forgot braces around the `if` block.

## Final Approach
- Start from the end of both arrays.
- Place the larger element at the end of `nums1`.
- Continue until all elements are merged.
- Copy any remaining elements from `nums2`.


