
public interface IntefaceObservable {

	public void addObserver(InterfaceObserver observer);

	public void removeObserver(InterfaceObserver observer);

	public void notify(String message);

}
