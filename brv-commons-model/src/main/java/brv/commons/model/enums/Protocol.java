package brv.commons.model.enums;

import java.io.Serializable;

/**
 * Protocol enumeration
 * <p>
 * Each enum value stores its name (IE: http), the scheme (IE: ://) and the default port (IE: 80).<br>
 * </p>
 * <p>
 * Additional information on protocols:<br>
 * @see <a href="http://www.meridianoutpost.com/resources/articles/well-known-tcpip-ports.php">Well Known Protocol numbers</a>
 * @see <a href="https://www.iana.org/assignments/uri-schemes/uri-schemes.xhtml">Uri Scheme of every protocol</a>
 * </p>
 * @author flash
 *
 */
public enum Protocol implements Serializable{
	
	/** <strong>ICMP Protocol</strong>
	 * <p>
	 * There is no TCP or UDP port number associated with ICMP packets as these numbers are associated with the transport layer above.
	 * However, the port <code>1</code> is assigned as it's the <em>"reserved"</em> port as of 
	 * <a href="https://tools.ietf.org/html/rfc792">RFC792</a> specification.
	 * </p>*/
	ICMP(	"icmp", 	"", 	1),
	
	/**
	 * Hypertext Transfer Protocol.
	 */
	HTTP(	"http",		"://",	80),
	
	/**
	 * Hypertext Transfer Protocol Secure.
	 */
	HTTPS(	"https",	"://",	443),
	
	/**
	 * File Transfer Protocol.
	 */
	FTP(	"ftp",		"://",	21),
	
	/**
	 * Secure Shell Protocol.
	 * 
	 * @see {@link Protocol#SFTP}
	 * @see {@link Protocol#SCP}
	 */
	SSH(	"ssh",		"://",	22),
	
	/**
	 * SSH over File Transfer Protocol.
	 * <p>This protocol uses SSH as the secure communication layer,
	 * therefore, it uses he same port as {@link Protocol#SSH}.</p>
	 * <p>Don't confuse it with {@link Protocol#FTPS} 
	 * which stands for FTP over TLS.</p>
	 */
	SFTP(	"sftp",		"://",	22),
	
	/** 
	 * Secure Copy Protocol.
	 * <p>This protocol uses SSH as the secure communication layer,  
	 * therefore, it uses he same port as {@link Protocol#SSH}.</p>
	 */
	SCP(	"scp",		"://",	22),
	
	/**
	 * FTP Secure. Also known as FTP over TLS.
	 * <p>This protocol uses TLS/SSL as the secure communication layer.</p>
	 * <p>Don't confuse it with {@link Protocol#SFTP} 
	 * which stands for SSH over FTP.</p>
	 */
	FTPS("ftps",		"://",	990);
	
	private String name;
	
	private String separator;
	private Integer defaultPort;
	
	/**
	 * Default private constructor for the enum.
	 * @param name
	 * @param separator
	 */
	private Protocol(String name, String separator, Integer defaultPort) {
		this.name = name;
		this.separator = separator;
		this.defaultPort = defaultPort;
	}

	/**
	 * Gets the name of the protocol (IE: http, https, ftp...)
	 * @return <code>String</code> - the protocol name.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Gets the default port of the protocol
	 * @return <code>Integer</code> - the protocol default port.
	 */
	public Integer getDefaultPort() {
		return defaultPort;
	}
	
	/**
	 * Gets the protocol fully qualified scheme.
	 * <p>
	 * For example, HTTP scheme: <code>"http://"</code>
	 * </p>
	 * @return <code>String</code> - the protocol scheme representation.
	 */
	public String getScheme() {
		return name + separator;
	}
}
