public class Quiz {

  // Test 1
  // check if there is an element in the array
  public static int checkIfElementIsInArray(int[] theArray, int element) {
    int elementIsInArray = -1;

    for (int i = 0; i < theArray.length && elementIsInArray == -1; i++) {
      if (theArray[i] == element)
        elementIsInArray = i;
    }
    return elementIsInArray;
  }

  // check array has N values
  public static int hasNValues(int[] a, int n) {
    int arrayhasNValues = 1;
    int[] allElements = new int[n];
    int elementIndex = 0;
    for (int i = 0; i < a.length && arrayhasNValues == 1; i++) {
      if (checkIfElementIsInArray(allElements, a[i]) == -1) {
        if (elementIndex < n) {
          allElements[elementIndex] = a[i];
          elementIndex++;
        } else {
          arrayhasNValues = 0;
        }
      }
    }

    if (elementIndex != n)
      arrayhasNValues = 0;

    return arrayhasNValues;
  }

  // Test 2
  public static int closestFibonacci(int n) {
    // initialize closest number
    int closestFibonacciNumber = 0;
    if (n > 0) {
      int first = 0;
      int second = 1;
      int resultingNumber = first + second;

      do {
        first = second;
        second = resultingNumber;
        resultingNumber = first + second;
        if (resultingNumber >= n) {
          closestFibonacciNumber = second;
        }
      } while (resultingNumber <= n);

    }
    return closestFibonacciNumber;
  }

  // Test 3
  public static int isOlympic(int[] a) {
    // check array length
    int arrayLength = a.length;

    for (int i = 0; i < arrayLength; i++) {
      int initialSum = 0;

      for (int j = 0; j < arrayLength; j++) {
        if (a[j] < a[i])
          initialSum += a[j];
      }

      if (a[i] < initialSum)
        return 0;
    }

    return 1;
  }

  public static void main(String[] args) {

    // check results
    int[] a = { 1, 1, 1, 8, 1, 1, 1, 3, 3 };
    int n = 3;
   Quiz test = new Quiz();
    int sampleTest = test.hasNValues(a, n);
    System.out.println(sampleTest);
  }

}
