public interface AInterface {
	public void a();
}

interface BInterface {
	public void b();
}

interface CInterface extends AInterface, BInterface{
	public void c(); 
}