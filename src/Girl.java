public class Girl {

    private  String girl_name;
   private Diamond girlDiamond;

    public Girl(String name) {
        girl_name = name;
        girlDiamond = new Diamond();
    }

    public String printCurrentDiamond() {
        if (girlDiamond.getSize() > 0) {
            return girl_name + " has a diamond, " + girlDiamond.getSize() + " carats, worth " + girlDiamond.getValue();
        } else {
            return girl_name + " has no best friend";
        }
    }

    public boolean CompareDiamondOffer(int diamond_size, double diamond_value) {
        boolean betterOffer = false;
        if (diamond_size > girlDiamond.getSize() && diamond_value > girlDiamond.getValue()) {
            betterOffer = true;
        }
        return betterOffer;
    }

    public void AcceptDiamondOffer(int diamond_size, double diamond_value) {
        girlDiamond = new Diamond(diamond_size, diamond_value);
    }

}
