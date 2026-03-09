// Implement Selection Sort and compare with Bubble Sort
package Assignment3.searchingSorting;

public class Problem5 {

        public static void main(String[] args) {

            int[] arr = {5, 3, 8, 4, 2};

            for (int i = 0; i < arr.length - 1; i++) {

                int minIndex = i;

                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }

