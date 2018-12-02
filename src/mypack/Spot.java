package mypack;
/**
 * @Date: December 2nd 2018
 * @author Adam Mashiah & Ron Sider
 *@
 */
public class Spot {
	private String Mac;
	private String ssid;
	private String AuthMode;
	private String Firstseen;
	private int channel;
	private int rssi;
	private double cla;//currentlattitude
	private double clo;//currentlottitude
	private double attitude;
	private int curresy ;
	private String type;
	
	public Spot(String mac, String ssid, String authMode, String firstseen, int channel, int rssi, double cla, double clo,
			double attitude, int curresy, String type) {
		super();
		Mac = mac;
		this.ssid = ssid;
		this.AuthMode = authMode;
		this.Firstseen = firstseen;
		this.channel = channel;
		this.rssi = rssi;
		this.cla = cla;
		this.clo = clo;
		this.attitude = attitude;
		this.curresy = curresy;
		this.type = type;
	}
	public String getMac() {
		return Mac;
	}
	public void setMac(String mac) {
		Mac = mac;
	}
	public String getSsid() {
		return ssid;
	}
	public void setSsid(String ssid) {
		this.ssid = ssid;
	}
	public String getAuthMode() {
		return AuthMode;
	}
	public void setAuthMode(String authMode) {
		AuthMode = authMode;
	}
	public String getFirstseen() {
		return Firstseen;
	}
	public void setFirstseen(String firstseen) {
		Firstseen = firstseen;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getRssi() {
		return rssi;
	}
	public void setRssi(int rssi) {
		this.rssi = rssi;
	}
	public double getCla() {
		return cla;
	}
	public void setCla(double cla) {
		this.cla = cla;
	}
	public double getClo() {
		return clo;
	}
	public void setClo(double clo) {
		this.clo = clo;
	}
	public double getAttitude() {
		return attitude;
	}
	public void setAttitude(double attitude) {
		this.attitude = attitude;
	}
	public int getCurresy() {
		return curresy;
	}
	public void setCurresy(int curresy) {
		this.curresy = curresy;
	}
	public String getType() {
		return type;
		
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Spot [Mac=" + Mac + ", ssid=" + ssid + ", AuthMode=" + AuthMode + ", Firstseen=" + Firstseen + ", channel="
				+ channel + ", rssi=" + rssi + ", cla=" + cla + ", clo=" + clo + ", attitude=" + attitude + ", curresy="
				+ curresy + ", type=" + type + "]";
	}

}
