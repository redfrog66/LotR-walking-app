public class DistanceCalculator {
    static void steps_to_km(int steps) {
          int currentDistance = currentDistance(); 
          double oneStep = 1.2; /* proper value for the length of one step - future notes: adjusting this on the settings page */
          int newDistance = steps * oneStep;
          setNewCurrentDistance(currentDistance,newDistance);
        
    }

    static void currentDistance() {
        /* Csekkoljuk a linket, amit küldött Jani */
    }

    static void setNewCurrentDistance(double currentDistance, double NewDistance) {
            double NewCurrentDistance = currentDistance + NewDistance;
    }

}