public class Main{
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            if (data[0].equals("Acquaintance")) {
                Acquaintance acquaintance = new Acquaintance(data[1]);
                acquaintance.getStatus();
            } else if (data[0].equals("Friend")) {
                Friend friend = new Friend(data[1], data[2]);
                friend.getStatus();
            } else if (data[0].equals("BestFriend")) {
                BestFriend bestFriend = new BestFriend(data[1], data[2], data[3]);
                bestFriend.getStatus();
            }
        }
    }
}
// Base class
class Acquaintance {
    protected String name;

    Acquaintance(String name) {
        this.name = name;
    }

    public void getStatus() {
        System.out.println(name + " is just an acquaintance.");
    }
}

class Friend extends Acquaintance {
    protected String homeTown;

    Friend(String name, String homeTown) {
        super(name);
        this.homeTown = homeTown;
    }

    @Override
    public void getStatus() {
        System.out.println(name + " is a friend and he is from " + homeTown + ".");
    }
}

class BestFriend extends Friend {
    private String favoriteSong;

    BestFriend(String name, String homeTown, String favoriteSong) {
        super(name, homeTown);
        this.favoriteSong = favoriteSong;
    }

    @Override
    public void getStatus() {
        System.out.println(name + " is my best friend. He is from " + homeTown + " and his favorite song is " + favoriteSong + ".");
    }
}

