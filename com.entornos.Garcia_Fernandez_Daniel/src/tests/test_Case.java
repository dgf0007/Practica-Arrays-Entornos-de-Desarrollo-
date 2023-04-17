package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import com.entornos.Garcia_Fernandez_Daniel.Arrays;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

class test_Case {

	int array1[], array2[], array3[];

	@BeforeAll
	void iniciar() {
		array1 = new int[] { 3, 7, 8, 4, 9, 10 };
		array2 = new int[] { 6, 8, 5, 4, 9, 4, 12 };
		array3 = new int[] { 5, 3, 7, 9, 12, 7, 1, 9, 10 };
	}

	@Test
	void testMedia() {
		assertEquals(7.0, Math.round(Arrays.media(array1)));
		assertEquals(7.0, Math.round(Arrays.media(array2)));
		assertEquals(7.0, Math.round(Arrays.media(array3)));
	}

	@Test
	void testMediana() {
		assertEquals(6, Arrays.mediana(array1));
		assertEquals(4, Arrays.mediana(array2));
		assertEquals(12, Arrays.mediana(array3));
	}

	@Test
	void testMaximo() {
		assertEquals(10, Arrays.maximo(array1));
		assertEquals(12, Arrays.maximo(array2));
		assertEquals(12, Arrays.maximo(array3));
	}

}
