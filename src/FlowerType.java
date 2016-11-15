public enum FlowerType {
    ROMASHKA, MAK, ROZA, TULPAN;
    public String toString(){
        switch (this){
            case ROMASHKA:
                return "Romashka";
            case MAK:
                return "Mak";
            case ROZA:
                return "Roza";
            case TULPAN:
                return "Tulpan";
            default:
                return "Non type flower";
        }
    }
}