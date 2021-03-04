package com.ds.guru;

import java.util.Arrays;

public class Aesthetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] trees = {3,4,5,3,7};
		int count = 0;
		if(isAesthetic(trees)) {
			System.out.println("Already aesthetic: 1");	
		}
		else {
			int[] cut = new int[trees.length-1];
			int selectedTree = 0;
			int cut_index = 0;
			while(selectedTree < trees.length) {
				for(int i=0; i<trees.length; i++) {
					if(i != selectedTree) {
						cut[cut_index] = trees[i];
						cut_index++;
					}
				}
				cut_index = 0;
				if(isAesthetic(cut)) {
					count++;
				}
				selectedTree++;
			}
			if(count == 0)
				System.out.println("We can't make it aesthetic");
			else
			System.out.println("Number of ways that we can make is aesthetic:"+count);
		}
	}

	private static boolean isAesthetic(int[] trees) {
		boolean isShort = true;
		for(int i=0; i<trees.length; i++) {
			if(isShort) {
				if(i+1 < trees.length && trees[i]<trees[i+1]) {
					isShort = false;
				}
				if(i+1 < trees.length && trees[i]>trees[i+1]) {
					return false;
				}
			}
			else {
				if(i+1 < trees.length && trees[i]>trees[i+1]) {
					isShort = true;
				}
				if(i+1 < trees.length && trees[i]<trees[i+1]) {
					return false;
				}
			}
		}
		return true;
	}

}
