package activity3;

import java.time.LocalDateTime;

public class SecretAgent {
    private String agentId;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletionTime;

    public SecretAgent(String agentId, String codename, int clearanceLevel) {
        this.agentId = agentId;
        this.codename = codename;
        this.clearanceLevel = clearanceLevel;
        this.onMission = false;
        this.lastMissionCompletionTime = null;
    }

    public String getAgentId() {
        return agentId;
    }

    public String getCodename() {
        return codename;
    }

    public int getClearanceLevel() {
        return clearanceLevel;
    }

    public boolean getOnMission() {
        return onMission;
    }
    
    public LocalDateTime getLastMissionCompletionTime() {
        return lastMissionCompletionTime;
    }

    public void setcodename(String newcodename) {
        this.codename = newcodename;
        
    }


}

