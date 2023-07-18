public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHealth(500);

        boss.setDamage(100);

        boss.setDefenceType("Physical");

        System.out.println(boss.getHealth() + " | " + boss.getDamage() + " | " + boss.getDefenceType());





//         ДЗ НА СООБРАЗИТЕЛЬНОСТЬ

        Hero[] heroes = createHeroes();

        for (int x = 0; x < heroes.length; x++) {
            System.out.println("Hero: " + (x + 1) + ":");
            System.out.println("Health: " + heroes[x].getHealth());
            System.out.println("Damage: " + heroes[x].getDamage());
            System.out.println("Ability: " + heroes[x].getSuperAbility());
        }




    }

    public static Hero[] createHeroes(){

        Hero hero1 = new Hero(600, 15, "Physical");

        Hero hero2 = new Hero(500, 10);

        Hero hero3 = new Hero(100, 30, "Flame");

        Hero[] heroes = {hero1, hero2, hero3};

        return heroes;



    }

}