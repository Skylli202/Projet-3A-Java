package tools;

public class Date {
	private int mJour;
	private int mMois;
	private int mAnnee;
	
	public Date() {
		this.mJour = 1;
		this.mMois = 1;
		this.mAnnee = 1970;
	}
	
	public Date(int jour, int mois, int annee) throws DateException {

		if(checkJour(jour)) {
			this.mJour = jour;
		} else {
			throw new DateException();
		}
		
		if(checkMois(mois)) {
			this.mMois = mois;
		} else {
			throw new DateException();
		}
		
		if(checkAnnee(annee)) {
			this.mAnnee = annee;
		} else {
			throw new DateException();
		}
	}
	
	private boolean checkJour(int jour) {
		if(jour < 1)
			return false;
		if(jour > 31)
			return false;
		return true;
	}
	
	private boolean checkMois(int mois) {
		if(mois < 1)
			return false;
		if(mois > 12)
			return false;
		return true;
	}
	
	private boolean checkAnnee(int annee) {
		if(annee < 0)
			return false;
		if(annee > 2019)
			return false;
		return true;
	}

	public int getJour() {
		return mJour;
	}

	public void setJour(int mJour) {
		this.mJour = mJour;
	}

	public int getMois() {
		return mMois;
	}

	public void setMois(int mMois) {
		this.mMois = mMois;
	}

	public int getAnnee() {
		return mAnnee;
	}

	public void setAnnee(int mAnnee) {
		this.mAnnee = mAnnee;
	}

}
