package EX_01_28_03_2023;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver( Observer observer);
    void notifyObservers( String message);

}
