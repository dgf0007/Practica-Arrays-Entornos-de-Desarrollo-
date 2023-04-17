package com.entornos.Garcia_Fernandez_Daniel;

public abstract class Arrays {


	public static double media(int[] array) {
		int sumatorio = 0;
		for (int i = 0; i < array.length; i++) {
			sumatorio += array[i];
		}
		return (double) sumatorio / array.length;
	}


	public static double mediana(int[] array) {
		Arrays.sort(array);
		int middle = array.length / 2;
		if (array.length % 2 == 0) {
			return (double) (array[middle - 1] + array[middle]) / 2;
		} else {
			return (double) array[middle];
		}
	}

	protected static void sort(int[] array) {
		// TODO Auto-generated method stub

	}


	public static int maximo(int[] array) {
		int maximo = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maximo) {
				maximo = array[i];
			}
		}
		return maximo;
	}

	public static int minimo(int[] array) {
		int minimo = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minimo) {
				minimo = array[i];
			}
		}
		return minimo;
	}
}
