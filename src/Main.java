public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);
        boss.setDefence("telekinesis");
        System.out.println("Урон: " + boss.getDamage() + "\nЗдоровье: " + boss.getHealth() +
                "\nТип защиты: " + boss.getDefence());
        createHeroes();

        for (int i = 0; i < createHeroes().length; i++) {


            System.out.println( "Суперспособность: " + createHeroes()[i].getSuperAbility());
            System.out.println( "Урон: " + createHeroes()[i].getDamage());
            System.out.println( "Здоровье: " + createHeroes()[i].getHealth());

        }
    }

    public static Hero[] createHeroes() {
        Hero flesh = new Hero(200,10,"speed");
        Hero ghost = new Hero(350,25,"invisibility");
        Hero blade = new Hero(300,30,"telekinesis");
        Hero defender[] = new Hero[]{flesh, ghost, blade};
        return defender;
    }
}