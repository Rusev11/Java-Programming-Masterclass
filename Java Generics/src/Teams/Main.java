package Teams;

public class Main {
    public static void main(String[] args) {
        FootballPlayer beckham = new FootballPlayer("Beckham");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        BasketballPlayer joe = new BasketballPlayer("Joe");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(beckham);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<BasketballPlayer> basketballTeam = new Team<>("Miami Heats");
        basketballTeam.addPlayer(joe);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer bank = new FootballPlayer("Gordon");

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

    }
}
