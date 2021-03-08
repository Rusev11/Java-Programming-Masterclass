package Teams;

public class Main {
    public static void main(String[] args) {
//        FootballPlayer beckham = new FootballPlayer("Beckham");
//        BaseballPlayer pat = new BaseballPlayer("Pat");
//        BasketballPlayer joe = new BasketballPlayer("Joe");
//
//        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//        adelaideCrows.addPlayer(beckham);
//
//        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
//        baseballTeam.addPlayer(pat);
//
//        Team<BasketballPlayer> basketballTeam = new Team<>("Miami Heats");
//        basketballTeam.addPlayer(joe);
//
//        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
//        FootballPlayer bank = new FootballPlayer("Gordon");
//
//        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
//        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
//
//        hawthorn.matchResult(fremantle, 1, 0);
//        hawthorn.matchResult(adelaideCrows, 3, 8);
//
//        adelaideCrows.matchResult(fremantle, 2, 1);
//
//        System.out.println("Rankings");
//        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
//        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
//        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
//        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
//
//        System.out.println(adelaideCrows.compareTo(melbourne));
//        System.out.println(adelaideCrows.compareTo(hawthorn));
//        System.out.println(hawthorn.compareTo(adelaideCrows));
//        System.out.println(melbourne.compareTo(fremantle));

        League<Team<FootballPlayer>> footballLeague = new League<>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BasketballPlayer> basketballTeam = new Team<>("Miami Heats");

        footballLeague.add(adelaideCrows);
        footballLeague.add(melbourne);
        footballLeague.add(hawthorn);
        footballLeague.add(fremantle);

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);
        adelaideCrows.matchResult(fremantle, 2, 1);

        footballLeague.showLeagueTable();
    }
}
