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
 * 	<li><code>testPort&lt;Protocol&gt;()</code></li>
 *	<li><code>testName&lt;Protocol&gt;()</code></li>
 *	<li><code>testScheme&lt;Protocol&gt;()</code></li>
 *	<li><code>testStringCast&lt;Protocol&gt;()</code></li>
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
	void testPortSsh() {
		assertEquals(22, Protocol.SSH.getDefaultPort().intValue());
	}
	
	@Test
	void testPortSftp() {
		assertEquals(22, Protocol.SFTP.getDefaultPort().intValue());
	}
	
	@Test
	void testPortScp() {
		assertEquals(22, Protocol.SCP.getDefaultPort().intValue());
	}
	
	@Test
	void testPortHttp() {
		assertEquals(80, Protocol.HTTP.getDefaultPort().intValue());
	}
	
	@Test
	void testPortHttps() {
		assertEquals(443, Protocol.HTTPS.getDefaultPort().intValue());
	}
	
	@Test
	void testPortFtps() {
		assertEquals(990, Protocol.FTPS.getDefaultPort().intValue());
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
	void testNameSsh() {
		assertEquals("ssh", Protocol.SSH.getName());
	}
	
	@Test
	void testNameSftp() {
		assertEquals("sftp", Protocol.SFTP.getName());
	}
	
	@Test
	void testNameScp() {
		assertEquals("scp", Protocol.SCP.getName());
	}
	
	@Test
	void testNameHttp() {
		assertEquals("http", Protocol.HTTP.getName());
	}
	
	@Test
	void testNameHttps() {
		assertEquals("https", Protocol.HTTPS.getName());
	}
	
	@Test
	void testNameFtps() {
		assertEquals("ftps", Protocol.FTPS.getName());
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
	void testSchemeSsh() {
		assertEquals("ssh://", Protocol.SSH.getScheme());
	}
	
	@Test
	void testSchemeSftp() {
		assertEquals("sftp://", Protocol.SFTP.getScheme());
	}
	
	@Test
	void testSchemeScp() {
		assertEquals("scp://", Protocol.SCP.getScheme());
	}
	
	@Test
	void testSchemeHttp() {
		assertEquals("http://", Protocol.HTTP.getScheme());
	}
	
	@Test
	void testSchemeHttps() {
		assertEquals("https://", Protocol.HTTPS.getScheme());
	}
	
	@Test
	void testSchemeFtps() {
		assertEquals("ftps://", Protocol.FTPS.getScheme());
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
	void testStringCastSsh() {
		assertEquals(Protocol.SSH, Protocol.valueOf("SSH"));
	}
	
	@Test
	void testStringCastSftp() {
		assertEquals(Protocol.SFTP, Protocol.valueOf("SFTP"));
	}
	
	@Test
	void testStringCastScp() {
		assertEquals(Protocol.SCP, Protocol.valueOf("SCP"));
	}
	
	@Test
	void testStringCastHttp() {
		assertEquals(Protocol.HTTP, Protocol.valueOf("HTTP"));
	}
	
	@Test
	void testStringCastHttps() {
		assertEquals(Protocol.HTTPS, Protocol.valueOf("HTTPS"));
	}
	
	@Test
	void testStringCastFtps() {
		assertEquals(Protocol.FTPS, Protocol.valueOf("FTPS"));
	}
	
}
