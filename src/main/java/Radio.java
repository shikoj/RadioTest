public class Radio {
    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation(int nextStation) {
        if (nextStation <9) {
            currentStation = nextStation +1;
        } else {
            currentStation = 0;
        }
    }
}
