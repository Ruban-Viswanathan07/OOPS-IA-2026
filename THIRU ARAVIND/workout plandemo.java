abstract class WorkoutPlan {

    abstract void generatePlan();

    public static void main(String[] args) {

        WorkoutPlan plan = new CardioPlan();

        plan.generatePlan();
    }
}

class CardioPlan extends WorkoutPlan {

    @Override
    void generatePlan() {
        System.out.println("Cardio Workout Plan");
        System.out.println("1. Warm-up - 10 minutes");
        System.out.println("2. Running - 20 minutes");
        System.out.println("3. Cycling - 15 minutes");
        System.out.println("4. Cool-down - 5 minutes");
    }
}
