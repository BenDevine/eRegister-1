package uk.ac.shu.webarch.eregister

class RegisterEntry {

	Student student
	Long timestamp

	static constraints = {
	timestamp(nullable: false, blank:false);
}

    static mapping = {
	table 'student_register_entry'
	student column: 'student fk'
 }
}
