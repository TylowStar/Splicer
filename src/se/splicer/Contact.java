package se.splicer;

public class Contact
{  
	 public String id;
	 public String telno;
	 public String mobil;
	 public String enamn;
	 public String fnamn;
	 public String prefix;
	 public String rum;
	 public String titel;
	 public String userid;
	 public String orginisation;
	 public String stationeringsort;
	 public String email;
	 
	 public Contact(String id, String telno, String mobil, String enamn, String fnamn, String prefix, String rum,
			 String titel, String userid, String orginisation, String stationeringsort, String email)
	 {
		 this.id = id;
		 this.telno = telno;
		 this.mobil = mobil;
		 this.enamn = enamn;
		 this.fnamn = fnamn;
		 this.prefix = prefix;
		 this.rum = rum;
		 this.titel = titel;
		 this.userid = userid;
		 this.orginisation = orginisation;
		 this.stationeringsort = stationeringsort;
		 this.email = email;
	 }
	 
	 public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTelno() {
			return telno;
		}

		public void setTelno(String telno) {
			this.telno = telno;
		}

		public String getMobil() {
			return mobil;
		}

		public void setMobil(String mobil) {
			this.mobil = mobil;
		}

		public String getENamn() {
			return enamn;
		}

		public void setENamn(String enamn) {
			this.enamn = enamn;
		}

		public String getFNamn() {
			return fnamn;
		}

		public void setFNamn(String fnamn) {
			this.fnamn = fnamn;
		}

		public String getPrefix() {
			return prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getRum() {
			return rum;
		}

		public void setRum(String rum) {
			this.rum = rum;
		}

		public String getTitel() {
			return titel;
		}

		public void setTitel(String titel) {
			this.titel = titel;
		}

		public String getUserid() {
			return userid;
		}

		public void setUserid(String userid) {
			this.userid = userid;
		}

		public String getOrginisation() {
			return orginisation;
		}

		public void setOrginisation(String orginisation) {
			this.orginisation = orginisation;
		}

		public String getStationeringsort() {
			return stationeringsort;
		}

		public void setStationeringsort(String stationeringsort) {
			this.stationeringsort = stationeringsort;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	 
}
