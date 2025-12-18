public class BattleArena {

    public Character battleGround(Character p1, Character p2) {

        System.out.println("\n🎮 MATCH STARTED");
        System.out.println("🆚 " + p1.getName() + " vs " + p2.getName());
        System.out.println("----------------------------------");

        int round = 1;

        do {
            System.out.println("\n🔁 ROUND " + round++);
            System.out.println("❤️ " + p1.getName() + ": " + p1.getHealth()
                    + " | 🧪 Heals: " + p1.getHeals());
            System.out.println("❤️ " + p2.getName() + ": " + p2.getHealth()
                    + " | 🧪 Heals: " + p2.getHeals());

            System.out.println("\n▶ ACTION");

            p1.attack(p2);
            if (!p2.isAlive()) break;
            if (p2.getHealth() < 30) p2.heal();

            p2.attack(p1);
            if (!p1.isAlive()) break;
            if (p1.getHealth() < 30) p1.heal();

            sleep();

        } while (p1.isAlive() && p2.isAlive());

        System.out.println("\n🏁 MATCH OVER");
        System.out.println("----------------------------------");

        Character winner = p1.isAlive() ? p1 : p2;
        System.out.println("🏆 WINNER: " + winner.getName());

        return winner;
    }

    private void sleep() {
        try {
            Thread.sleep(800);
        } catch (InterruptedException ignored) {}
    }
}
