package weeks.week_14;

public class Lion {

        private double height;
        private double weight;
        private boolean ableToFly;
        private boolean ableToSwim;
        private boolean hasTail;


        public Lion() {
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public boolean isAbleToFly() {
            return ableToFly;
        }

        public void setAbleToFly(boolean ableToFly) {
            this.ableToFly = ableToFly;
        }

        public boolean isAbleToSwim() {
            return ableToSwim;
        }

        public void setAbleToSwim(boolean ableToSwim) {
            this.ableToSwim = ableToSwim;
        }

        public boolean isHasTail() {
            return hasTail;
        }

        public void setHasTail(boolean hasTail) {
            this.hasTail = hasTail;
        }

        public void runs(){
            System.out.println("Lion is running.");
        }

        public void eats(){
            System.out.println("Lion is eating.");
        }

        public void sleeps(){
            System.out.println("Lion is sleeping.");
        }

        public void roar(){
            System.out.println("Lion is roaring.");
        }
    }


