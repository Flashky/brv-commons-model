package brv.commons.model.tests.enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import brv.commons.model.enums.Protocol;

/**
 * Unit testing for Protocol enumeration.
 * <p>
 * For each new protocol, the following tests should be added:
 * </p>
 * <ul>
 * 	<li><pre>testPort&lt;Protocol&gt;()</pre></li>
 *	<li><pre>testName&lt;Protocol&gt;()</pre></li>
 *	<li><pre>testScheme&lt;Protocol&gt;()</pre></li>
 *	<li><pre>testStringCast&lt;Protocol&gt;()</pre></li>
 * </ul>
 * @author Flashk
 *
 */
class ProtocolTests {

	
	// README:
	// For each new protocol, the following tests should be added:
	// testPort<protocol>()
	//
	
	// --------------------------------------------------------------------
	// PORT TESTING
	// --------------------------------------------------------------------
	
	@Test
	void testPortIcmp() {
		assertEquals(1, Protocol.ICMP.getDefaultPort().intValue());
	}

	@Test
	void testPortFtp() {
		assertEquals(21, Protocol.FTP.getDefaultPort().intValue());
	}
	
	@Test
	void testPortHttp() {
		assertEquals(80, Protocol.HTTP.getDefaultPort().intValue());
	}
	
	@Test
	void testNameHttps() {
		assertEquals(443, Protocol.HTTPS.getDefaultPort().intValue());
	}
	
	// --------------------------------------------------------------------
	// NAME TESTING
	// --------------------------------------------------------------------
	
	@Test
	void testNameIcmp() {
		assertEquals("icmp", Protocol.ICMP.getName());
	}

	@Test
	void testNameFtp() {
		assertEquals("ftp", Protocol.FTP.getName());
	}
	
	@Test
	void testNameHttp() {
		assertEquals("http", Protocol.HTTP.getName());
	}
	
	@Test
	void testPortHttps() {
		assertEquals("https", Protocol.HTTPS.getName());
	}
	
	// --------------------------------------------------------------------
	// SCHEME TESTING
	// --------------------------------------------------------------------
	
	@Test
	void testSchemeIcmp() {
		assertEquals("icmp", Protocol.ICMP.getScheme());
	}

	@Test
	void testSchemeFtp() {
		assertEquals("ftp://", Protocol.FTP.getScheme());
	}
	
	@Test
	void testSchemeHttp() {
		assertEquals("http://", Protocol.HTTP.getScheme());
	}
	
	@Test
	void testSchemeHttps() {
		assertEquals("https://", Protocol.HTTPS.getScheme());
	}
	
	// --------------------------------------------------------------------
	// STRING CAST TESTING
	// --------------------------------------------------------------------
	
	@Test
	void testStringCastIcmp() {
		
		assertEquals(Protocol.ICMP, Protocol.valueOf("ICMP"));
	}

	@Test
	void testStringCastFtp() {
		assertEquals(Protocol.FTP, Protocol.valueOf("FTP"));
	}
	
	@Test
	void testStringCastHttp() {
		assertEquals(Protocol.HTTP, Protocol.valueOf("HTTP"));
	}
	
	@Test
	void testStringCastHttps() {
		assertEquals(Protocol.HTTPS, Protocol.valueOf("HTTPS"));
	}
	
}
