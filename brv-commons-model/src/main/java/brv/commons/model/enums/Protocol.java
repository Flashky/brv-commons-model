package brv.commons.model.enums;

import java.io.Serializable;

/**
 * Protocol enumeration
 * <p>
 * Each enum value stores its name (IE: http), the scheme (IE: ://) and the default port (IE: 80).<br>
 * </p>
 * <p>
 * Additional information on protocols:<br>
 * @see <a href="https://www.iana.org/assignments/protocol-numbers/protocol-numbers.xhtml">Protocol numbers</a>
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
	HTTP(	"http",		"://",	80),
	HTTPS(	"https",	"://",	443),
	FTP(	"ftp",		"://",	21);
	
	
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
