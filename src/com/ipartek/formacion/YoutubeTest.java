package com.ipartek.formacion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class YoutubeTest {

	Youtube yt;
	static final String NOMBRE_VIDEO = "Video Prueba";
	static final String CODIGO_VIDEO = "r7-xpJE5I9A";

	@Before
	public void setUp() throws Exception {
		yt = new Youtube(NOMBRE_VIDEO, CODIGO_VIDEO);
	}

	@After
	public void tearDown() throws Exception {
		yt = null;
	}

	@Test
	public void testYoutube() throws Exception {
		assertEquals(NOMBRE_VIDEO, yt.getTitulo());
		assertEquals(CODIGO_VIDEO, yt.getCodigo());
		assertEquals(0, yt.getReproducciones());
		assertEquals(Youtube.URL + CODIGO_VIDEO, yt.getURL());

		try {
			Youtube tNull = new Youtube(null, null);
			assertEquals(null, tNull.getTitulo());
			assertEquals(null, tNull.getCodigo());
			assertEquals(0, yt.getReproducciones());
			assertEquals(Youtube.URL, yt.getURL());
		} catch (Exception e) {

		}

	}

	@Test
	public void testGetTitulo() {
		assertEquals(NOMBRE_VIDEO, yt.getTitulo());
	}

	@Test
	public void testSetTitulo() throws Exception {

		yt.setTitulo("La Resistencia");
		assertEquals("La Resistencia", yt.getTitulo());

		yt.setTitulo("LA");
		assertEquals("LA", yt.getTitulo());
		try {
			yt.setTitulo(
					"LAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
			assertEquals(
					"LAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
					yt.getTitulo());
		} catch (Exception e) {

		}

	}

	@Test
	public void testGetCodigo() {

		assertEquals(CODIGO_VIDEO, yt.getCodigo());

	}

	@Test
	public void testSetCodigo() throws Exception {
		yt.setCodigo("BZ7CLyfZhNM");
		assertEquals("BZ7CLyfZhNM", yt.getCodigo());

		try {
			yt.setCodigo("BZ7CLyfZhNMA");
			assertEquals("BZ7CLyfZhNMA", yt.getCodigo());
		} catch (Exception e) {
			
		}

		try {
			yt.setCodigo("LyfZhNMA");
			assertEquals("LyfZhNMA", yt.getCodigo());
		} catch (Exception e) {

		}

	}

	@Test
	public void testGetReproducciones() {
		assertEquals(0, yt.getReproducciones());
	}

	@Test
	public void testSetReproducciones() throws Exception {

		yt.setReproducciones(500);
		assertEquals(500, yt.getReproducciones());

		try {
			yt.setReproducciones(-500);
			assertEquals(-500, yt.getReproducciones());
		} catch (Exception e) {

		}

	}

	@Test
	public void testGetURL() {
		assertEquals(Youtube.URL + CODIGO_VIDEO, yt.getURL());
	}

}
