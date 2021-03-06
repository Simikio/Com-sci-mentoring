package interfaces;

class Bird implements Pet {
	public void chirp(){
	System.out.println("Chirp chirp goes the bird");
	}
	public static void main(String [] args) {
		Pet p = new Bird();
		p.chirp();
	}


}
