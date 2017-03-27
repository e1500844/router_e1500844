package fi.puv.juma.router.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the upstream database table.
 * 
 */
@Entity
@NamedQuery(name="Upstream.findAll", query="SELECT u FROM Upstream u")
public class Upstream implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int chan;

	private double pow;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	public Upstream() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getChan() {
		return this.chan;
	}

	public void setChan(int chan) {
		this.chan = chan;
	}

	public double getPow() {
		return this.pow;
	}

	public void setPow(double pow) {
		this.pow = pow;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

}