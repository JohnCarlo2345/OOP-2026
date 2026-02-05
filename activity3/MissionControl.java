import java.time.format.DateTimeFormatter;

public class MissionControl {
    public static void main(String[] args) {
        SecretAgent agent = new SecretAgent("007", "James Bond", 5);
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' HH:mm:ss");
        System.out.println("=== INITIAL AGENT STATUS ===");
        System.out.println("ID: " + agent.getAgentId());
        System.out.println("Name: " + agent.getAgentname());
        System.out.println("Clearance Level: " + agent.getClearanceLevel());
        System.out.println("On Mission: " + agent.isOnMIssion());
        System.out.println("Last Mission Completion Time: " + 
             (agent.getLastMissionCompletionTime() != null ?
                  agent.getLastMissionCompletionTime().format(timeFormatter) : "None"));
        System.out.println();
        Mission mission = new Mission();
        mission.displayMissionBriefing();
        System.out.println();
    }
}
