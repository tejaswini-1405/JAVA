/*
ℹ️ A sorting algorithm is called stable if it maintains the relative order of elements with equal values after sorting. In other words, if two elements have the same key, their order in the sorted output remains the same as in the input.

ℹ️ A sorting algorithm is called unstable if it does not preserve the relative order of equal elements. In this case, elements with the same value may change their positions during the sorting process.

Example
Consider the following list where elements have the same value but different labels:
=> (3A, 1, 3B, 2)
Here, 3A and 3B have the same value (3) but different identities.

If a stable sorting algorithm is used, the sorted output will be:
=> (1, 2, 3A, 3B)
The relative order of 3A and 3B remains the same.

If an unstable sorting algorithm is used, the sorted output may be:
=>(1, 2, 3B, 3A)

Here the order of the equal elements has changed.

Some commonly used stable sorting algorithms include:
⭐ Bubble Sort
⭐ Insertion Sort
⭐ Merge Sort

These algorithms preserve the order of equal elements during sorting.
Some sorting algorithms that are generally unstable include:
⭐ Selection Sort
⭐Quick Sort

These algorithms may change the order of elements with equal values during the sorting process.
 */