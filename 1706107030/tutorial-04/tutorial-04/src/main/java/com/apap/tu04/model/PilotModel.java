package com.apap.tu04.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;
import javax.persistence.CascadeType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.apap.tu04.FlightModel;


@Entity
@Table(name = "pilot")
public class PilotModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "license_number", nullable = false, unique = true)
	private String licenseNumber;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "name", nullable = false)
	private String name;
	
	@NotNull
	@Column(name = "fly_hour", nullable = false)
	private int flyHour;

	@OneToMany(mappedBy = "pilot", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private List<FlightModel>pilotFlight;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFlyHour() {
		return flyHour;
	}

	public void setFlyHour(int flyHour) {
		this.flyHour = flyHour;
	}

	public List<FlightModel> getPilotFlight() {
		return pilotFlight;
	}

	public void setPilotFlight(List<FlightModel> pilotFlight) {
		this.pilotFlight = pilotFlight;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}