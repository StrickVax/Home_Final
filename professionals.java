package Home_Final;

// File which return's the profession's hourly rates in USD
interface professionals {
    int getCost();
}

class Painters implements professionals {

    public int getCost() {
        return 10;
    }
}

class Remodelers implements professionals {

    public int getCost() {
        return 15;
    }
}

class Constructors implements professionals {

    public int getCost() {
        return 16;
    }
}

class Designers implements professionals {

    public int getCost() {
        return 18;
    }
}

class Electricians implements professionals {

    public int getCost() {
        return 20;
    }
}