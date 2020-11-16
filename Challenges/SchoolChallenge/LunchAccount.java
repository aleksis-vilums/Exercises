public class LunchAccount {

    private String name;
    private int id, lunchBought, totalSpent;
    private int bonusCounter = 0;
    private double balance, price, money;
    private boolean bonus = true;

    LunchAccount(String name, int id, double balance){
        this.name = name;
        this.id = id;

        addBalance(balance);

    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getbalance(){
        return balance;
    }

    public int getLunchBought(){
        return lunchBought;
    }

    public int getTotalSpent(){
        return totalSpent;
    }

    public void addBalance(double money){
        balance += money;

        if (bonusCounter <= 100 && bonus){
            balance += 20;
            bonus = false;
        }
    
    }

    public void buying(double price){
        if (balance >= price){
            balance -= price;
            lunchBought += 1;
            totalSpent += price;
        }
    }

    public String toString(){
		String student = new String(name + "\nId: " + id + "\nBalance: " + balance + "\n");
		
		return student;
	}



}