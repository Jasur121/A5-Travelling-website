import java.util.ArrayList;


public class  ListOfTours {
    private ArrayList<Tour> tourList = new ArrayList<>();




    public void addTour(Tour tour) {
        if (!findTour(tour)) {
            tourList.add(tour);
        } else {
            System.out.println("The tour is already in the bag");
        }
    }

    public boolean findTour(Tour tour) {
        for (Tour t : tourList) {
            if (tour.getName().equalsIgnoreCase(t.getName())) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Tour> findTour(TourSpec tourSpec) {
        ArrayList<Tour> list = new ArrayList<>();
        for (Tour t : tourList) {
            if (tourSpec.equals(t.getTourSpec())) {
                list.add(t);
            }
        }
        return list;
    }



    public void printListOfChosenTours() {
        System.out.println("I have " + tourList.size() + " tours in bag");
        for (int i = 0; i < tourList.size(); i++) {
            System.out.println((i + 1) + ". " + tourList.get(i));
        }
    }
}



