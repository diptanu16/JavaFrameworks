package classAndObject.Exercise3;

class Patient {

	String patientName;
	double height;
	double weight;
	
	Patient(String patientName, double height, double weight) {
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	
	double computeBMI() {
		return this.weight / (this.height * this.height);
	}

}
