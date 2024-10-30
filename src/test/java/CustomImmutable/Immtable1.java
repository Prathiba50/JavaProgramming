package CustomImmutable;

public final class Immtable1 {

        private final int price;
        private final String name;

        public Immtable1(int Price, String Name){
            this.name = Name;
            this.price = Price;
        }

        public int getPrice(){
            return price;
        }

        public String getName(){
            return name;
        }
}

