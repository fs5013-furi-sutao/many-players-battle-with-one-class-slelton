## 複数のプレーヤが戦うゲーム

- メソッドの中身の実装なし（スケルトン状態）
- main メソッドを持ったクラスのみで作成

## 作成メソッド

### main()

``` java
public static void main(String[] args) {
    List<String> playerNames = new ArrayList<>();
    List<Integer> playerHps = new ArrayList<>();
    int winnerIndx;

    initPlayerStatus(NUM_OF_PLAYERS, playerNames, playerHps);
    winnerIndx = battle(playerHps);
    showResult(winnerIndx, playerNames);
}
```

### initPlayerStatus(numOfPlayers, playerNames, playerHps)

``` java
private static void initPlayerStatus(int numOfPlayers,
        List<String> playerNames, List<Integer> playerHps) {

    playerNames = generatePlayerNames(numOfPlayers);
    playerHps = generatePlayerHps(numOfPlayers);
}
```

### battle(playerHps)

``` java
private static int battle(List<Integer> playerHps) {

    while (!isOnlyOneAlive(playerHps)) {
        List<Integer> attackerOrderList = generateAttackOrderList();
        fightWithOneRound(attackerOrderList, playerHps);
    }
    return extractWinnerIndx(playerHps);
}
```

### fightWithOneRound(attackerOrderList, playerHps)

``` java
private static void fightWithOneRound(List<Integer>attackerOrderList,
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
```
