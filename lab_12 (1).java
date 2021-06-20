package com.example.helloworld;

    public class lab_12 {
        public static void main(String[] args) {

            Tshort tshort = new Tshort(Sizes.XXS, 600, "grey", "Tshort");
            Trousers trousers = new Trousers(Sizes.S, 1700, "blue", "trousers");
            Skirt skirt = new Skirt(Sizes.XS, 1000, "red", "skirt");
            Tie tie = new Tie(Sizes.M, 420, "SkyBlue", "tie");

            Wearable [] wearable= new Wearable[] {
                tshort, trousers, skirt, tie
            };

            for (Sizes size : Sizes.values()) {
                printInfo(size);
            }
            System.out.println("\n");
            DressMaker dressMaker = new DressMaker();
            dressMaker.dress_a_man(wearable);
            System.out.println("\n");
            dressMaker.dress_a_female(wearable);

        }

        public static void printInfo(Sizes size) {
            System.out.printf("%s,%d ", size, size.getEurosize());
            size.getDescription();
        }
    }
