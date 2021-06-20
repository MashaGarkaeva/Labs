package com.example.helloworld;


    public enum Sizes {
        XXS(32) {
            @Override
            public void getDescription() {
                System.out.println("Children clothes");
            }//детская одежда
        },
        XS(34),
        S(36),
        M(38),
        L(40);


        Sizes(int eurosize) {//конструктор дл eurosize
            this.Eurosize = eurosize;
        }

        public int getEurosize(){
            return (Eurosize);
        }

        public void getDescription() {
            System.out.println("Adult clothes");
        }//взрослая одежда
        private int Eurosize;
    }
    interface man_clothes{
        void dress_a_man();
    }
    interface female_clothes{
        void dress_a_female();
    }

        abstract class Wearable {//класс одежда
            Sizes size;
            int cost;
            String view;
            String name; //я добавил имя потому что безз него непонятно

           Wearable(Sizes size, int cost, String view, String name){
                this.size = size;
                this.cost = cost;
                this.view = view;
                this.name = name;
            }
        }

class Tshort extends Wearable implements man_clothes, female_clothes{     //Футболка
    Tshort(Sizes size, int cost, String view, String name) {
        super(size, cost, view, name);
    }
    public void dress_a_man(){}
    public void dress_a_female(){}
}
class Trousers extends Wearable implements man_clothes, female_clothes{     //штаны
    Trousers(Sizes size, int cost, String view, String name) {
        super(size, cost, view, name);
    }
    public void dress_a_man(){}
    public void dress_a_female(){}
}

class Skirt extends Wearable implements female_clothes{   //юбка
    Skirt(Sizes size, int cost, String view, String name) {
        super(size, cost, view, name);
    }
    public void dress_a_female(){}
}

class Tie extends Wearable implements man_clothes{    //галстук
    Tie(Sizes size, int cost, String view, String name) {
        super(size, cost, view, name); }
    public void dress_a_man(){ }
    }
class DressMaker{     //ателье
        void dress_a_man(Wearable [] wearable){
            System.out.println("*man clothes*");
            for (Wearable i : wearable) {
                if (i.name == "Tshort" || i.name == "trousers" || i.name == "tie")
                    System.out.println(i.name+"  "+i.size+"  "+i.cost+"  "+i.view);
            }
        }
    void dress_a_female(Wearable [] wearable){
        System.out.println("*female clothes*");
        for (Wearable i : wearable) {
            if (i.name == "Tshort" || i.name == "trousers" || i.name == "skirt")
                System.out.println(i.name+"  "+i.size+"  "+i.cost+"  "+i.view);
        }
    }
}

