# Remove Duplicates from Sorted Array II (LeetCode 80)

## Topic
Arrays, Two Pointers

## Time Complexity
O(n)

## Space Complexity
O(1)

## Key Idea
Keep at most two copies of each number.
Use i as the reader and j as the writer.

## What I Learned
- i reads every element.
- j writes only valid elements.
- Compare with nums[j - 2] because only two duplicates are allowed.

## Mistakes I Made
- Wrote `lenght` instead of `length`.
- Forgot `nums[j] = nums[i]`.
- Forgot `;` after `j++`.