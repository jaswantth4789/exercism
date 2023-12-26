public class CarsAssemble {

        

          


        

          

    public double productionRatePerHour(int speed) {

        

          

        return 221.0 * speed * successRate(speed);

        

          

    }

        

          


        

          

    public int workingItemsPerMinute(int speed) {

        

          

        return ((int)productionRatePerHour(speed)) / 60;

        

          

    }

        

          


        

          

    public double successRate(int speed) {

        

          

        if(speed >= 1 && speed <= 4){

        

          

            return 1.0;

        

          

        } else if (speed >= 5 && speed <= 8) {

        

          

            return 0.9;

        

          

        } else if(speed == 9) {

        

          

            return 0.8;

        

          

        }else if (speed == 10) {

        

          

            return 0.77;

        

          

        }

        

          

        return 0;

        

          

    }

        

          

}