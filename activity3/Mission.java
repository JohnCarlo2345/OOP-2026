import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mission {
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    public Mission() {
        Random random = new Random();
        String[] possibleTargets = {
            "Retrieve stolen data",
            "Infiltrate enemy base",
            "Rescue hostage",
            "Disable security system",
            "Deliver classified package",
        }

        missionTarget = possibleTargets[random.nextInt(possibleTargets.length)];
        difficulty = random.nextInt(10) + 1;
        int randomDays = random.nextInt(24) + 7;
        missionDeadline = LocalDate.now().plusDays(randomDays);
    }
    
    public String getMissionTarget() {
        return missionTarget;
    }

    public LocalDate getMissionDeadline() {
        return missionDeadline;
    }

    public int getDifficulty() {
        return difficulty;
    }
}