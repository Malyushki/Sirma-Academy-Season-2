 public class EX_01_06_04_2023 {
    public static void main(String[] args) {

            int[] numbers = {1, 9, 20, 34, 90, 240};
            int[] bitonicNumbers = {1, 9, 54, 34, 90, 240, 80, 54, 30, 8, 7, 2, 0};

            int numberToFind = 34;
            int bitonicNumberToFind = 54;

            System.out.println("Binary search:");
            System.out.println(binarySearch(numbers, numberToFind, 0, numbers.length));

            System.out.println("Bitonic search:");
            int index = bitonicSearch(bitonicNumbers, bitonicNumberToFind);
            if (index != -1) {
                System.out.println(bitonicNumberToFind + " found at index " + index);
            } else {
                System.out.println(bitonicNumberToFind + " not found");
            }
        }

    public static int binarySearch(int [] numbers, int numberToFind, int leftIndex, int rightIndex) {
        if (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (numbers[middleIndex]== numberToFind) {
                return middleIndex;
            } else if (numbers[middleIndex] < numberToFind) {
                return binarySearch(numbers, numberToFind, middleIndex + 1, rightIndex);
            } else {
                return binarySearch(numbers, numberToFind, leftIndex, middleIndex - 1);
            }
        }
        return -1;
    }

    public static int bitonicSearch(int[] numbers, int numberToFind) {
        int peakIndex = findPeakIndex(numbers);
        int leftIndex = binarySearch(numbers, numberToFind, 0, peakIndex);
        int rightIndex = binarySearch(numbers, numberToFind, peakIndex + 1, numbers.length - 1);
        if (leftIndex != -1) {
            return leftIndex;
        } else if (rightIndex != -1) {
            return rightIndex;
        } else {
            return -1;
        }
    }

    public static int findPeakIndex(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
