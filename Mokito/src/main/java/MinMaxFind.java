public class MinMaxFind {
	public static void main(String[] args) {
		int[] num = {1,5,9,11,19};
		findMinMax(num);
	}

public static  int[] findMinMax(int[] x) {
    int max = x[0];
    int min = x[0];
    for (int i = 1; i<x.length; i++) {
        if (x[i] > max)
            max = x[i];
        else if (x[i] < min)
            min = x[i];
    }
    int maxMin[] = {min, max};
    for(int i=0;i<2;i++)
        System.out.println(maxMin[i]);
    return maxMin;
}
public static int maximum(int[] x) {
    int max = x[0];
    for (int i=1; i<x.length; i++) {
        if (x[i]> max)
            max=x[i];
    }
    System.out.println(max);
    return max;

}
public static int minimum(int[] x) {
    int min = x[0];
    for (int i=1; i<x.length; i++) {
        if (x[i] < min)
            min=x[i];

    }
    System.out.println(min);
    return min;
}
}