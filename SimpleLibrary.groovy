public class SimpleLibrary {

	public log
	public context
	public testRunner

	public SimpleLibrary(vlog, vcontext, vtestRunner)
	{
	log = vlog
	context = vcontext
	testRunner = vtestRunner
	}
	def asserted(String str1, String str2) {
	if(str1.equals(str2)) {
		log.info "Assertion Passed - Groovy Library"
	}
	else{
		log.info "Assertion Failed with Issue - Groovy Library"
	}
	}
}
