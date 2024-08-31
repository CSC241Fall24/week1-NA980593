public class Bulbasaur {
    private int id;
    private int level;

    public Bulbasaur(){
        this.id = 1;
        this.level = 1;
    }

    public Bulbasaur(int id, int level) {
        this.id = id;
        this.level = level;
    }

    public void setLevel(int level) {
        this.level = level;
        if(level<16){
            id = 1;
        }
        if(level>=16){
            id = 2;
        }
        if(level>=32){
            id = 3;
        }
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        if(id==1) {
            return "Bulbasaur";
        }
        if(id==2){
            return "Ivysaur";
        }
        return "Venusaur";
    }

    public int getID() {
        return id;
    }

    @Override
    public String toString() {
        return "Level: "+level+", ID: "+id;
    }

    public boolean equals(Bulbasaur obj) {
        return obj.getLevel() == level && obj.getID() == id;
    }
    public Bulbasaur copy(){
        return new Bulbasaur(id,level);
    }
}
