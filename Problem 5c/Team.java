public class Team {
    private int code;
    private List<Player> players;

    // no-argument constructor
    public Team() {
        code = 0;
        players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }
}
