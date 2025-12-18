public class BattleArena {

    public Character battleGround(Character plya, Character plyb) {

        System.out.println("\n⚔️  BATTLE STARTS ⚔️");
        System.out.println(plya.getName() + "  VS  " + plyb.getName());
        System.out.println("----------------------------------");

        int round = 1;

        do {
            System.out.println("\n🔁 Round " + round++);
            System.out.println("❤️  " + plya.getName() + ": " + plya.getHealth());
            System.out.println("❤️  " + plyb.getName() + ": " + plyb.getHealth());

            System.out.println("\n👉 " + plya.getName() + " attacks " + plyb.getName());
            plyb.takeDamage(plya.getAttack());

            if (!plyb.isAlive()) break;

            System.out.println("👉 " + plyb.getName() + " attacks " + plya.getName());
            plya.takeDamage(plyb.getAttack());

        } while (plya.isAlive() && plyb.isAlive());

        System.out.println("\n🏁 BATTLE ENDS");
        System.out.println("----------------------------------");

        if (plya.isAlive()) {
            System.out.println("🏆 Winner: " + plya.getName());
            return plya;
        } else if (plyb.isAlive()) {
            System.out.println("🏆 Winner: " + plyb.getName());
            return plyb;
        } else {
            System.out.println("🤝 It's a Draw!");
            return null;
        }
    }
}
