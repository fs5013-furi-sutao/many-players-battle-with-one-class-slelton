import java.util.ArrayList;
import java.util.List;

public class ManyPlayersBattleWithOneClass {
    private static final int NUM_OF_PLAYERS = 3;

    public static void main(String[] args) {
        List<String> playerNames = new ArrayList<>();
        List<Integer> playerHps = new ArrayList<>();
        int winnerIndx;

        initPlayerStatus(NUM_OF_PLAYERS, playerNames, playerHps);
        winnerIndx = battle(playerHps);
        showResult(winnerIndx, playerNames);
    }

    private static void showResult(int winnerIndx, List<String> playerNames) {
    }

    private static int battle(List<Integer> playerHps) {
        while (!isOnlyOneAlive(playerHps)) {
            List<Integer> attackerOrderList = generateAttackOrderList();
            fightWithOneRound(attackerOrderList, playerHps);
        }
        return extractWinnerIndx(playerHps);
    }

    private static int extractWinnerIndx(List<Integer> playerHps) {
        return 0;
    }

    private static boolean isOnlyOneAlive(List<Integer> playerHps) {
        return false;
    }

    private static void fightWithOneRound(List<Integer> attackerOrderList,
            List<Integer> playerHps) {
        for (int attackerOrderIndx : attackerOrderList) {
            int enemyIndx = selectEnemyIndx(attackerOrderIndx);
            int damage = calcDamage();
            updateHps(enemyIndx, damage);
            if (isOnlyOneAlive(playerHps)) {
                return;
            }
        }
    }

    private static void updateHps(int enemyIndx, int damage) {
    }

    private static int calcDamage() {
        return 0;
    }

    private static int selectEnemyIndx(int attackerOrderIndx) {
        return 0;
    }

    private static List<Integer> generateAttackOrderList() {
        return null;
    }

    private static void initPlayerStatus(int numOfPlayers,
            List<String> playerNames, List<Integer> playerHps) {
        playerNames = generatePlayerNames(numOfPlayers);
        playerHps = generatePlayerHps(numOfPlayers);
    }

    private static List<Integer> generatePlayerHps(int numOfPlayers) {
        return null;
    }

    private static List<String> generatePlayerNames(int numOfPlayers) {
        return null;
    }
}
