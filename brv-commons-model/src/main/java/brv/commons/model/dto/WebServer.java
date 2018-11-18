package brv.commons.model.dto;

import java.io.Serializable;

public class WebServer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String ip = "";
	private String hostname = "";
	private int port;
	
	
	public WebServer() {
		
	}
	
	public WebServer(String ip, String hostname, int port) {
		this.ip = ip;
		this.hostname = hostname;
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHostname() {
		return hostname;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WebServer other = (WebServer) obj;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WebServer [ip=" + ip + ", hostname=" + hostname + ", port=" + port + "]";
	}
	
	
	
}
