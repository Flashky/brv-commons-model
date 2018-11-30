package brv.commons.model.tests.enums;


import static org.junit.Assert.*;

import org.junit.Test;

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

public class ProtocolTests {

	
	// README:
	// For each new protocol, the following tests should be added:
	// testPort<protocol>()
	//
	
	// --------------------------------------------------------------------
	// PORT TESTING
	// --------------------------------------------------------------------
	
	@Test
	public void testPortIcmp() {
		assertEquals(1, Protocol.ICMP.getDefaultPort().intValue());
	}

	@Test
	public void testPortFtp() {
		assertEquals(21, Protocol.FTP.getDefaultPort().intValue());
	}
	
	@Test
	public void testPortSsh() {
		assertEquals(22, Protocol.SSH.getDefaultPort().intValue());
	}
	
	@Test
	public void testPortSftp() {
		assertEquals(22, Protocol.SFTP.getDefaultPort().intValue());
	}
	
	@Test
	public void testPortScp() {
		assertEquals(22, Protocol.SCP.getDefaultPort().intValue());
	}
	
	@Test
	public void testPortHttp() {
		assertEquals(80, Protocol.HTTP.getDefaultPort().intValue());
	}
	
	@Test
	public void testPortHttps() {
		assertEquals(443, Protocol.HTTPS.getDefaultPort().intValue());
	}
	
	@Test
	public void testPortFtps() {
		assertEquals(990, Protocol.FTPS.getDefaultPort().intValue());
	}
	
	// --------------------------------------------------------------------
	// NAME TESTING
	// --------------------------------------------------------------------
	
	@Test
	public void testNameIcmp() {
		assertEquals("icmp", Protocol.ICMP.getName());
	}

	@Test
	public void testNameFtp() {
		assertEquals("ftp", Protocol.FTP.getName());
	}
	
	@Test
	public void testNameSsh() {
		assertEquals("ssh", Protocol.SSH.getName());
	}
	
	@Test
	public void testNameSftp() {
		assertEquals("sftp", Protocol.SFTP.getName());
	}
	
	@Test
	public void testNameScp() {
		assertEquals("scp", Protocol.SCP.getName());
	}
	
	@Test
	public void testNameHttp() {
		assertEquals("http", Protocol.HTTP.getName());
	}
	
	@Test
	public void testNameHttps() {
		assertEquals("https", Protocol.HTTPS.getName());
	}
	
	@Test
	public void testNameFtps() {
		assertEquals("ftps", Protocol.FTPS.getName());
	}
	
	// --------------------------------------------------------------------
	// SCHEME TESTING
	// --------------------------------------------------------------------
	
	@Test
	public void testSchemeIcmp() {
		assertEquals("icmp", Protocol.ICMP.getScheme());
	}

	@Test
	public void testSchemeFtp() {
		assertEquals("ftp://", Protocol.FTP.getScheme());
	}
	
	@Test
	public void testSchemeSsh() {
		assertEquals("ssh://", Protocol.SSH.getScheme());
	}
	
	@Test
	public void testSchemeSftp() {
		assertEquals("sftp://", Protocol.SFTP.getScheme());
	}
	
	@Test
	public void testSchemeScp() {
		assertEquals("scp://", Protocol.SCP.getScheme());
	}
	
	@Test
	public void testSchemeHttp() {
		assertEquals("http://", Protocol.HTTP.getScheme());
	}
	
	@Test
	public void testSchemeHttps() {
		assertEquals("https://", Protocol.HTTPS.getScheme());
	}
	
	@Test
	public void testSchemeFtps() {
		assertEquals("ftps://", Protocol.FTPS.getScheme());
	}
	
	// --------------------------------------------------------------------
	// STRING CAST TESTING
	// --------------------------------------------------------------------
	
	@Test
	public void testStringCastIcmp() {
		
		assertEquals(Protocol.ICMP, Protocol.valueOf("ICMP"));
	}

	@Test
	public void testStringCastFtp() {
		
		assertEquals(Protocol.FTP, Protocol.valueOf("FTP"));
	}
	
	@Test
	public void testStringCastSsh() {
		assertEquals(Protocol.SSH, Protocol.valueOf("SSH"));
	}
	
	@Test
	public void testStringCastSftp() {
		assertEquals(Protocol.SFTP, Protocol.valueOf("SFTP"));
	}
	
	@Test
	public void testStringCastScp() {
		assertEquals(Protocol.SCP, Protocol.valueOf("SCP"));
	}
	
	@Test
	public void testStringCastHttp() {
		assertEquals(Protocol.HTTP, Protocol.valueOf("HTTP"));
	}
	
	@Test
	public void testStringCastHttps() {
		assertEquals(Protocol.HTTPS, Protocol.valueOf("HTTPS"));
	}
	
	@Test
	public void testStringCastFtps() {
		assertEquals(Protocol.FTPS, Protocol.valueOf("FTPS"));
	}
	
}
