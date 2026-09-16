class Member {
    String name;
    int membershipId;

    Member(String name, int membershipId) {
        this.name = name;
        this.membershipId = membershipId;
    }

    void display() {
        System.out.println("Member Name: " + name);
        System.out.println("Membership ID: " + membershipId);
    }
}

class PremiumMember extends Member {
    String personalTrainer;

    PremiumMember(String name, int membershipId, String personalTrainer) {
        super(name, membershipId);
        this.personalTrainer = personalTrainer;
    }

    @Override
    void display() {
        System.out.println("Member Name: " + name);
        System.out.println("Membership ID: " + membershipId);
        System.out.println("Personal Trainer: " + personalTrainer);
    }
}

class Main {
    public static void main(String[] args) {

        PremiumMember member =
                new PremiumMember("Ruban", 101, "Arun");

        member.display();
    }
}
