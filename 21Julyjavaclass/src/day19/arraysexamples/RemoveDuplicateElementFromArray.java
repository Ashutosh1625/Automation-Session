package day19.arraysexamples;

import java.util.Arrays;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {
		int num[] = { 10, 60, 30, 10, 10 };
		Arrays.sort(num);//10,10,10,30,60
		int ct=removeDup(num, num.length);
		for(int i=0;i<ct;i++) {
			System.out.println(num[i]);
		}

	}

	static int removeDup(int num[], int arrayElements) {
		int[] temp = new int[arrayElements];
		int j = 0;
		for (int i = 0; i < arrayElements - 1; i++) {
			if (num[i] != num[i + 1]) {//10!=30
				temp[j++] = num[i];
			}
		}
		temp[j++] = num[arrayElements - 1];
		for (int i = 0; i < j; i++) {
			num[i] = temp[i];
		}
		return j;
	}

}
/*
 10,10,10,30,60
 
 10:3
 30:1
 60:1
 */