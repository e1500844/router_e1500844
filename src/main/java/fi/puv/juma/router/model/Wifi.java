package fi.puv.juma.router.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the wifi database table.
 * 
 */
@Entity
@NamedQuery(name="Wifi.findAll", query="SELECT w FROM Wifi w")
public class Wifi implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int crypt;

	private int frag;

	private String iface;

	private int mics;

	private int missedbeacon;

	private int nwid;

	private int qlevel;

	private int qlink;

	private int retry;

	private int snr;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private String we2;

	public Wifi() {
	}

	public int getId() {
		return this.id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public int getCrypt() {
		return this.crypt;
	}

	public void setCrypt(int crypt) {
		this.crypt = crypt;
	}

	public int getFrag() {
		return this.frag;
	}

	public void setFrag(int frag) {
		this.frag = frag;
	}

	public String getIface() {
		return this.iface;
	}

	public void setIface(String iface) {
		this.iface = iface;
	}

	public int getMics() {
		return this.mics;
	}

	public void setMics(int mics) {
		this.mics = mics;
	}

	public int getMissedbeacon() {
		return this.missedbeacon;
	}

	public void setMissedbeacon(int missedbeacon) {
		this.missedbeacon = missedbeacon;
	}

	public int getNwid() {
		return this.nwid;
	}

	public void setNwid(int nwid) {
		this.nwid = nwid;
	}

	public int getQlevel() {
		return this.qlevel;
	}

	public void setQlevel(int qlevel) {
		this.qlevel = qlevel;
	}

	public int getQlink() {
		return this.qlink;
	}

	public void setQlink(int qlink) {
		this.qlink = qlink;
	}

	public int getRetry() {
		return this.retry;
	}

	public void setRetry(int retry) {
		this.retry = retry;
	}

	public int getSnr() {
		return this.snr;
	}

	public void setSnr(int snr) {
		this.snr = snr;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getWe2() {
		return this.we2;
	}

	public void setWe2(String we2) {
		this.we2 = we2;
	}

}